package miniRPG;

public class Main {
	public static void main(String[] args) {
		Character character = new Character("Jorge", "fire");
		Monster monster1 = new Monster("Big Tree", "plant", 250, 10);
		Monster monster2 = new Monster("Gran'Orc", "ground", 300, 20);
		Monster monster3 = new Monster("Mutant shark", "water", 350, 30);
		Monster[] monsters = {monster1, monster2, monster3};
		
		Item lifeBottle = new Item("Life Bottle", "Heal your life", 20);
		Item elementChanger = new Item("Element Changer", "Change your element to a random element", 0);
		character.practice();
		character.practice();
		character.practice();
		character.practice();
		character.practice();
		character.practice();
		character.practice();
		character.practice();
		Game game = new Game(character, monsters, monsters.length);
		game.startLaps();
	}
}
