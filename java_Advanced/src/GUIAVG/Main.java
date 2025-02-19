package GUIAVG;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener {
	Container container;
	JButton button;
	JTextField texts[];
	JTextArea area;
	Main(){
		super("avarge");
		container = getContentPane();
		this.setLayout(null);
		this.texts = new JTextField[6];
		int x = 50;// to make the fields goood 
		for(int i = 0; i < 6; i++) {
		texts[i] = new JTextField();//end loop
		texts[i].setBounds(60, x, 100, 25);
		add(texts[i]);
		x += 25;
		}
		button = new JButton("THE AVARGE");
		button.setBounds(60, 200, 100, 25);
		button.addActionListener(this);
		add(button);
		area = new JTextArea();
		area.setBounds(10, 230, 220, 50);
		add(area);
		setBounds(0, 0, 250, 350);
		setVisible(true);
		setResizable(false);

	}
	public static void main(String  args[]) {
		new Main();
	}
	
	public void actionPerformed(ActionEvent e) {
		double subject = 0.0;
		for(int i = 0; i < 6; i++) {
			subject += Double.parseDouble(texts[i].getText());
		}
		double avg = subject / 6;
		area.setText(Double.toString(avg));
		
		
	}
	

}
