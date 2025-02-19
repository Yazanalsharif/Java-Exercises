package GUIPackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class border {
	public static void main(String[] args) {
	       createWindow();
	   }
	
	 private static void createWindow() {    
	      JFrame frame = new JFrame("Swing Tester");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      createUI(frame);
	      frame.setSize(560, 200);      
	      frame.setLocationRelativeTo(null);  
	      frame.setVisible(true);
	   }
	 private static void createUI(JFrame frame){
	      //Create a border
	      Border blackline = BorderFactory.createLineBorder(Color.black);
	      JPanel panel = new JPanel();
	      LayoutManager layout = new FlowLayout();  
	      panel.setLayout(layout);       
	      JPanel panel1 = new JPanel();
	      String spaces = "                   ";
	      JLabel label = new JLabel(spaces + "Border to JLabel" + spaces);
	      label.setBorder(blackline);
	      panel1.add(label);  
	      panel1.add( new JLabel(spaces + "JLabel with no border" + spaces));  
	      panel.add(panel1);
	      frame.getContentPane().add(panel, BorderLayout.CENTER);    
	   }

}
