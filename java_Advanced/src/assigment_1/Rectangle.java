package assigment_1;

public class Rectangle extends Shape{
	private double height, width;
	
	Rectangle (String color){
		super(color);
		height = 0;
		width = 0;
	}
	
	Rectangle (String color, double height, double width){
		super(color);
		this.height = height;
		this.width = width;
		
		
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}

}
