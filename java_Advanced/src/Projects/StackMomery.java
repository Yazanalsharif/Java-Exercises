package Projects;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Color;
import java.awt.Cursor;
import java.util.Deque;
import java.util.LinkedList;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;


public class StackMomery extends JFrame implements ActionListener{
	public static RPNCalculator calcu = new RPNCalculator();
	private static final long serialVersionUID = 1L;
	 Container c;
	JLabel theStack, top;
	JButton close, up, down, edit, copy, delete, clear;
//	JTextField stack;
	public static JList<Double> stack;
	public  static DefaultListModel list;
	
	StackMomery(){
		super("RPN Stack");
		 //getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color());
		c = getContentPane();
		setLayout(null);
		theStack = new JLabel();//make label Stack
		theStack.setText("TheStack");
		//theStack.setOpaque(true);// to add background color to jlabel
		theStack.setBounds(90, 20, 60, 20);//setBounds(x, y, width, height);
		theStack.setForeground(Color.BLUE);// to set the color 
		add(theStack);
		//to set the JList and style it
		add(createList());
		//make label top>>
		top = new JLabel("Top>>");
		top.setBounds(25, 40, 40, 20);
		top.setForeground(Color.GREEN);
		add(top);
		// create buttons and setIt
		//up
		up = new JButton("UP");
		up.setBounds(300, 40, 80, 30);
		up.addActionListener(this);
		add(up);
		//down 
		down = new JButton("Down");
		down.setBounds(300, 80, 80, 30);
		down.addActionListener(this);
		add(down);
		//copy
		copy = new JButton("Copy");
		copy.setBounds(300, 120, 80, 30);
		copy.addActionListener(this);
		add(copy);
		//edit
		edit = new JButton("Edit");
		edit.setBounds(300, 160, 80, 30);
		edit.addActionListener(this);
		add(copy);
		//delete
		delete = new JButton("Delete");
		delete.setBounds(300, 160, 80, 30);
		delete.addActionListener(this);
		add(delete);
		//clear
		clear = new JButton("Clear");
		clear.setBounds(300, 200, 80, 30);
		clear.addActionListener(this);
		add(clear);
		//close 
		close = new JButton("Close");
		close.setBounds(140, 250, 80, 30);
		close.addActionListener(this);
		add(close);
		setResizable(false);
	    setVisible(false);
	    setBounds(400, 100, 410, 330);
	    //make action when click x
	    addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		Singelton.Stack = null;
	    	}
	    });
		
	}
	public  void turnOn() {
		setVisible(true);
	}
	
	
	//add list to the stack => fail
	public  JList createList() {//this method to make my code clear 
		
		//System.out.println(RPNForm.calc.theStack);
		 list =  new DefaultListModel();//to add element in this list and pass to JList
		 
		
	
		LinkedList<Double> listStack = (LinkedList<Double>)RPNForm.calc.theStack;
		
		
		for(int i = 0; i < listStack.size(); i++) {
			list.addElement(listStack.get(i));
		}
				
		stack = new JList(list);
		
		stack.setBounds(80, 40, 200, 180);
		//stack.setSelectedIndex(0);
		
	return stack;
	
	}
	//Send actionCommand to the method && the actionCommand is the text content button
	public void actionPerformed(ActionEvent event) {
		ActionStackFrame(event.getActionCommand());
	}
	// to make action to a button 
	public void ActionStackFrame(String event) {
		if(event.equals("Close")) {//button close action
			setVisible(false);
			Singelton.Stack = null;
		}else if(event.equals("Delete")) {//button delete action
			deleteElementInList(stack.getSelectedValue());
		}else if(event.equals("Clear")) {//button Clear action
			clear();
		}else if(event.equals("UP")) {
			up();
		}else if(event.equals("Down")) {
			 down();
		}else if(event.equals("Copy")) {
			copyValueToClipbord();
			
		}
	}
    public void deleteElementInList(Double value){
    	list.removeElement(value);
    	RPNForm.calc.theStack.remove(value);
    }
    public void clear() {
    	list.removeAllElements();
    	RPNForm.calc.theStack.clear();
    }
    public void up() {
 
    	try {
    		int index = 0;
    		double value = (Double)list.get(index);
    		list.remove(0);
    		list.add(RPNForm.calc.theStack.size() - 1, value);
    		LinkedList<Double> listStack = (LinkedList<Double>)RPNForm.calc.theStack;
    		listStack.remove(index);
    		listStack.add(RPNForm.calc.theStack.size(), value);
    		RPNForm.calc.theStack = listStack;
    		
    		
    	} catch(Exception e) {
    		
    	}
  
    }
    public void down() {
    	try {
    		int index = RPNForm.calc.theStack.size() - 1;
    		double value = (Double)list.get(index);
    		list.remove(index);
    		list.add(0, value);
    		LinkedList<Double> listStack = (LinkedList<Double>)RPNForm.calc.theStack;
    		listStack.remove(index);
    		listStack.add(0, value);
    		RPNForm.calc.theStack = listStack;
    		
    		
    	} catch(Exception e) {
    		
    	}
    }
   public void copyValueToClipbord(){
	 /*  String myString = "This text will be copied into clipboard";
	   StringSelection stringSelection = new StringSelection(myString);
	   Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	   clipboard.setContents(stringSelection, null);*/
	   double value = stack.getSelectedValue();
	   StringSelection copyValue = new StringSelection(Double.toString(value));
	   Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	   clipboard.setContents(copyValue, null);
    }

	
	
	
	
	
	
}
