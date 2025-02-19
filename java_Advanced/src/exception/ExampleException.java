package exception;
import javax.swing.*;
//will continue today 
public class ExampleException {
	public static void main(String args[]) {
		Boolean wrong = true;
		while(wrong) {
		try {
		String x = JOptionPane.showInputDialog("enter any number");
		int y = Integer.parseInt(x);
		JOptionPane.showMessageDialog(null, y);
		wrong = false;
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "wrong value");
			wrong = true;
		}
		
	}
	}

}
