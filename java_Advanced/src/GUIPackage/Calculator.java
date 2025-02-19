package GUIPackage;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	Container container;
	JTextField field;

	
	
	
	Calculator() {
		super("Calculater");
		 container = getContentPane();
		 
		 field = new JTextField();
		 field.setEditable(false);
		 field.setBackground(Color.yellow);
		 add(field, BorderLayout.NORTH);
		 
		 JPanel panel = new JPanel(new GridLayout(4, 4, 5, 10));
		JButton b[] = new JButton [16];
		String tools []  = {"1", "2", "3", "4", "5",
				   "6", "7", "8", "9", "0",
				    "+", "*", "-", "*", "/","="};
		
		for(int i = 0; i < b.length; i++) {
			b[i] = new JButton(tools[i]);
			panel.add(b[i]);
		}
		add(panel);//by defult will add the panel in center 
		setVisible(true);
		setBounds(500, 250, 250, 250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
	
	
   public static void main(String args[]) {
	   new Calculator();
   }

}
