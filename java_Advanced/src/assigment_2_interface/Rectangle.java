package assigment_2_interface;

import javax.swing.JOptionPane;

public class Rectangle implements Shape{
  final String  name = "Rectangle";
	double width, height;
	String color;
	Rectangle() {
		
	}
	
	Rectangle(double width, double height, String color){
		this.width = width;
		this.height = height;
		this.color = color;
		
		
	}
	
	//set width
	void setWidth (double width) {// i can't use it if the interface was shape
		this.width = width;
	}
	//get width 
	double getWidth() {// i can't use it  if the interface was shape
		return width;
	}
	//set height 
	void setHeight(double height) {// i can't use it  if the interface was shape
		this.height = height;
	}
	//get height 
	double getHeight() {// i can't use it  if the interface was shape
		return height; 
	}
	
	//set color 
	void setColor (String color ) {
		this.color = color;
	}
	//get color 
	public String getColor () {// i can't use it  if the interface was shape
		return color;
	}
	public double getArea() {
		return (int)(width * height * 100) / 100.0;
		
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
