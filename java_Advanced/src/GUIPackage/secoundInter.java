package GUIPackage;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;



public class secoundInter extends JFrame{
	Container c;
	public secoundInter() {
		
		 c = getContentPane();
		 setLayout(new BorderLayout());
		 JButton b1 = new JButton("yazan");
		 JButton b2 = new JButton("ali");
		 JButton b3 = new JButton("mohammed");
		 JButton b4 = new JButton("qusai");
		 JButton b5 = new JButton("Hamoda");
		 JButton b6 = new JButton("besb");
		 
		// c.setLayout(null);
		/* b1.setBounds(50,50,100,50);
		 b2.setBounds(250,50,100,100);
		 b3.setBounds(450,50,100,100);
		 b4.setBounds(100, 100, 100, 100);*/
		
		 add(b1, BorderLayout.NORTH);
		 add(b4, BorderLayout.SOUTH);
		 add(b2, BorderLayout.WEST);
		 add(b3, BorderLayout.EAST);
		 add(b5, BorderLayout.CENTER);
		 
		
		 setVisible(true);
		 setSize(400,400);
		 setResizable(true);
		 		 
	}
	public static void main(String args []) {
		new secoundInter();
	}
	
}
