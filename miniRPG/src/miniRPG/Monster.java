package miniRPG;

public class Monster implements Enemy {
	private String name;
	private String element;
	private int life;
	private int strength;
	private int elementPower;
	
	public Monster(String name, String element, int life, int strength) {
		setName(name);
		setElement(element);
		setLife(life);
		setStrength(strength);
		ElementPower(getElement());
	}
	
	public void status() {
		System.out.println("Status of the monster " + getName());
		System.out.println("His element: " + getElement());
		System.out.println("His life: " + getLife());
		System.out.println("His strength: " + getStrength());
		System.out.println("His element Power: " + getElementPower());
	}
	
	//Getters
	public String getElement() {
		return element;
	}
	public int getElementPower() {
		return elementPower;
	}
	public int getLife() {
		return life;
	}
	public String getName() {
		return name;
	}
	public int getStrength() {
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
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setStrength(int strength) {
		this.strength = strength;
	}
	
	//Methods
	public boolean isDied() {
		if(getLife() <= 0) {
			return true;
		}
		return false;
	}
	
	@Override
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
	@Override
	public void receiveDamage(int damage) {
		life = getLife() - damage;
		isDied();
	}
	@Override
	public Item dropItem() {
		Item lifeBottle = new Item("Life Bottle", "Heal your life", 20);
		return lifeBottle;
	}

}
