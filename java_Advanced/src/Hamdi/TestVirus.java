package Hamdi;

import javax.swing.JOptionPane;

public class TestVirus {
	public static void main(String args []) {
		 Virus viruses[] = new Virus[5];
		 viruses[0] = new Virus("covid-19", 2019);
		 viruses[1] = new Virus("covid-12", 2000);
		 viruses[2] = new Virus("edze", 1999);
		 viruses[3] = new Virus("h", 2019);
		 viruses[4] = new Virus("5anzer", 2006);
		 newest(viruses);
	 }
	 
	 public static void newest(Virus v[]) {
		 Virus theNewest = v[0];
		 for(int i = 0; i < 5; i++) {
			 if(theNewest.isOlder(v[i])) {
				 theNewest = v[i];
			 }
		 }
JOptionPane.showMessageDialog(null, "the newest Virus Name => " 
		 + theNewest.getName() + 
		 "year discovered " + 
		 theNewest.getDiscoveryYear());
	 }

}
