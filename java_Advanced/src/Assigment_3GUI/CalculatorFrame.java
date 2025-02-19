package Assigment_3GUI;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;


public class CalculatorFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Container c;
	JLabel number_1, number_2, result;
	JTextField text_1, text_2, text_3;
	JButton addition, close;
	JPanel panel;
	public CalculatorFrame() {
		super("Calcalator Frame");
	
		c = getContentPane();
		panel = new JPanel(null);
		//make object from labels
		number_1 = new JLabel("Number 1");
		number_2 = new JLabel("Number 2");
		result = new JLabel("result");
		//locating the label in panel
		number_1.setBounds(50, 50, 80, 10);
		number_2.setBounds(50, 100, 80, 10);
		result.setBounds(50, 150, 80, 10);
		//adding the label to panel
		panel.add(number_1);
		panel.add(number_2);
		panel.add(result);
        //make object from text field
		text_1 = new JTextField();
		text_2 = new JTextField();
		text_3 = new JTextField();
		//locating the textFields in panel
		text_1.setBounds(120, 50, 150, 20);// JText to number 1 
		text_2.setBounds(120, 100, 150, 20);// JText to number 2
		text_3.setBounds(120, 150, 150, 20);// JText to result
		//make enable editing
		
		text_3.setEditable(false);
		// add the textFields to panel
		add(text_1);
		add(text_2);
		add(text_3);
		//make the button adding and locating and add him to panel and make action 
		addition = new JButton("Add");
		addition.setBounds(80, 200, 70, 30);
		addition.addActionListener(this);
		panel.add(addition);
		//make the exit button 
		close = new JButton("Exit");
		close.setBounds(200, 200, 70, 30);
		close.addActionListener(this);
		panel.add(close);
		//some edit to JFrame
		add(panel);
		setBounds(400, 100, 350, 300);
		setResizable(false);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent e) {
			 Singelaton.calcu = null;
			
		 }
			 
		      
		});
		
		
		
	}
	public static void main(String args[]) {
		new CalculatorFrame();
	}
	
	public  void actionPerformed(ActionEvent event) {
		if(event.getSource() == addition) {
			add(text_1.getText(), text_2.getText());
		} else if(event.getSource() == close) {
			    Singelaton.calcu = null;
		        setVisible(false);
		}
		
		
	}
	public void add(String x, String y) {
		try {
		double num1, num2, result;
		num1 = Double.parseDouble(x);
		num2 = Double.parseDouble(y);
		result = num1 + num2;
		text_3.setText(Double.toString(result));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "only Numbers");
		} finally {
	
		}
		
		
	}
	
	
	

}
