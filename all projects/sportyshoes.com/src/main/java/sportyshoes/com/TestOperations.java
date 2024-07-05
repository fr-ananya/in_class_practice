package sportyshoes.com;

import model.*;
import repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

import java.util.List;



 
@SpringBootApplication
@ComponentScan(basePackages = "sportyshoes.com")
public class TestOperations implements CommandLineRunner {

	  @Autowired
	    private ShoesRepository shoesRepository; // Adjusted repository injection

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

   

    public static void main(String[] args) {
        SpringApplication.run(TestOperations.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddAndGetProducts();
        testAddAndGetUsers();
        testAddAndGetAdmins();
        testAddAndGetPurchaseRecords();
    }

    private void testAddAndGetProducts() {
        System.out.println("Testing Add and Get Products...");

        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(100.0);
        shoesRepository.save(product);

        List<Product> products = shoesRepository.findAll();
        System.out.println("Products: " + products);
    }

    private void testAddAndGetUsers() {
        System.out.println("Testing Add and Get Users...");

        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("testuser@example.com");
        userRepository.save(user);

        List<User> users = userRepository.findAll();
        System.out.println("Users: " + users);
    }

    private void testAddAndGetAdmins() {
        System.out.println("Testing Add and Get Admins...");

        Admin admin = new Admin();
        admin.setUsername("adminuser");
        admin.setPassword("adminpass");


        adminRepository.save(admin);

        List<Admin> admins = adminRepository.findAll();
        System.out.println("Admins: " + admins);
    }

    private void testAddAndGetPurchaseRecords() {
        System.out.println("Testing Add and Get Purchase Records...");

        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");
        user.setEmail("testuser@example.com");
        userRepository.save(user);

        Product shoes = new Product();
        shoes.setName("Test Shoes");
        shoes.setPrice(100.0);
        shoesRepository.save(shoes);

        // Use LocalDate for setting purchase date
        LocalDate purchaseDate = LocalDate.now();

        Purchase purchase = new Purchase();
        purchase.setProduct(shoes);
        purchase.setUser(user);
        purchase.setPurchaseDate(purchaseDate); // Set purchase date using LocalDate
        // Since there's no PurchaseRepository, we're not saving the purchase entity

        System.out.println("Purchase: " + purchase);
    }
}
