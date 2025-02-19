package Hamdi;

public class Country {
	public String name;
	Person people[] = new Person[100];
	 int numOfPeople;
	
	Country(String name) {
		this.name = name;
	}
	public void addPerson(Person person) {
		people[numOfPeople] = person;
		numOfPeople++;
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public String getName() {
		return this.name;
	}
	public Person[] getPeople() {
		return this.people;
	}
	public void transmiteVirus() {
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * numOfPeople) ;
			if(people[random].stayAtHome == false) {
				people[random].infeacted = true;
			}
		}
	}

}
