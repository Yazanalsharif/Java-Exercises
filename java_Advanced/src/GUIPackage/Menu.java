package GUIPackage;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import java.awt.Container;

public class Menu extends JFrame implements ActionListener{
	Container c; 
	JMenuBar mb;
	JMenu m1, m2, m3;
	JMenuItem t1, t2, t3, t4, t5, t6;
	Menu(){
		super("menu");
		c = getContentPane();
		mb = new JMenuBar();
		m1 = new JMenu("menu 1");
		t1 = new JMenuItem("task 1");
		m1.add(t1);
		m2 = new JMenu("subMenu");
		t2 = new JMenuItem("task 2");
		m2.add(t2);
		t3 = new JMenuItem("task 3");
		m2.add(t3);
		m1.add(m2);
		m3 = new JMenu("menu 2");
		t4 = new JMenuItem("task 4");
		t5 = new JMenuItem("task 5");
		
		m3.add(t4);
		m3.add(t5);
		mb.add(m1);
		mb.add(m3);
		t6 = new JMenuItem("here");
		mb.add(t6);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		t6.addActionListener(this);
	
		add(mb, BorderLayout.NORTH);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String args[]) {
		new Menu();
	}
	public  void actionPerformed(ActionEvent e) {
		if(e.getSource() == t1) {
			System.out.print("hello task 1 \n");
		} else if(e.getSource() == t2) {
			System.out.print("hello task 2 \n");
		} else if(e.getSource() == t3) {
			System.out.print("hello task 3 \n");
		} else if(e.getSource() == t4) {
			System.out.print("hello task 4 \n");
		} else if(e.getSource() == t5) {
			System.out.print("hello task 5 \n");
		} else if(e.getSource() == t6) {
			System.out.print("hello task 6 \n");
		}
	}
	

	

}
