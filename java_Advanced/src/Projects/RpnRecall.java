package Projects;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class RpnRecall extends JFrame implements ActionListener{
	
	Container c;
	JButton close, reCall;
	public static JList store;
	public static DefaultListModel list;
	JScrollPane scroll;
	RpnRecall(){
		super("RPN Recall");
		setLayout(null);
		c = getContentPane();
		//createList
		
		add(createList());
		//create the buttons 
		//create the reCall button
		reCall = new JButton("Recall");
		reCall.setBounds(40, 235, 70, 30);
		reCall.addActionListener(this);
		add(reCall);
		//create the close button
		close = new JButton("Close");
		close.setBounds(130, 235, 70, 30);
		close.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Singelton.reCall = null;
			}
		});
		add(close);
		setResizable(false);//to the frame
		setBounds(250, 200, 250, 320);//to the frame
		setVisible(false);//to the frame
	}
	// create list of Recall Frame
	public JScrollPane createList() {
		store = new JList(RpnStore.model);//create object list and pass the data from DefultListModel
		
	    store.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    scroll = new JScrollPane(store,
	    		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(20, 20, 210, 200);

		return scroll;
	}
	
	public void actionPerformed(ActionEvent e) {
		actionRecall(e.getActionCommand());
	}
	//make action here
	void actionRecall(String event){
		if(event.equals("Close")) {
			setVisible(false);
			Singelton.reCall = null;
		}else if(event.equals("Recall")) {
			recallValue();
		}
	}
	 void recallValue(){
		int index;
		try {
			index = store.getSelectedIndex();
			if(RPNForm.calc.register[index].getValue() != 0) {
				//add to displayText
				RPNForm.displayTextField.setText(Double.toString(RPNForm.calc.register[index].getValue()));
				//add to topStack
				StackMomery.list.add(0, RPNForm.calc.register[index].getValue());
				RPNForm.calc.theStack.push(RPNForm.calc.register[index].getValue());
			}
			
			
		}catch(Exception e) {
			
		}
	}
	

	
	

	
	
	
	
	
	
}
