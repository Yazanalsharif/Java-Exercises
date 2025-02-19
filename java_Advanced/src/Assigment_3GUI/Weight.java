package Assigment_3GUI;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;



public class Weight extends JFrame implements ActionListener{
	
	Container container;
	JLabel length, gender, hobbies, rideHorse, gym, coding;
	JCheckBox ride, gy, code;
	JButton button;
	JTextArea area;
	JTextField text;
	JComboBox box;
	public Weight() {
		super("Ideal Weight");
		container = getContentPane();
		setLayout(null);
		
	 // length has label and textField
	  length = new JLabel("Length");
	  length.setBounds(20, 20, 100, 20);
	  text = new JTextField();
	  text.setBounds(120, 20, 100, 20);
	  add(length);//add to frame 
	  add(text);//add to frame 
	  
	  // gender and combo box
	  gender = new JLabel("Gender");
	  gender.setBounds(20, 60, 100, 20);
	  box = new JComboBox();
	  box.addItem("Female");
	  box.addItem("Male");
	  box.setSelectedIndex(0);
	  box.setBounds(120, 60, 100, 20);
	  add(gender);
	  add(box);
	  // hobbies && checkBox
	  hobbies = new JLabel("Hobbies");
	  hobbies.setBounds(20, 100, 100, 20);
	  add(hobbies);
	  //ridehorse checkBox
	  ride = new JCheckBox();
	  ride.setBounds(20, 130, 20, 20);
	  rideHorse = new JLabel("Horses");
	  rideHorse.setBounds(40, 130, 50, 20);
	  add(ride);
	  add(rideHorse);
	  // gym 
	  gy = new JCheckBox();
	  gy.setBounds(110, 130, 20, 20);
	  gym = new JLabel("Gym");
	  gym.setBounds(130, 130, 50, 20);
	  add(gy);
	  add(gym);
	  //coding 
	  code = new JCheckBox();
	  code.setBounds(200, 130, 20, 20);
	  coding = new JLabel("Coding");
	  coding.setBounds(220, 130, 50, 20);
	  add(code);
	  add(coding);
	  //button 
	  button = new JButton("Click here");
	  button.setBounds(82, 170, 100, 20);
	  button.addActionListener(this);
	  add(button);
	  //textArea 
	  area = new JTextArea();
	  area.setBounds(20, 200, 240, 80);
	  add(area);
	  addWindowListener(new WindowAdapter() {

	        @Override
	        public void windowClosing(WindowEvent e) {
	         Singelaton.singleFrame = null;
	        }
	    });
	

	  this.setResizable(false);
	  setBounds(100, 150, 300, 340);
	  setVisible(true);// to display the frame 
	  
	}
	public double idealWeight(String height, String gender) {
		double weight = 0;
		
		try {
			double cast = Double.parseDouble(height);
			double length = cast - 100.0;
			if(gender.equals("male")) {
				weight = length - 0.07*length;
			} else {
				weight = length - 0.1 * length;		
			} 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "please input number to length", "Error", JOptionPane.ERROR_MESSAGE);
			return 0.0;
			
		}
		return weight;
		
	}
	public void actionPerformed(ActionEvent e) {
	
		Object o = box.getSelectedItem();// the get the data from comboBox return object
		String gender = o.toString();// to changer the object to string 
		String  hoppies = "";
		if(ride.isSelected()) {
			hoppies += "RideHorses, ";
		} 
		if(gy.isSelected()) {
			hoppies += "Gym, ";
		} 
		if(code.isSelected()) {
			hoppies += "Coding, ";
		}
		if(hoppies.equals(""))
		{
			hoppies = "Nothing";
		}
		double weight = idealWeight(text.getText(), gender);
		if (weight == 0.0) {
			
			area.setText("your length " + "Error" + "\n" +
		             "your gender " + gender + "\n" +
				     "your hoppies " + hoppies + "\n" +
		             "error in weight"	      
		 );
			
		} else {
		area.setText("your length " + text.getText() + "\n" +
		             "your gender " + gender + "\n" +
				     "your hoppies " + hoppies + "\n" +
		             "your ideal weight is " + weight 	      
		 );
		}
	}
	
	
	public static void main(String args []) {
		new Weight();
	}
	
	

}
