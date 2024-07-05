import java.io.File;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
// import java.util.Arrays;
// import java.util.HashMap;
import java.util.Scanner;

public class FileManagement {

    private static final String currentLocation = System.getProperty("user.dir");

    private static final String FILES_DIRECTORY = currentLocation + "/src/files/";


    public static void main(String[] args) {
       
        System.out.println("\nWelcome to LockedMe File Management System!");
        System.out.println("Application Name: LockedMe.com");
        System.out.println("Developed by: Ananya Sharma");
    
        while(true){

            while (true) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("\nMAIN MENU\nPlease select an option: \n1. Show All Files\n2. Business Operations \n3. Exit Application");

                try {
                    int option = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("You entered: " + option);
                    
                    switch (option) {
                        case 1:
                            listFiles();
                            break;
                        case 2:
                            businessOperations();
                            break;
                        case 3:
                            scanner.close();
                            closeApplication();
                            return;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    }
                    break; 


                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    
                } catch (NoSuchElementException e) {
                    System.out.println("No more input available.");
                    
                } catch (IllegalStateException e) {
                    System.out.println("Scanner is closed.");
                    
                }
            }
        
        }

       
    }

    private static void businessOperations() {
        

        while (true) {
            // this while loop doesn't end till it gets "return to main menu"

            while(true){
                // this while loop ends whenever any input is received.
                // this is to keep the menu open until a choice is made.
                

                Scanner scanner = new Scanner(System.in);
                System.out.println("\nFile Operations:");
                System.out.println("1. Add a file");
                System.out.println("2. Delete a file");
                System.out.println("3. Search for a file");
                System.out.println("4. Return to main menu");

                System.out.print("Enter your choice: ");

                try {
                    int option = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("You entered: " + option);
                            
                    String fileName ="";

                    switch (option) {
                        case 1:
                            System.out.print("Enter file name to add: ");
                            fileName = scanner.nextLine();
                            addFile(fileName);
                            break;
                        case 2:
                            System.out.print("Enter file name to delete: ");
                            fileName = scanner.nextLine();
                            deleteFile(fileName);
                            break;
                        case 3:
                            System.out.print("Enter file name to search: ");
                            fileName = scanner.nextLine();
                            searchFile(fileName);
                            break;
                        case 4:
                            System.out.println("Returning to main menu...");
                            return;
                            
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    }
                    
                    break; 


                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    
                } catch (NoSuchElementException e) {
                    System.out.println("No more input available.");
                    
                } catch (IllegalStateException e) {
                    System.out.println("Scanner is closed.");
                    
                }
            }
           
        }

    }

    private static void closeApplication() {
        System.out.println("Closing the application...");
        System.out.println("Thank you for using LockedMe File Management System!");
        System.exit(0);
    }

    public static void sortFilesCaseInsensitive(String[] files) {
        // implementing selection sort
        int n = files.length;
        for (int i = 0; i < n - 1; i++) {
            // find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (files[j].compareToIgnoreCase(files[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            String temp = files[minIndex];
            files[minIndex] = files[i];
            files[i] = temp;
        }
    }

    private static void listFiles() {
        System.out.println("Listing the files in ascending order: ");

        File directory = new File(FILES_DIRECTORY);
        
        String[] files = directory.list();

        if (files != null && files.length > 0) {
            // Arrays.sort(files, String.CASE_INSENSITIVE_ORDER); 
            // above in built function can be used to sort the files in case insensitve order.
            
            sortFilesCaseInsensitive(files);
            
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("No files found.");
        }
    }

    private static void addFile(String fileName) {
        
        
        File file = new File( FILES_DIRECTORY + fileName);
        
//        System.out.println("adding file : " + FILES_DIRECTORY);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
                System.out.println("Saved to location: " + file.getPath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    
    private static void deleteFile(String fileName) {
        File file = new File(FILES_DIRECTORY + fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File not found.");
        }
    }
    
    private static void searchFile(String fileName) {
        File file = new File(FILES_DIRECTORY + fileName);
        if (file.exists()) {
            System.out.println("File found.");
        } else {
            System.out.println("File not found.");
        }
    }
    
}
