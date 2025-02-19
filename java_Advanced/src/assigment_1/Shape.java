package assigment_1;



public abstract class Shape {
	private String color;
	//constructor
	Shape(String color) {
		this.color = color;
	}
	//get the shape color 
	public String getColor() {
		return color;
	}
	// set color to the shape 
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public abstract double getArea();//made this method abstract becouse it's need some information
	/*
	 *abstract: its make one method or more neclegting becouse the method need information 
	 *the information will take from child class 
	 * we can't make object from abstract class 
	 * we use this technique becouse if i have 100 shape we can getarea with one statment 
	 * we use abstract class when we use inheritance
	 */

}
