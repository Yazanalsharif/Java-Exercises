package assigment_2_interface;

import javax.swing.JOptionPane;

public class Circle implements Shape{
	 final String  name = "Circle";
	double radius;
	String color;
	Circle(){
		
	}
	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	//get color
	public String getColor () {
		return color;
	}
	//set color
	public void setColor(String color) {
		this.color = color;
		
		
	}
	//getRadius
	public double getRadius() {
		return radius;
	}
	//setRadius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (int)(Math.PI * radius * radius * 100)/100.0;
	}
	public  void drowAble() {
		
	}
	public String getName() {
		return name;
		
	}
	public int compareTo(Shape shape) {
		int result;
		 if(this.getArea() > shape.getArea())
			result = 1;
		 else if(this.getArea() < shape.getArea())
			 result = -1;
		 else
			 result = 0;
		 
		 return result;
		
		
	}

}
