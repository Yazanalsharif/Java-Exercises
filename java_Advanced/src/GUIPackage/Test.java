package GUIPackage;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.BorderLayout;



public class Test extends JFrame{
	
	String name [] = {"b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8"};
	JButton buttons [] = new JButton[8];
	JPanel p,p1;
	Container c;

	Test(){
		
		super("yazan");
		c = getContentPane();
		p = new JPanel(new BorderLayout());
		p1 = new JPanel(new BorderLayout());
		
		for (int i = 0; i < name.length; i++) 
			buttons [i] = new JButton(name[i]);
		
		p.add(buttons[0], BorderLayout.EAST);
		p.add(buttons[1], BorderLayout.WEST);
		p.add(buttons[2], BorderLayout.NORTH);
		p.add(buttons[3], BorderLayout.SOUTH);
		p.add(buttons[4], BorderLayout.CENTER);
		add(p, BorderLayout.EAST);
		
		p1.add(buttons[4], BorderLayout.CENTER);
		p1.add(buttons[4], BorderLayout.EAST);
		p1.add(buttons[5], BorderLayout.WEST);
		p1.add(buttons[7], BorderLayout.SOUTH);
		p1.add(buttons[7], BorderLayout.NORTH);
		add(p1, BorderLayout.WEST);
		setVisible(true);
		setSize(300,300);
		
		
		
		
	}
	public static void main(String args []) {
		new Test();
	}
	
}
