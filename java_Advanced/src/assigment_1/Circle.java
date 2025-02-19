package assigment_1;

public class Circle extends Shape {
 private double radius;
 
	 Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}
	 Circle(String color){
		 super (color);
		 radius = 1;
	 }
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	 

}
