package assignmentPrep;

//Attributes: bookId (String), title (String), author (Author), publishedYear (int)
//•	Implement Comparable<Book> to sort books by title.
//•	Override toString() method to provide a meaningful string representation of a book.

public class Book implements Comparable<Book> {
	private String bookId;
	private String title;
	private Author author;
	public Book(String bookId, String title, Author author, int publishedYear) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}



	private int publishedYear;
	
	
	
	public String getBookId() {
		return bookId;
	}



	public void setBookId(String bookId) {
		this.bookId = bookId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public int getPublishedYear() {
		return publishedYear;
	}



	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}



	@Override
	public int compareTo(Book o) {
	
		return this.title.compareTo(o.title);
	}
	
	

	@Override
	public String toString() {
		
		return String.format("Book Details\nID = %s Title = %s Author = %s Published Year = %d\n" , this.getBookId() ,this.getTitle(), this.getAuthor().getName() , this.getPublishedYear());
	}
	
	
}
