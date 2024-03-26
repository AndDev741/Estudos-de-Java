package game;

import java.util.Random;

class Hero {
    String name;
    int life;
    int strength;
    boolean shield;
    int money;
    boolean alive;

    //When instantiating the class, this method will be called
    public Hero(String name, int life, int strength, boolean shield){
        this.name = name;

        if(life > 100){
            this.life = 100;
        }else{
            this.life = life;
        }
        
        if(strength > 30){
            this.strength = 30;
        }else{
            this.strength = strength;
        }
        
        this.shield = shield;
        alive = true;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life; 
    }

    public int getStrenght() {
        return strength;
    }

    public boolean hasShield() {
        return shield;
    }

    public int atack() {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        int atack = randomNumber * strength;
        return atack;
    }
    
    public boolean isAlive() {
    	if(life <= 0) {
    		alive = false;
    	}
    	return alive;
    }

}
