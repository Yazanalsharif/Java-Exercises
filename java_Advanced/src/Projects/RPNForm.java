package Projects;
// don't forget to handle error and throw exception

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class RPNForm extends JFrame implements ActionListener {
  public static StackMomery stack;
  public static RpnStore rpnStore;
  public static RpnRecall rpnRecall;
  private Container contentPane;
  private JPanel displayPanel;
  private JLabel RPNLabel;
  public static JTextField displayTextField;
  private JPanel buttonPanel;
  private String inString = "";
  private JButton[][] buttonGrid;
  public static RPNCalculator calc;
 static public boolean RPN = true;
 static public boolean qustions = false;
 
  
  public static void main(String[] args) {
    RPNForm gui = new RPNForm();
    gui.setVisible(true);
    stack = new StackMomery();// to make pointer to the stack
    rpnStore = new RpnStore();
    rpnRecall = new RpnRecall();
  
  
  //  disableStore.setVisible(false);//disable like the project want
  //  RpnRecall disableRecall = new RpnRecall();// to make pointer to the stack
   // disableRecall.setVisible(false);//disable like the project want
  }

  
  
  
  public RPNForm() {
    this.calc = new RPNCalculator();
  
    //setSize(660, 330);
    setBounds(300, 250, 660, 330);
    setDefaultCloseOperation(3);
    setTitle("  RPN Calculator");
    this.contentPane = getContentPane();
    this.contentPane.setLayout(new BorderLayout());
    
    this.displayPanel = new JPanel();
    this.displayPanel.setLayout(new BoxLayout(this.displayPanel, 0));
    this.displayPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(204, 153, 255)));
    
    this.RPNLabel = new JLabel(" RPN ");
    this.RPNLabel.setBackground(new Color(51, 0, 102));
    this.RPNLabel.setFont(new Font("Courier New", 1, 36));
    this.RPNLabel.setForeground(new Color(102, 51, 102));
    this.displayPanel.add(this.RPNLabel);
    
    this.displayTextField = new JTextField("");
    this.displayTextField.setFont(new Font("Courier New", 1, 24));
    this.displayTextField.setHorizontalAlignment(4);
    this.displayTextField.setActionCommand("Enter");
    this.displayTextField.addActionListener(this);
    this.displayPanel.add(this.displayTextField);
    this.contentPane.add(this.displayPanel, "North");
    
    this.buttonPanel = new JPanel();
    this.buttonPanel.setBackground(new Color(255, 239, 223));
    this.buttonPanel.setLayout(new GridLayout(4, 8));
    this.buttonPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(153, 255, 255)));
    
    this.buttonGrid = new JButton[4][8];
    
    for (int i = 0; i < 4; i++) {
      
      for (int j = 0; j < 8; j++) {
        
        this.buttonGrid[i][j] = new JButton();
        this.buttonGrid[i][j].setFont(new Font("Courier New", 1, 16));
        this.buttonGrid[i][j].addActionListener(this);
        this.buttonGrid[i][j].setBorder(BorderFactory.createBevelBorder(1));
        this.buttonPanel.add(this.buttonGrid[i][j]);
      } 
    } 
    this.buttonGrid[0][0].setText("exit");
    this.buttonGrid[0][1].setText("C");
    this.buttonGrid[0][2].setText("CE");
    this.buttonGrid[0][3].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[0][3].setBackground(new Color(240, 246, 255));
    this.buttonGrid[0][3].setForeground(new Color(153, 0, 102));
    this.buttonGrid[0][3].setText("7");
    this.buttonGrid[0][4].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[0][4].setBackground(new Color(240, 246, 255));
    this.buttonGrid[0][4].setForeground(new Color(153, 0, 102));
    this.buttonGrid[0][4].setText("8");
    this.buttonGrid[0][5].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[0][5].setBackground(new Color(240, 246, 255));//to make the button like in number 9
    this.buttonGrid[0][5].setForeground(new Color(153, 0, 102));
    this.buttonGrid[0][5].setText("9");
    this.buttonGrid[0][6].setText("+");
    this.buttonGrid[0][7].setText("x");
    this.buttonGrid[1][0].setText("STO");
    this.buttonGrid[1][1].setText("RCL");
    this.buttonGrid[1][2].setText("Up");
    this.buttonGrid[1][3].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[1][3].setBackground(new Color(240, 246, 255));
    this.buttonGrid[1][3].setForeground(new Color(153, 0, 102));
    this.buttonGrid[1][3].setText("4");
    this.buttonGrid[1][4].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[1][4].setBackground(new Color(240, 246, 255));
    this.buttonGrid[1][4].setForeground(new Color(153, 0, 102));
    this.buttonGrid[1][4].setText("5");
    this.buttonGrid[1][5].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[1][5].setBackground(new Color(240, 246, 255));
    this.buttonGrid[1][5].setForeground(new Color(153, 0, 102));
    this.buttonGrid[1][5].setText("6");
    this.buttonGrid[1][6].setText("-");
    this.buttonGrid[1][7].setText("/");
    this.buttonGrid[2][0].setText("Load");
    this.buttonGrid[2][1].setText("Save");
    this.buttonGrid[2][2].setText("Down");
    this.buttonGrid[2][3].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[2][3].setBackground(new Color(240, 246, 255));
    this.buttonGrid[2][3].setForeground(new Color(153, 0, 102));
    this.buttonGrid[2][3].setText("1");
    this.buttonGrid[2][4].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[2][4].setBackground(new Color(240, 246, 255));
    this.buttonGrid[2][4].setForeground(new Color(153, 0, 102));
    this.buttonGrid[2][4].setText("2");
    this.buttonGrid[2][5].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[2][5].setBackground(new Color(240, 246, 255));
    this.buttonGrid[2][5].setForeground(new Color(153, 0, 102));
    this.buttonGrid[2][5].setText("3");
    this.buttonGrid[2][6].setText("^");
    this.buttonGrid[2][7].setText("%");
    this.buttonGrid[3][0].setText("BSP");
    this.buttonGrid[3][1].setText("Stack");
    this.buttonGrid[3][2].setText("?");
    this.buttonGrid[3][3].setText("+/-");
    this.buttonGrid[3][4].setFont(new Font("Courier New", 1, 20));
    this.buttonGrid[3][4].setBackground(new Color(240, 246, 255));
    this.buttonGrid[3][4].setForeground(new Color(153, 0, 102));
    this.buttonGrid[3][4].setText("0");
    this.buttonGrid[3][5].setText(".");
    this.buttonGrid[3][6].setText("1/n");
    this.buttonGrid[3][7].setFont(new Font("Courier New", 1, 15));
    this.buttonGrid[3][7].setBackground(new Color(246, 240, 255));
    this.buttonGrid[3][7].setForeground(new Color(153, 0, 102));
    this.buttonGrid[3][7].setText("Enter");
    
    this.contentPane.add(this.buttonPanel, "Center");
    this.addWindowListener(new WindowAdapter() {
    	public void WindowClose(WindowEvent e) {
    		dealWith("exit");
    	}
    });
  }

  
  

  
  public void actionPerformed(ActionEvent event) { 
	  dealWith(event.getActionCommand()); //getActionCommand to get the text content button
	  }
 


 public void dealWith(String actionCommand) {
    
     if(actionCommand.equals("?")) {
    	RPN = false;
    	qustions = true;
     }
     
      //real action for the buttons 
	  if(RPN) {
     if(actionCommand.equals("exit")) {
    	 System.exit(0);
     }else if(actionCommand.equals("Stack")) {//call the stack frame
    	Singelton.stack();
     }else if(actionCommand.equals("RCL")) {//call the Recall frame 
    	Singelton.reCall();
     }else if(actionCommand.equals("STO")) {//numbet to the input field
    	 rpnStore.setVisible(true);
     }else if(actionCommand.equals("0")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("1")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("2")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("3")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("4")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("5")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("6")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("7")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("8")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("9")) {//numbet to the input field
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals(".")){//make the number double
    	 displayTextField.setText(disNumber(displayTextField.getText()) + actionCommand);
     }else if(actionCommand.equals("BSP")) {// to make backspce to the numbers in input
    	 displayTextField.setText(backSpace(displayTextField.getText()));
     }else if(actionCommand.equals("+/-")) {// changet the signal of number
    	 displayTextField.setText(changeSignal(displayTextField.getText()));
     }else if(actionCommand.equals("1/n")) {// divison one on the number
    	 displayTextField.setText(oneOnNumber(displayTextField.getText()));
     }else if(actionCommand.equals("Enter")) {//send the number to the stack
    	 addToStack(displayTextField.getText());
     }else if(actionCommand.equals("+")) {//action to plus button ,addition the top two number
    	 plus();
     }else if(actionCommand.equals("x")) {//action to multiply button ,mult the top two number
    	 multiply();
     }else if(actionCommand.equals("-")) {//action to subtract button, sub the top two number
    	 subtract();
     }else if(actionCommand.equals("/")) {//action to division button, division the top two number
    	 divi();
     }else if(actionCommand.equals("%")) {//action to mod button, mod the top two number
    	 mod();
     }else if(actionCommand.equals("^")) {//action to power button, pow the top two number
    	 pow();
     }else if(actionCommand.equals("C")) {//clear the stack
    	 clearAll();
     }else if(actionCommand.equals("CE")) {//remove the topStack
    	 removeTheTop();
     }else if(actionCommand.equals("Down")) {//change place of lastElment in the stack
    	 down();
     }else if(actionCommand.equals("Up")) {//change place of topStack
     	 up();
     }else if(actionCommand.equals("Save")) {//save the stack and register in files
    	 saveInFile();
     }else if(actionCommand.equals("Load")) {//load the stack and register from files
    	 loadFiles();
     }
	 }
	  //**********************details for each button in the RPNForm
	  if(qustions) {
		     displayTextField.setForeground(Color.BLUE);
	    	 if(actionCommand.equals("exit")) {
	    		 displayTextField.setText("exit the applecation"); 
	    		 RPN = true;
	    		 qustions = false;
	    	 }else if(actionCommand.equals("0")) {	 
	    		displayTextField.setText("number zero"); 
	    		RPN = true;
	    		 qustions = false;
	    	 }else if(actionCommand.equals("1")) {  
		    	displayTextField.setText("number one"); 
		    	RPN = true;
		    	 qustions = false;
		     }else if(actionCommand.equals("2")) {  	 
	    		displayTextField.setText("number two"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("3")) {    	 
	    		displayTextField.setText("number three"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("4")) {    	 
	    		displayTextField.setText("number four"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("5")) {
	    		displayTextField.setText("number five");  
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("6")) {       	 
	    		displayTextField.setText("number six");  
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("7")) {       	 
	    		displayTextField.setText("number saven"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("8")) {	        	 
	    		displayTextField.setText("number eight"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("9")) {	        	 
	    		displayTextField.setText("number nine");  
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("C")) {        	 
	    		displayTextField.setText("clear the stack"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("CE")) {	        	 
	    		displayTextField.setText("remove the top stack"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("Stack")) {        	 
	    		displayTextField.setText("display the stack"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("STO")) {	        	 
	    		displayTextField.setText("display RPN store");
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("RCL")) {
	    		displayTextField.setText("display recall frame"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("Save")) {
	    		displayTextField.setText("save the stack and register in file"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("Down")) {
	    		displayTextField.setText("travel the bottom to top stack"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("Up")) {
	    		displayTextField.setText("travel the top stack to bottom"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("Load")) {
	    		displayTextField.setText("load stack and register from file"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("BSP")) {
	    		displayTextField.setText("delete the last number in textField");
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("+/-")) {
	    		displayTextField.setText("change the signal"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("1/n")) {
	    		displayTextField.setText("reverse the number "); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("RCL")) {
	    		displayTextField.setText("recall the value from the register"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("Enter")) {
	    		displayTextField.setText("push to stack"); 
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("%")) {
	    		displayTextField.setText("operation topStack");
	    		RPN = true;
	    		 qustions = false;
	         }else if(actionCommand.equals("+")) {
	        	 displayTextField.setText("operation topStack");
	        	 RPN = true;
	        	 qustions = false;
	         }else if(actionCommand.equals("/")) {
	        	 displayTextField.setText("operation topStack");
	        	 RPN = true;
	        	 qustions = false;
	         }else if(actionCommand.equals("*")) {
	        	 displayTextField.setText("operation topStack");
	        	 RPN = true;
	        	 qustions = false;
	         }else if(actionCommand.equals("-")) {
	        	 displayTextField.setText("operation topStack");
	        	 RPN = true;
	        	 qustions = false;
	         }else if(actionCommand.equals("^")) {
	        	 displayTextField.setText("operation topStack");
	        	 RPN = true;
	        	 qustions = false;
	         }else if(actionCommand.equals(".")) {
	        	 displayTextField.setText("make the number double");
	        	 RPN = true;
	        	 qustions = false;
	         }

	     }
 }

 /*public String disNumber(String value) {
	 
	 if(value.equals("Error")) {
		 return "";
	 }
	 return value;
 }
*/
 public String disNumber(String value) {
	 int num;
	 char dot;
	 double num2;
	 displayTextField.setForeground(Color.BLACK);
	 try {
		 dot = value.charAt(value.length() - 1);
		 if(dot == '.') {
			 return value;
		 }else {
			 num = Integer.parseInt(value);
			 return Integer.toString(num);
		 }
	 } catch(Exception e) {
		 
		 try {
			 num2 = Double.parseDouble(value);
			 return Double.toString(num2);
		 }catch(Exception E) {
			 return "";
		 }
	
	 }
 }
 public String backSpace(String value) {
	 String finish;
	 try {
	  finish = value.substring(0, value.length()- 1);
	 } catch(Exception e) {
		 finish = " ";
	 }
	  return finish;
 }
 //to change the signal number in text Field
 public String changeSignal(String value) {
	  String finish;
	 try {
		 double num = Double.parseDouble(value);
		 num *= -1;
		  finish = Double.toString(num);
	 } catch(Exception e) {
		 finish = ""; 
	 }
	 /*double num = Double.parseDouble(value);
	 num *= -1;
	 String finish = Double.toString(num);*/
	 return finish;
 }
 public String oneOnNumber(String num) {
	 double value;
	 try {
	 value = Double.parseDouble(num);
	 value = 1/value;
	 value = (int)(value*100)/100.0;
	 } catch(Exception e){
		 return "";
	 }
	 
	 return Double.toString(value);
 }
 public void addToStack(String stringValue) { 
	 /*double value = Double.parseDouble(stringValue);
	 calc.theStack.push(value);*/
	 try {
	 double value = Double.parseDouble(stringValue);
	 calc.theStack.push(value);
	 StackMomery.list.add(0, value);
	 } catch(Exception e) {
		 System.out.println("");
	 }
	 displayTextField.setText("");
	 System.out.println(calc.theStack);
 }
 public void plus() {
	 if(calc.theStack.size() >= 2) {
	 double top = calc.theStack.pop();
	 StackMomery.list.remove(0);
	 double secound = calc.theStack.pop();
	 StackMomery.list.remove(0);
	 double value = top + secound;
	 StackMomery.list.add(0, value);
	 calc.theStack.push(value); 
	 } else {
		// display the error here with red color
		 displayTextField.setText("Error");
		 displayTextField.setForeground(Color.red);
	 }
	 
 }
 public void multiply() {
	 if(calc.theStack.size() >= 2) {
		 double top = calc.theStack.pop();
		 StackMomery.list.remove(0);
		 double secound = calc.theStack.pop();
		 StackMomery.list.remove(0);
		 double value = top * secound;
		 calc.theStack.push(value);
		 StackMomery.list.add(0, value);
	 }else {
		 // display the error here with red color
		 displayTextField.setText("Error");
		 displayTextField.setForeground(Color.red);
	 }
 }
  public void subtract() {
	 if(calc.theStack.size() >= 2) {
		 double top = calc.theStack.pop();
		 StackMomery.list.remove(0);
		 double secound = calc.theStack.pop();
		 StackMomery.list.remove(0);
		 double value = secound - top;
		 calc.theStack.push(value);
		 StackMomery.list.add(0, value);
	 }else {
		// display the error here with red color
		 displayTextField.setText("Error");
		  displayTextField.setForeground(Color.red);
	 }
	  
  }
  public void divi() {
	  if(calc.theStack.size() >= 2) {
		  double top = calc.theStack.pop();
		  StackMomery.list.remove(0);
		  double secound = calc.theStack.pop();
	      StackMomery.list.remove(0);
	      double value = secound / top;
	      calc.theStack.push(value);
		  StackMomery.list.add(0, value);
	  }else {
		// display the error here with red color
		  displayTextField.setText("Error");
		  displayTextField.setForeground(Color.red);
	  }
  }
  public void mod() {
	  if(calc.theStack.size() >= 2) {
		  double top = calc.theStack.pop();
		  StackMomery.list.remove(0);
		  double secound = calc.theStack.pop();
	      StackMomery.list.remove(0);
	      double value = secound % top;
	      calc.theStack.push(value);
		  StackMomery.list.add(0, value);
	  }else {
		// display the error here with red color
		  displayTextField.setText("Error");
		  displayTextField.setForeground(Color.red);
	  }
  }
  public void pow() {
	  if(calc.theStack.size() >= 2) {
		  double top = calc.theStack.pop();
		  StackMomery.list.remove(0);
		  double secound = calc.theStack.pop();
	      StackMomery.list.remove(0);
	      double value = Math.pow(secound, top);
	      calc.theStack.push(value);
		  StackMomery.list.add(0, value);
	  }else {
		// display the error here with red color
		  displayTextField.setText("Error");
		  displayTextField.setForeground(Color.red);
	  }
  }
  public void clearAll() {
	     calc.theStack.clear();
	     StackMomery.list.clear();
  }
  public void removeTheTop() {
	  try {
	    calc.theStack.remove();
	    StackMomery.list.remove(0);
	  }catch(Exception e) {
		  
	  }
  }
  
 
  public void up() {
	  try {
  		int index = 0;
  		double value = (Double)StackMomery.list.get(index);
  		StackMomery.list.remove(0);
  		StackMomery.list.add(RPNForm.calc.theStack.size() - 1, value);
  		LinkedList<Double> listStack = (LinkedList<Double>)calc.theStack;
  		listStack.remove(index);
  		listStack.add(RPNForm.calc.theStack.size(), value);
  		calc.theStack = listStack;
  		
  		
  	} catch(Exception e) {
  		
  	}
	  
  }
  public void down() {
	  try {
  		int index = RPNForm.calc.theStack.size() - 1;
  		double value = (Double)StackMomery.list.get(index);
  		StackMomery.list.remove(index);
  		StackMomery.list.add(0, value);
  		LinkedList<Double> listStack = (LinkedList<Double>)RPNForm.calc.theStack;
  		listStack.remove(index);
  		listStack.add(0, value);
  		calc.theStack = listStack;

  	} catch(Exception e) {
  		
  	}
  }
 
   void saveInFile() {
	  try {
	  FileOutputStream saveStack = new FileOutputStream("Stack.txt");//create file with name Stack.txt
	 
	  PrintStream outToStack = new PrintStream(saveStack);//create file with name Stack.txt
	
	  Object[] listStack  = StackMomery.list.toArray();
	  for(Object list1 : listStack) {
		  outToStack.println(list1);
	  }
	  FileOutputStream saveRegistar = new FileOutputStream("register.txt");//create file with name register.txt
	  PrintStream outToRegister = new PrintStream(saveRegistar);//use this object to send data to register.txt
	  for(Register fileRegister: RPNForm.calc.register) {
		//to add the element to the file register.txt
		  outToRegister.println(fileRegister.getName() 
				  + " = " + fileRegister.getValue() + " " + fileRegister.getLabel());
		
	  }
	
	  
	  } catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
  }
  void loadFiles() {
      loadStack();// load the stack from the file 
      loadRegister();// load the register from the file
	 
  }
  void loadStack() {
	  StackMomery.list.clear();
	  calc.theStack.clear();
	  File stack = new File("Stack.txt");
	  try {
		 
		  Scanner inputFromStackFile = new Scanner(stack);
		  while(inputFromStackFile.hasNext()) {// to read the value from file and store it in the Stack
			  String value = inputFromStackFile.next();
			 calc.theStack.addLast(Double.parseDouble(value));
			 
		  }
		  LinkedList<Double> testList = (LinkedList<Double>)calc.theStack;//to use method get
		  for(int i = 0; i < testList.size(); i++) {
			  StackMomery.list.addElement(testList.get(i));
		  }
		  
	  } catch(Exception e) {
		  System.out.print(e.getMessage());
	  }
  }
  
  
  
  
  void loadRegister(){
	  RpnStore.model.clear();
	  File inputFileRegister = new File("register.txt");
	  String name, getValue, label;//to take each Element and put it in register array
	  Scanner inputFromRegisterFile = null;
	  try {
		   inputFromRegisterFile = new Scanner (inputFileRegister);
		  int i = 0;
		  while(inputFromRegisterFile.hasNext()) {
			  
			name = inputFromRegisterFile.next();
			inputFromRegisterFile.next();
			
			getValue = inputFromRegisterFile.next();
			label = inputFromRegisterFile.nextLine();
			
			double value = Double.parseDouble(getValue);
			 calc.register[i].setName(name);
			 calc.register[i].setValue(value);
			 calc.register[i].setLable(label);
			 RpnStore.model.addElement(calc.register[i]);
			 
			 i++;
		  }
	  } catch(Exception e) {
		  
	  }finally {
		  inputFromRegisterFile.close();
	  }
	  
  }
  void quastion() {
	  
	  
  }
 
 
 
}

