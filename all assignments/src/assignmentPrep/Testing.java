package assignmentPrep;

public class Testing {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Add authors to the library
        Author author1 = new Author("1", "F. Scott Fitzgerald", "American");
        Author author2 = new Author("2", "Herman Melville", "American");
        Author author3 = new Author("3", "Harper Lee", "American");

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);

        // Add books to the library
        Book book1 = new Book("101", "The Great Gatsby", author1, 1925);
        Book book2 = new Book("102", "Moby Dick", author2, 1851);
        Book book3 = new Book("103", "To Kill a Mockingbird", author3, 1960);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

     // Display all books in the library
//        System.out.println("All Authors in the Library:");
//        library.displayBooks();
        
     // Display all books in the library
        System.out.println("All Books in the Library:");
        library.displayBooks();

        // Test borrowing and returning books
        library.borrowBook("User1", "101");
        library.borrowBook("User2", "102");
        library.borrowBook("User2", "103");

        library.returnBook("User1", "101");

        System.out.println("\nBooks borrowed by User1:");
        library.getBooksBorrowedByUser("User1");

        System.out.println("\nBooks borrowed by User2:");
        library.getBooksBorrowedByUser("User2");

        // Display books by a specific author
        System.out.println("\nBooks by Author Harper Lee:");
        library.findBooksByAuthor("Harper Lee");

        // Sort and display books by published year
        System.out.println("\nBooks sorted by Published Year:");
        library.sortBooksByPublishedYear();
        
        
        
    }
}

