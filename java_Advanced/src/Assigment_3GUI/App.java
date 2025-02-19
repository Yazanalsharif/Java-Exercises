package Assigment_3GUI;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class App extends JFrame implements ActionListener{
	Container c;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem item1, item2;
	App(){
		super("menu");
		c = getContentPane();
		//make menu bar
		menuBar = new JMenuBar();
		
		menu = new JMenu("apps");
		menuBar.add(menu);
		item1 = new JMenuItem("add app");
		item2 = new JMenuItem("Weight app");
		menu.add(item1);
		menu.add(item2);
		add(menuBar, BorderLayout.NORTH);
		setVisible(true);
		setBounds(500, 250, 200,200);
		// when i have the action one make this good 
	/*	item1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Weight();
			}
		});*/
		item1.addActionListener(this);
		item2.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
	public static void main(String args []) {
		new App();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item1) {
			Singelaton.makeFrame1();
		} else if (e.getSource() == item2) {
			Singelaton.makeFrame();
			}
				
		}
			
	}

	
	
	
	
	
	

