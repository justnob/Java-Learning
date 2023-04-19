package Library;

public class bookRunner {

	public static void main(String[] args) {
		Book book = new Book(55, "Java Programming", "Amarnath");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 7));
		book.addReview(new Review(13, "Great Work", 9));
		
		System.out.println(book);

	}
	
	

}
