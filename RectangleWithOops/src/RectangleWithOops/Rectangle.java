package RectangleWithOops;

public class Rectangle {
	
	public int getLength() {
		return length;
	}




	public void setLength(int length) {
		this.length = length;
	}




	public int getWidth() {
		return width;
	}




	public void setWidth(int width) {
		this.width = width;
	}




	public int getHight() {
		return hight;
	}




	public void setHight(int hight) {
		this.hight = hight;
	}




	public int length;
	public int width;
	public int hight;

	public Rectangle(int length, int width, int hight) {
		this.length = length;
		this.width = width;
		this.hight = hight;
	}
	



	public void areaOfRectanglr() {
		
		int area = length * width * hight;
		System.out.println("The area of Rectangle is:" + area);
		
	}
	
	public void perimiter() {
		
		int perim = 2 * (length + width + hight);
		System.out.println("The perimater of the rectangle is: " + perim);
		
	}
	
	
}

	
