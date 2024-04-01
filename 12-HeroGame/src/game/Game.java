package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the Hero game, create your hero and fight against monsters. Good luck!");
        
        String name;
        int life;
        int strength;
        boolean shield;
        Hero hero = null;

        try{
            System.out.println("What's the name of your hero?");
            name = scanner.nextLine();

            System.out.println("Now the life points of your hero (You can't pass 100)");
            life = Integer.parseInt(scanner.nextLine());

            System.out.println("Now the strength of your hero (The max is 30)");
            strength = Integer.parseInt(scanner.nextLine());

            System.out.println("Your hero gonna have a shield? Case yes type 'yes', case not type 'not'");
            String choose = scanner.nextLine();
            if(choose.equals("yes")){
                shield = true;
            }else {
                shield = false;
            }

            hero = new Hero(name, life, strength, shield);
        }catch(NumberFormatException e){
            System.out.println("In life and atack choose just numbers!");
        }

        Monster monster1 = new Monster("Araxys", 100, 12, 2);
        Monster monster2 = new Monster("Prism", 200, 20, 3);
        Monster monster3 = new Monster("Singular", 300, 30, 3);

        System.out.println("Your first battle is against " + monster1.getName() + " ,Good luck");
        //First Battle
        do{
        System.out.println("Your enemy stats: \n" + "Name: " + monster1.getName() + "\nLife: " + monster1.getLife() + "\nStrength: " + monster1.getStrenght() + "\nPower:" + monster1.power);

        System.out.println("What you gonna do?\n1-Atack\n2-See the hero's life\n3-See the hero's strength\n4-See if hero has shield");
        int atack = 0;
        try{
            int choose = Integer.parseInt(scanner.nextLine());
            switch(choose){
                case 1:
                    atack = hero.atack();
                break;
                case 2:
                    System.out.println("Your life: " + hero.getLife());
                break;
                case 3:
                    System.out.println("Your strength: " + hero.getStrenght());
                break;
                case 4:
                    System.out.println("Shield: " + hero.hasShield());
                break;
                default:
                    System.out.println("Number incorrect");
                break;
            }

            if(atack > 0){
                monster1.life = monster1.getLife() - atack;
                if(hero.hasShield() == true) {
                	hero.shield = false;
                }else {
                	hero.life = hero.getLife() - monster1.atack();
                }
                
            }
        }catch(NumberFormatException e){
            System.out.println("Please, just choose numbers");
        }
        }
        while(hero.isAlive() == true);
        
        if(hero.isAlive() == false) {
        	System.out.println("Unfortunaly you dead, good luck in the next battle");
        }
        
        scanner.close();
        
        

    }
}
