package miniRPG;

import java.util.Random;

public class Game {
	private Character character;
	private Monster[] monsters;
	private int index;
	private int laps;
	
	public Game(Character character, Monster[] monsters, int laps) {
		setCharacter(character);
		setMonster(monsters);
		setLaps(laps);
		setIndex(0);
	}
	
	public void status() {
		System.out.println("Status of the game:");
		System.out.println("Your character: " + character.getName());
		System.out.println("The monster: " + monsters[index].getName());
		System.out.println("The lap: " + (index + 1) + "°");
		
	}
	
	public Character getCharacter() {
		return character;
	}
	public Monster[] getMonster() {
		return monsters;
	}
	public int getIndex() {
		return index;
	}
	public int getLaps() {
		return laps;
	}
	
	public void setCharacter(Character character) {
		this.character = character;
	}
	public void setMonster(Monster[] monsters) {
		this.monsters = monsters;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public void setLaps(int laps) {
		this.laps = laps;
	}	
	
	//methods
	
	public void atack() {
		Random randomNumber = new Random();
		int characterAtack = Math.abs(character.getStrength() * character.getElementPower() - randomNumber.nextInt(50));
		int enemyAtack = Math.abs(monsters[index].getStrength() * monsters[index].getElementPower() - randomNumber.nextInt(50));
		if(character.getElementPower() > monsters[index].getElementPower()) {
			characterAtack *= 2;
		}else if(character.getElementPower() < monsters[index].getElementPower()) {
			enemyAtack *= 2;
		}
		character.setLife(character.getLife() - enemyAtack);
		monsters[index].setLife(monsters[index].getLife() - characterAtack);
	}
	
	public void startLaps() {
		do {
			if(monsters[index].getLife() <= 0) {
				System.out.println("The " + (index + 1) + "° monster died");
				laps -= 1;
				index += 1;
			}
			if(character.isDead() == true) {
				System.out.println("You Died!");
				laps = 0;
			}
			atack();	
		}
		while(laps > 0);
		System.out.println("Acabou o game");
	}
	
	
}
