package library;

public class Book {
	public String name;
	public String author;
	public String release;
	public String category;
	public boolean available;
	public String theBookIsWith;
	
	public Book(String name, String author, String release, String category) {
		this.name = name;
		this.author = author;
		this.release = release;
		this.category = category;
		available = true;
		theBookIsWith = "none";
	}
	//Getters
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getRelease() {
		return release;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String isAvailable() {
		String isAvailable = available == true ? "Yes" : "No";
		return isAvailable;
	}
	
	public String who_Is_The_Book_With() {
		return theBookIsWith;
	}
	//Setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		 this.author = author;
	}
	
	public void setRelease(String release) {
		this.release = release;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String borrow_A_Book(String name){
		if(available == true) {
			available = false;
			theBookIsWith = name;
			return "Borrowed with sucess";
		}else {
			return "The book are not available";
		}
	}
	
	
	
	
}
