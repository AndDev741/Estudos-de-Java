package Animals;

public class Animal {
	private String Name;
	private int age;
	private int paws;
	private String species;
	
	public Animal(String name, int age, int paws, String species) {
		setName(name);
		setAge(age);
		setPaws(paws);
		setSpecies(species);
	}
	
	public void status() {
		System.out.println("Name of the animal: " + getName());
		System.out.println("Age of the animal: " + getAge());
		System.out.println("Quantity of paws of the animal: " + getPaws());
		System.out.println("The species of the animal: " + getSpecies());
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return Name;
	}
	public int getPaws() {
		return paws;
	}
	public String getSpecies() {
		return species;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPaws(int paws) {
		this.paws = paws;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
}
