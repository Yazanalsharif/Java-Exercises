package Hamdi;

import javax.swing.JOptionPane;


public class Virus {
	private String name;
	private int discoveryYear;
	
	Virus(){
		
	}
    Virus(String name, int discoverYear) {
		this.discoveryYear = discoverYear;
		this.name = name;
	}
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void setDiscoveryYear(int discoverYear) {
    	this.discoveryYear = discoverYear;
    }
    public int getDiscoveryYear() {
    	return this.discoveryYear;
    }
    
    public boolean isOlder(Virus v1) {
    	if(v1 != null && this.discoveryYear < v1.discoveryYear) {
    		return true;
    	}
    	return false;
    }
    public static boolean isOlder(Virus v1, Virus v2) {
    	if(v1 != null && v2 != null) {
    		if(v1.discoveryYear < v2.discoveryYear) {
    			return true;
    		}
    	}
    	return false;
    }
    public void  printVirus() {
    	JOptionPane.showMessageDialog(null,"the name => " + this.name + "the discoveryYear " + this.discoveryYear);
    }

}
