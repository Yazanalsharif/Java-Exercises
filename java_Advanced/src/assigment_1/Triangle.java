package assigment_1;

public class Triangle extends Shape{
	private double height, base; //height is height of triangle and base is leangth of base triangle 
	
	public Triangle(String color) {
		super(color);
	}
	
	public Triangle(double height, double base, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		return base * height * 0.5;
	}

}
