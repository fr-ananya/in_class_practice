package assignmentPrep;
	
import java.util.*;

public class Library implements Comparator<Book> {
    private Set<Book> books = new HashSet<>();
    private Set<Author> authors = new HashSet<>();
    private Map<String, List<Book>> borrowRecords = new HashMap<>();

    public void displayBooks() {
    	System.out.println("Displaying books" );
    	for(Book b: books) {
    		b.toString();
    	}
    }
    
//    public void displayAuthor() {
//    	System.out.println("Displaying books" );
//    	for(Book b: books) {
//    		b.toString();
//    	}
//    }
    
    
    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(String bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId().equals(bookId)) {
                iterator.remove();
                System.out.println("Removed book with ID: " + bookId);
                return;
            }
        }
        System.out.println("Book with ID: " + bookId + " not found.");
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void findBooksByAuthor(String authorName) {
        for (Book book : books) {
            if (book.getAuthor().equals(authorName)) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String userId, String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                borrowRecords.putIfAbsent(userId, new ArrayList<>());
                borrowRecords.get(userId).add(book);
                System.out.println("Book with ID " + bookId + " borrowed by user " + userId);
                return;
            }
        }
        System.out.println("Book with ID: " + bookId + " not found.");
    }

    public void returnBook(String userId, String bookId) {
        List<Book> borrowedBooks = borrowRecords.getOrDefault(userId, new ArrayList<>());
        Iterator<Book> iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId().equals(bookId)) {
                iterator.remove();
                System.out.println("Book with ID " + bookId + " returned by user " + userId);
                return;
            }
        }
        System.out.println("User " + userId + " hasn't borrowed book with ID: " + bookId);
    }

    public void getBooksBorrowedByUser(String userId) {
        List<Book> borrowedBooks = borrowRecords.getOrDefault(userId, new ArrayList<>());
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    
	@Override
	public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPublishedYear(), o2.getPublishedYear());
    }

    public void sortBooksByPublishedYear() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, this);
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}



//Attributes: books (Set<Book>), authors (Set<Author>), borrowRecords (Map<String, List<Book>>)
//•	Methods:

//•	addBook(Book book): Adds a book to the library.
//•	removeBook(String bookId): Removes a book from the library by bookId.
//•	addAuthor(Author author): Adds an author to the library.

//•	findBooksByAuthor(String authorName): Returns a list of books by a specific author.
//•	borrowBook(String userId, String bookId): Allows a user to borrow a book.
//•	returnBook(String userId, String bookId): Allows a user to return a book.
//•	getBooksBorrowedByUser(String userId): Returns a list of books borrowed by a specific user.
//•	sortBooksByPublishedYear(): Returns a list of books sorted by publishedYear using a custom Comparator.

