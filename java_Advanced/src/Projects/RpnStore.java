package Projects;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;

public class RpnStore extends JFrame implements ActionListener{
	Container c;
	JButton buttons[];
    JList list;
    public static DefaultListModel model;
	JScrollPane scroll;
	RpnStore(){
		super("RPN Store");
		c = getContentPane();
		setLayout(null);
		buttons = new JButton[8];
		//create the list here 
		add(createList());
	
		//create the buttons and pass it 
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
		}
		//set test to the buttons
		buttons[0].setText("+");
		buttons[1].setText("*");
		buttons[2].setText("/");
		buttons[3].setText("-");
		buttons[4].setText("Store");
		buttons[5].setText("Edit Label");
		buttons[6].setText("ClearAll");
		buttons[7].setText("Close");
		//setBounds to the buttons
		buttons[0].setBounds(50, 240, 45, 25);
    	buttons[1].setBounds(100, 240, 45, 25);
    	buttons[2].setBounds(150, 240, 45, 25);
		buttons[3].setBounds(200, 240, 45, 25);
		//another buttons
		buttons[4].setBounds(30, 280, 100, 25);
		buttons[5].setBounds(150, 280, 100, 25);
		//under it
		buttons[6].setBounds(30, 315, 100, 25);
		buttons[7].setBounds(150, 315, 100, 25);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Singelton.reStore = null;
			}
		});
			
		
		
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}

		setVisible(false);
		setResizable(false);
		setBounds(250, 200, 300, 400);
		
	}

	public JScrollPane createList() {
		
		model = new DefaultListModel();
		for(int i = 0; i < RPNForm.calc.register.length; i++)
			model.addElement(RPNForm.calc.register[i].toString());//only this statment will looping
		list = new JList(model);
		scroll = new JScrollPane(list, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(20, 20, 250, 200);
		return scroll;
		
	}
	//overRide actionPerformed
	public void actionPerformed(ActionEvent e) {
		actionStore(e.getActionCommand());
	}
	public void actionStore(String event) {
		if(event.equals("Close")) {
			Singelton.reStore = null;
			RPNForm.rpnStore.setVisible(false);
		}else if(event.equals("Store")) {
			storeData();
		//	System.out.print(RPNForm.calc.register[0].getValue());
		}else if(event.equals("Edit Label")) {
		 editLabel();
		} else if(event.equals("ClearAll")) {
			clear();
		} else if(event.equals("+")) {
			plus();
		} else if(event.equals("*")) {
			mult();
		} else if(event.equals("/")) {
			divison();
		} else if(event.equals("-")) {
			sub();
		}
		
	}
	public void storeData() {
		try {
		double topStack = RPNForm.calc.theStack.getFirst();
		int index = list.getSelectedIndex();
		RPNForm.calc.register[index].setValue(topStack);
		
	/*	model.removeAllElements();
	    for(int i = 0; i < RPNForm.calc.register.length; i++)
	    	model.addElement(RPNForm.calc.register[i].toString());
	    list.setModel(model);*/
		model.remove(index);
		model.add(index, RPNForm.calc.register[index]);
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void editLabel() {
		String label;
		
		try {
		int index = list.getSelectedIndex();
		System.out.print(index);
		//Register test = (Register)list.getSelectedValue();
		
		if(index >= 0) {
			
	    label = JOptionPane.showInputDialog(null, "Enter the address");
		RPNForm.calc.register[index].setLable(label);
		model.remove(index);
		model.add(index, RPNForm.calc.register[index]);
		
		
		}
		} catch(Exception e) {
	//	 JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
	//to clear all data in register
	void clear() {
		model.clear();
		for(int i = 0; i < RPNForm.calc.register.length; i++) {
			RPNForm.calc.register[i].setValue(0);
			RPNForm.calc.register[i].setLable("no label");
			model.addElement(RPNForm.calc.register[i].toString());
		}
	}
	//action for plus operator in RPNStore 
	void plus() {
		try {
		int index = list.getSelectedIndex();
		double value = RPNForm.calc.register[index].getValue();
		double sum = value + RPNForm.calc.theStack.getFirst();
		RPNForm.calc.register[index].setValue(sum);
		model.remove(index);
		model.add(index, RPNForm.calc.register[index]);
		} catch(Exception e) {
			
		}
		
	}
	//action for mult operator in RPNStore 
	void mult() {
		try {
			int index = list.getSelectedIndex();
			double value = RPNForm.calc.register[index].getValue();
			double mult = value * RPNForm.calc.theStack.getFirst();
			RPNForm.calc.register[index].setValue(mult);
			model.remove(index);
			model.add(index, RPNForm.calc.register[index]);
			
			
		} catch(Exception e) {
			
		}
		
	}
	//action for divison operator in RPNStore 
	void divison() {
		try {
			int index = list.getSelectedIndex();
			double value = RPNForm.calc.register[index].getValue();
			double divi = value / RPNForm.calc.theStack.getFirst();
			RPNForm.calc.register[index].setValue(divi);
			model.remove(index);
			model.add(index, RPNForm.calc.register[index]);
			
			
		} catch(Exception e) {
			
		}
		
	}
	//action for sub operator in RPNStore 
	void sub() {
		try {
			int index = list.getSelectedIndex();
			double value = RPNForm.calc.register[index].getValue();
			double sub = value - RPNForm.calc.theStack.getFirst();
			RPNForm.calc.register[index].setValue(sub);
			model.remove(index);
			model.add(index, RPNForm.calc.register[index]);
			
			
		} catch(Exception e) {
			
		}
		
	}
	
	
	
	

}
