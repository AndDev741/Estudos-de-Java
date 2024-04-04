package library;

public class Book implements Publication {
	private String name;
	private String author;
	private String release;
	private String category;
	private boolean available;
	private boolean isOpen;
	private String theBookIsWith;
	private int numberOfPages;
	private int actualPage;
	
	public Book(String name, String author, String release, String category, int numberOfPages) {
		setName(name);
		setAuthor(author);
		setRelease(release);
		setCategory(category);
		setAvailable(true);
		setTheBookIsWith(null);
		setNumberOfPages(numberOfPages);
		setActualPage(0);
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
	public int getActualPage() {
		return actualPage;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public String getTheBookIsWith() {
		return theBookIsWith;
	}
	public boolean isOpen() {
		return isOpen;
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
	public void setActualPage(int actualPage) {
		this.actualPage = actualPage;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public void setTheBookIsWith(String theBookIsWith) {
		this.theBookIsWith = theBookIsWith;
	}
	
	public String borrow_A_Book(Person person){
		if(available == true) {
			available = false;
			theBookIsWith = person.getName();
			return "Borrowed with sucess";
		}else {
			return "The book are not available";
		}
	}

	@Override
	public void open() {
		setOpen(true);
	}

	@Override
	public void close() {
		setOpen(false);
		
	}

	@Override
	public void leafTrough(int page) {
		setActualPage(page);	
		
	}

	@Override
	public void advancePage() {
		if(getActualPage() > getNumberOfPages()) {
			setActualPage(0);	
		}else {
			setActualPage(getActualPage() + 1);
		}
	}

	@Override
	public void backPage() {
		if(getActualPage() < 0) {
			setActualPage(getNumberOfPages());	
		}else {
			setActualPage(getActualPage() - 1);	
		}
		
		
	}	
	
}
