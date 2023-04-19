package Triangle;

public class numberTriangle {

	private int numb;

	public numberTriangle(int triangle) {
		
		this.numb = triangle;
	}

	public void numberTriangles() {
		
		
		
		for(int i = 1; i <= numb; i++) {
			for(int j =1;j<=i;j++){
			System.out.print(j+" ");
			
			}
			System.out.println();
		}
		
		
	}
	
	
}
