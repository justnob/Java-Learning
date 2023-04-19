package test;

public class BookRunner {

	public static void main(String[] args) {
		book books = new book(10);// direct value with constructor
		book art = new book(15);// direct value with constructor
		book effect = new book(13);// direct value with constructor
		book clean = new book(12);// direct value with constructor
		book cook = new book(10);// direct value with constructor
		
		books.bookName();
		art.artOfComputerProgramming();
		effect.effectiveJava();
		clean.cleanCode();
		cook.cookBook();
		
		
		//books.setReaded  (0);
		System.out.printf("you are on page number of Books= %d", books.getReaded()).println();
		
		// updating readed books
		//int updatedBooks = books.getReaded();
		//updatedBooks = updatedBooks + 10;
		
		//books.setReaded  (updatedBooks);
		
		books.increaseReaded(10); // to increase
		books.decreaseReaded(0); // to decrease
		System.out.printf("you are on page number of Books(Updated)= %d", books.getReaded()).println();
		
		//art.setReaded  (0);
		
		System.out.printf("you are on page number of art= %d", art.getReaded()).println();
		
		art.increaseReaded(0);
		art.decreaseReaded(5);
		
		System.out.printf("you are on page number of art(Updated)= %d", art.getReaded()).println();
		
		
		//effect.setReaded  (0);
		
		System.out.printf("you are on page number of effect= %d", effect.getReaded()).println();
		
		effect.increaseReaded(0);
		effect.decreaseReaded(5);
		
		System.out.printf("you are on page number of effect(Updated)= %d", effect.getReaded()).println();
		
		
		//clean.setReaded  (0);
		
		System.out.printf("you are on page number of clean= %d", clean.getReaded()).println();
		
		clean.increaseReaded(0);
		clean.decreaseReaded(5);
		
		System.out.printf("you are on page number of clean(Updated)= %d", clean.getReaded()).println();
		
		
		System.out.printf("you are on page number of cook= %d", cook.getReaded()).println();
		
		cook.increaseReaded(0);
		cook.decreaseReaded(5);
		
		System.out.printf("you are on page number of cook(Updated)= %d", cook.getReaded()).println();
		

	}
	

}
