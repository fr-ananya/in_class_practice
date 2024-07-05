package assignmentPrep;

public class Author {
	
	private String authorId;
	private String name;
	private String nationality;
	
	public Author(String authorId, String name, String nationality) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.nationality = nationality;
	}
	
	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		
		
		
		return authorId;
		
	}

	
}


//Attributes: authorId (String), name (String), nationality (String)
//•	Override toString() method to provide a meaningful string representation of an author.
//3.	Library Class
