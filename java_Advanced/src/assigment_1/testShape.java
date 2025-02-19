package assigment_1;
import javax.swing.JOptionPane;


public class testShape {
	public static Shape shape;
	public static void main(String args[]) {
		menu();
	}
	public static void menu() {
	  boolean menu = true;// to make menu to drow the shapes 
	  while(menu) {
		 String x = JOptionPane.showInputDialog("1: Drow Circle"+ 
	                                            "\n2: Drow Rectangle"+ 
                                                "\n3: Drow Triangle"+
	                                            "\n4: Drow get Area"+
				                                "\n5: exit");
		 int  choose = Integer.parseInt(x);
		 switch(choose) {
		 case 1: circle(); break;
		 case 2:rectangle();break;
		 case 3:triangle();break;
		 case 4:getArea();break;
		 case 5:System.exit(0);break;
		 default: menu = true;break;
		 }

	  }
	}
	//Drow circle
	public static void circle() {
		String s = JOptionPane.showInputDialog("Enter the radius");
		int radius = Integer.parseInt(s);
		String color = JOptionPane.showInputDialog("Enter the color");
		shape = new Circle(radius, color);
		
		
	}
	
	//get area of shape
	public static void getArea() {
		JOptionPane.showMessageDialog(null,"Color: "+ shape.getColor()+ "\n");
		JOptionPane.showMessageDialog(null, "the area: "+ (int)(shape.getArea() * 100)/100.0);
		
		
	}
	
	//Drow rectangle 
	public static void rectangle() {
	  String s = JOptionPane.showInputDialog("Enter the height of Rectangle");
	  double height = Double.parseDouble(s);
	  s = JOptionPane.showInputDialog("Enter the width of Rectangle");
	  double width = Double.parseDouble(s);
	  String color = JOptionPane.showInputDialog("Enter the color of Rectangle");
	  shape = new Rectangle(color, height, width);//make  object shape of Rectangle 
	  
	}
	
	//Drow triangle
	public static void triangle() {
		String s = JOptionPane.showInputDialog("Enter the height of Triangle");
		double height = Double.parseDouble(s);
		 s = JOptionPane.showInputDialog("Enter the leangth of base of Triangle");
		 double leangthBase = Double.parseDouble(s);
		 String color = JOptionPane.showInputDialog("Enter the Color");
		 shape = new Triangle(height, leangthBase, color);
	}
	
}


