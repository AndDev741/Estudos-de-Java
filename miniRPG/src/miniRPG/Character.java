package miniRPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character {
	private String name;
	private String element;
	private List<Item> backpack;
	private int life;
	private int strength;
	private int elementPower;
	private boolean isDead;
	
	public Character(String name, String element) {
		setName(name);
		setElement(element);
		ElementPower(getElement());
		setLife(500);
		setStrength(15);
		backpack = new ArrayList<>();
		isDead = false;
	}
	
	//Getters
	public Item getBackpack(String item) {
			for (int i = 0; i < backpack.size(); i++) {
				if(backpack.get(i).getName().equals(item)) {
					return backpack.get(i);
				}
			}
			return null;
	}
	protected String getElement() {
		return element;
	}
	protected int getElementPower() {
		return elementPower;
	}
	protected int getLife() {
		return life;
	}
	protected String getName() {
		return name;
	}
	protected int getStrength() {
		return strength;
	}
	
	//Setters
	protected void setElement(String element) {
		this.element = element;
	}	
	protected void setElementPower(int elementPower) {
		this.elementPower = elementPower;
	}
	protected void setLife(int life) {
		this.life = life;
		if(life > 500) {
			life = 500;
		}
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setStrength(int strength) {
		this.strength = strength;
	}
	
	//methods
	
	public boolean isDead() {
		if(getLife() <= 0) {
			isDead = true;
			return isDead;
		}else {
			return false;
		}
	}
	
	public void status() {
		System.out.println("Status of " + getName());
		System.out.println("Your element: " + getElement());
		System.out.println("Your life: " + getLife());
		System.out.println("Your strength: " + getStrength());
		System.out.println("Your element Power: " + getElementPower());
		System.out.print("You items: ");
		if(backpack.size() == 0) {
			System.out.println("You don't have any items");
		}else {
			for (Item item : backpack) {
				System.out.println("- " + item.getName() + ", " + item.getDescription() + ", value: " + item.getValue());
			}
		}
	}
	
	public List<Item> addItemInBackpack(Item item) {
		backpack.add(item);
		return backpack;
	}
	
	public List<Item> removeItemFromBackpack(Item item) {
		backpack.remove(item);
		return backpack;
	}
	
	public void practice() {
		setStrength(this.strength + 5);
		if(getStrength() >= 50) {
			setStrength(50);
		}
	}
	
	public void healLife(String item, int value) {
		if(item.equals("Life Bottle")) {
			if(getLife() < 100) {
				setLife(this.life + value);
				if(getLife() >= 100) {
					setLife(100);
				}
				@SuppressWarnings("unlikely-arg-type")
				int index = backpack.indexOf(item) + 1;
				backpack.remove(index);
			}
			
		}
	}
	
	public void changeElement(String item) {
		if(item.equals("Element Changer") == true) {
			Random random = new Random();
			int number = random.nextInt(4);
			String newElement;
			switch(number) {
				case 0:
					newElement = "fire";
				break;
				case 1:
					newElement = "water";
				break;
				case 2:
					newElement = "ground";
				break;
				case 3:
					newElement = "plant";
				break;
				case 4:
					newElement = "rock";
				break;
				default:
					newElement = item;
				break;
			}
			
			setElement(newElement);
			@SuppressWarnings("unlikely-arg-type")
			int index = backpack.indexOf(item) + 1;
			backpack.remove(index);
		}
	}
	
	public void ElementPower(String element) {
		switch(getElement()) {
			case "fire":
				setElementPower(3);
			break;
			case "water":
				setElementPower(4);
			break;
			case "ground":
				setElementPower(3);
			break;
			case "plant":
				setElementPower(2);
			break;
			case "rock":
				setElementPower(4);
			break;
			default:
				setElementPower(2);
			break;
		};
	}
	
}
