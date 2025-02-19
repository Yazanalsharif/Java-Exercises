package Hamdi;

public class TestCountry {
	public static void main(String args[]) {
	   Country egypt = new Country("Egypt");
	   addGuys(egypt);
	   egypt.transmiteVirus();
	   egypt.transmiteVirus();
	   egypt.transmiteVirus();
	   for(int i = 0; i < egypt.getNumOfPeople(); i++) {
		   if(egypt.people[i].isInfected()) {
			   System.out.println("the person => " + egypt.people[i].getName() + " is ingected");
		   }
	   }
	   
	}
	
	public static void addGuys(Country country) {
		country.addPerson(new Person("hamdi", false));
		country.addPerson(new Person("ali", true));
		country.addPerson(new Person("mohammed", false));
		country.addPerson(new Person("qusai", false));
		country.addPerson(new Person("yazed", false));
		country.addPerson(new Person("osama", false));
		country.addPerson(new Person("ameer", true));
		country.addPerson(new Person("kefah", false));
		country.addPerson(new Person("meme", false));
		country.addPerson(new Person("serena", false));
		country.addPerson(new Person("rouu", false));
		country.addPerson(new Person("yousef", false));
	}

}
