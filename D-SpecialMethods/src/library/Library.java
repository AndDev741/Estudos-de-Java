package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Dom Casmurro", "Machado de Assis", "1899", "Romance", 256));
		books.add(new Book("A Metamorfose", "Franz Kafka", "1915", "Ficção", 120));
		books.add(new Book("O Senhor dos Anéis", "J.R.R. Tolkien", "1954", "Fantasia", 1178));
		books.add(new Book("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "1997", "Fantasia", 223));
		books.add(new Book("1984", "George Orwell", "1949", "Ficção Científica", 328));
		books.add(new Book("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "1943", "Infantojuvenil", 96));
		books.add(new Book("A Revolução dos Bichos", "George Orwell", "1945", "Ficção", 150));
		books.add(new Book("O Hobbit", "J.R.R. Tolkien", "1937", "Fantasia", 310));
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("What's your name?");
	    String name = scanner.nextLine();
	    Person person = new Person(name);
	    
	    System.out.println("Hello " + name);
	    int i = 1;
	    for (Book book : books) {
	    	System.out.println(i + "- Livro: " + book.getName());
	    	i++;
	    }
	    
	    
	    Integer choose = null;;
	    try {
	    	System.out.println("Choose the number of the book to borrow");
	    	choose = Integer.parseInt(scanner.nextLine()) - 1;
	    	choose = choose >= books.size() ? books.size() - 1 : choose;
	    }catch(NumberFormatException e) {
	    	System.out.println("Please, just write numbers!");
	    }
	        
	    Book bookToBorrow = books.get(choose);
	    String sucess = bookToBorrow.borrow_A_Book(person);
	    if(sucess.equals("Borrowed with sucess") == true){
	    	System.out.println(sucess);
	    	System.out.println("Book: " + bookToBorrow.getName());
            System.out.println("Author: " + bookToBorrow.getAuthor());
            System.out.println("Release: " + bookToBorrow.getRelease());
            System.out.println("Category: " + bookToBorrow.getCategory());
            System.out.println("Available: " + bookToBorrow.isAvailable());
            System.out.println("Who borrowed: " + bookToBorrow.who_Is_The_Book_With());
            System.out.println("Pages: " + bookToBorrow.getNumberOfPages());
	    }else {
	    	System.out.println(sucess);
	    }
	    
	    System.out.println(books.get(choose).isAvailable()); 
	    System.out.println(books.get(choose).who_Is_The_Book_With());
	    scanner.close();
	    
	    System.out.println(bookToBorrow.getActualPage());
	    bookToBorrow.advancePage();
	    System.out.println(bookToBorrow.getActualPage());
	    bookToBorrow.leafTrough(40);;
	    System.out.println(bookToBorrow.getActualPage());
	    

	}
    
}
