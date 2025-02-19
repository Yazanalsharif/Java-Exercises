package assigment_2_interface;

import javax.swing.JOptionPane;

public class Triangle implements Shape {
	final String name = "triangle";
	double height, base;
	String color;
	static int counter = 0;
	Triangle() {
		
	}
	
	Triangle(double height, double base, String color) {
		this.color = color;
		this.base = base;
		this.height = height;
		
	}
	//set base
	void setBase (double base) {
		this.base = base;
	}
	//set height 
	void setHeight(double height) {
		this.height = height;
	}
	 //get base 
	double getBase() {
		return base;
	}
	//getHeight
	double getHeight () {
		return height;
	}
	//set color 
	void setColor (String color) {
		this.color = color;
	}
	// get color 
	public String getColor() {
		return color;
	}
	//overRide to interFace method 
	public double getArea() {
		return (int)(0.5 * height * base * 100) / 100.0;
	}
	public String getName() {
		return name;
	}
   public void drowAble() {
		
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
















