package Hamdi;

public class Person {
	public String name;
	boolean stayAtHome;
	boolean infeacted;
	Person(String name){
		this.name = name;
	}
	Person(String name, boolean stayAtHome){
		this.name = name;
		this.stayAtHome = stayAtHome;
	}
	
	public String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
    void setStayAtHome(boolean stayAtHome) {
    	this.stayAtHome = stayAtHome;
	}
    void setInfected(boolean infeacted) {
    	this.infeacted = infeacted;
    }
	public boolean isStayAtHome() {
		return this.stayAtHome;
	}
	public boolean isInfected() {
		return this.infeacted;
	}
	public String tostring() {
	String value = "the name " + this.name + " stay At Home " + this.stayAtHome + "are this person infected " + this.infeacted;
		return value;
	}

}
