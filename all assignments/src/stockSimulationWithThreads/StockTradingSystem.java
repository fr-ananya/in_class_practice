package stockSimulationWithThreads;
import java.util.concurrent.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class StockTradingSystem {

    // Shared resources
    private static final ConcurrentHashMap<String, Double> stockPrices = new ConcurrentHashMap<>();
    private static final BlockingQueue<String> orderQueue = new LinkedBlockingQueue<>();
    private static final List<String> tradingLog = Collections.synchronizedList(new ArrayList<>());
    private static final AtomicBoolean running = new AtomicBoolean(true);

    public static void main(String[] args) {

        // StockFetcher thread
        Thread stockFetcher = new Thread(() -> {
            Random random = new Random();
            while (running.get()) {
                try {
                    // Simulate fetching stock prices
                    stockPrices.put("AAPL", 150 + random.nextDouble() * 10);
                    stockPrices.put("GOOGL", 2800 + random.nextDouble() * 50);
                    stockPrices.put("AMZN", 3300 + random.nextDouble() * 50);
                    Thread.sleep(1000); // Fetch prices every second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // TradeProcessor thread
        Thread tradeProcessor = new Thread(() -> {
            while (running.get()) {
                try {
                    // Process orders from the queue
                    String order = orderQueue.take();
                    String[] parts = order.split(",");
                    String type = parts[0];
                    String stock = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    double price = stockPrices.getOrDefault(stock, 0.0);

                    // Simulate processing the order
                    String logEntry = type + " " + quantity + " shares of " + stock + " at $" + price;
                    tradingLog.add(logEntry);
                    System.out.println("Processed order: " + logEntry);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // ReportGenerator thread
        Thread reportGenerator = new Thread(() -> {
            while (running.get()) {
                try {
                    // Generate report every 10 seconds
                    Thread.sleep(10000);
                    System.out.println("Generating report...");
                    synchronized (tradingLog) {
                        for (String log : tradingLog) {
                            System.out.println(log);
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // OrderProducer thread
        Thread orderProducer = new Thread(() -> {
            Random random = new Random();
            String[] stocks = {"AAPL", "GOOGL", "AMZN"};
            String[] types = {"BUY", "SELL"};
            while (running.get()) {
                try {
                    // Simulate generating trade orders
                    String type = types[random.nextInt(types.length)];
                    String stock = stocks[random.nextInt(stocks.length)];
                    int quantity = 1 + random.nextInt(10);
                    String order = type + "," + stock + "," + quantity;
                    orderQueue.put(order);
                    Thread.sleep(500); // Generate orders every 500 milliseconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start all threads
        stockFetcher.start();
        tradeProcessor.start();
        reportGenerator.start();
        orderProducer.start();

        // Allow the system to run for 1 minute for demonstration purposes
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Stop all threads
        running.set(false);

        // Wait for all threads to finish
        try {
            stockFetcher.join();
            tradeProcessor.join();
            reportGenerator.join();
            orderProducer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("System shutdown.");
    }
}
