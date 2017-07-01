package prob2;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) return false;
		if(!this.getClass().getName().equals(obj.getClass().getName())) return false;
		Book tmp = (Book)obj;
		if(this.getIsbn().equals(tmp.getIsbn())
				&&this.getTitle().equals(tmp.getTitle())
				&&this.getAuthorFirstName().equals(tmp.getAuthorFirstName())
				&&this.getAuthorLastName().equals(tmp.getAuthorLastName()))
		{
			return true;
		}
		else return false;
	}
	
	
}
