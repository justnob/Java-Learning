package Library;

public class Review {
	
	private int page;
	private String comment;
	private int rating;

	public Review(int page, String comment, int rating) {
		this.page = page;
		this.comment = comment;
		this.rating = rating;
	}
	
	public String toString() {
		
		return String.format("page no- %d comment- %s rating-%d \n        ", page, comment, rating);
	}

}
