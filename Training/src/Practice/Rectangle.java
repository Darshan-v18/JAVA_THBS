package Practice;

public class Rectangle {
	private int width;
	private int length;
	
	
	public Rectangle(int width, int length) {

		this.width = width;
		this.length = length;
		System.out.println("The perimeter of the rectangle is "+perimeter(length,width));
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
	
	private int perimeter(int length,int width) {
		int p=length*width;
		return p;
	}

	public static void main(String[] args) {
		Rectangle r= new Rectangle(5,4);
 	}

}
