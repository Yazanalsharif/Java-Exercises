package assigment_2_interface;
import javax.swing.JOptionPane;

public class TestShapeWithInterFace {
	public static Shape shapes [] = new Shape [10];
	public static Shape shape;
	public static int counter = 0;
	public static void main(String args []) {
		Boolean stay = true;
		while(stay) {
			String s =JOptionPane.showInputDialog(
					"1: Drow Circle\n" +
			        "2: Drow Rectangle\n" +
					"3: Drow triangle\n" +
			        "4: getArea\n" +
					"5: combare to\n" +
			        "6: exit");
			int menu = Integer.parseInt(s);
			switch(menu) {
			case 1:drowCircle();break;
			case 2:drowRectangle();break;
			case 3:drowTriangle();break;
			case 4: area();break;
			case 5:compareTo();break;
			case 6:System.exit(0);break;
			default:
			}
			
		}
	
		
	}
	public static void drowCircle() {
		String s = JOptionPane.showInputDialog("Enter the Radius");
		double radius = Double.parseDouble(s);
		String color = JOptionPane.showInputDialog("Enter the Color");
		shape = new Circle(radius, color);
		shapes [counter] = shape;
		shape.drowAble();
		counter++;
		
	}
	public static void drowRectangle() {
		String s = JOptionPane.showInputDialog("Enter the Width");
		double width = Double.parseDouble(s);
		s = JOptionPane.showInputDialog("Enter the Height");
		double height = Double.parseDouble(s);
		String color = JOptionPane.showInputDialog("Enter the Color");
		shape = new Rectangle(width, height, color);
		shapes [counter] = shape;
		shape.drowAble();
		counter++;
		
	}
	public static void drowTriangle() {
		String s = JOptionPane.showInputDialog("Enter the height");
		double height = Double.parseDouble(s);
		s = JOptionPane.showInputDialog("Enter the base");
		double base = Double.parseDouble(s);
		String color = JOptionPane.showInputDialog("Enter the Color");
		shape = new Triangle(height, base, color);
		shapes [counter] = shape;
		shape.drowAble();
		counter++;
	}
	public static void area() {
		JOptionPane.showMessageDialog(null, "Area: " + (int)(shape.getArea() * 100) / 100.0 + "\nColor: " + shape.getColor());
		
	}
	public static void compareTo() {
		Shape max = shapes [0];//assume that the first shape is the big shape
		int i;
		int compare;

		for (i = 0; i < counter; i++) {
			compare = max.compareTo(shapes[i]);
			if(compare <= 0)
				max = shapes[i];
		}
		JOptionPane.showMessageDialog(null, max.getArea() + "\n" + "THE NUMBER OF SHAPES: " + counter);
		
	}
	
	
	
	
	
	
	
	
	
	
}
