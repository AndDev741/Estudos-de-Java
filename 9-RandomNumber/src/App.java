import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Guess The Number, choose one number from 0 to 10 and good luck");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(10);

        try{
            int scanTry = Integer.parseInt(scanner.nextLine());
            int trys = 0;
            do
            {
                if(randomNumber > scanTry){
                    System.out.println("You failed, the random number is greater than " + scanTry);
                }else{
                    System.out.println("You failed, the random number is smallest than " + scanTry);
                }
                trys++;
                scanTry = Integer.parseInt(scanner.nextLine());
            }
            while(scanTry != randomNumber);

            if(randomNumber == scanTry){
                if(trys == 0 || trys == 1){
                    System.out.println("Congratulations, you find the number: " + randomNumber + ". You tried " + trys + " time");
                }else{
                    System.out.println("Congratulations, you find the number: " + randomNumber + ". You tried " + trys + " times");
                }
                scanner.close();
            }

        } catch(NumberFormatException e){
            System.out.println("Please, just write numbers!");
        }

    }
}
