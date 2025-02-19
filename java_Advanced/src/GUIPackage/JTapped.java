package GUIPackage;
import javax.swing.JTabbedPane;

import Assigment_3GUI.App;
import Assigment_3GUI.CalculatorFrame;

import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTapped extends JFrame{
	JTabbedPane b,b2;
	Container c;
	JComboBox p;
	
	JTapped(){
		p = new JComboBox();
		p.addItem("male");
		
		c = getContentPane();
		b = new JTabbedPane();
		b2 = new JTabbedPane();
		
		b.add("yazan", new tapp());
		setVisible(true);
		add(b2);
		setSize(500,500);
		add(b);
	}
	public static void main(String args []) {
		new JTapped();
	}

}
