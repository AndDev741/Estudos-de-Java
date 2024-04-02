package game;

public class Monster {
    String name;
    int life;
    int strength;
    int power;
    boolean alive;

    public Monster(String name, int life, int strength, int power){
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.power = power;
        alive = true;
    }

    public String getName(){
        return name;
    }

    public int getLife(){
        return life;
    }

    public int getStrenght(){
        return strength;
    }

    public int atack(){
        int atack = power * strength;
        return atack;
    }
    
    public boolean isAlive() {
    	if(life <= 0) {
    		alive = false;
    	}
    	return alive;
    }

    
}
