package Animals;

public class Dog extends Animal {
	private String race;
	
	public Dog(String name, int age, int paws, String species, String race) {
		super(name, age, paws, species);
		setRace(race);
	}
	
	@Override
	public void status() {
		super.status();
		System.out.println("The race of the dog is: " + race);
	}
	
	public void nose() {
		System.out.println("The dog is nosing");
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
}
