import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number to calculate the factorial");

        try{
            int number = Integer.parseInt(scanner.nextLine());
            int copyOfNumber = number - 1;
            int result = 0;
            

            for(int i = 0; i < number; i++){
                if(i == 0){
                    result = number * copyOfNumber;
                    copyOfNumber--;
                }else if (copyOfNumber != 0){
                    result = result * copyOfNumber;
                    copyOfNumber--;
                }
            }

            System.out.println("The factorial of " + number + " is: " + result);
            scanner.close();
        }catch(NumberFormatException e){
            System.out.println("Just put numbers, please!");
        }

    }
}
