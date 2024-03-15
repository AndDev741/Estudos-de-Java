import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choise an operation to do: \n 1-Sum \n 2-Subtraction \n 3-Multiplication \n 4-Division \n 5-Square root \n 6-Exponentiation \n 7-Random Number");
            int choise = Integer.parseInt(scanner.nextLine());

            switch(choise){
                case 1:
                try{
                    System.out.println("Choise the first number to add");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Choise the second number to add");
                    int n2 = Integer.parseInt(scanner.nextLine());
    
                    int result = n1 + n2;
                    System.out.println("The result of the sum is: " + result);
                }catch(NumberFormatException e){
                    System.out.println("Please, just choise numbers in the operations");
                }
                break;
    
                case 2:
                try{
                    System.out.println("Choise the first number to subtract");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Choise the second number to subtract");
                    int n2 = Integer.parseInt(scanner.nextLine());
    
                    int result = n1 - n2;
                    System.out.println("The result of the subtraction is: " + result);
                }catch(NumberFormatException e){
                    System.out.println("Please, just choise numbers in the operations");
                }
                break;
    
                case 3:
                try{
                    System.out.println("Choise the first number to multiply");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Choise the second number to multiply");
                    int n2 = Integer.parseInt(scanner.nextLine());
    
                    int result = n1 * n2;
                    System.out.println("The result of the multiplication is: " + result);
                }catch(NumberFormatException e){
                    System.out.println("Please, just choise numbers in the operations");
                }
                break;
    
                case 4:
                try{
                    System.out.println("Choise the first number to divide");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Choise the second number to divide");
                    int n2 = Integer.parseInt(scanner.nextLine());
    
                    int result = n1 / n2;
                    System.out.println("The result of the division is: " + result);
                }catch(NumberFormatException e){
                    System.out.println("Please, just choise numbers in the operations");
                }
                break;
    
                case 5:
                try{
                    System.out.println("Choise the number to take the square root");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    double result = Math.sqrt(n1);
                    System.out.println("The square root of " + n1 + " is: " + result);
                }catch(NumberFormatException e){
                    System.out.println("Please, just choise numbers in the operations");
                }
                break;
    
                case 6:
                try{
                    System.out.println("Choise the number to exponentiate");
                    int n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Choise the exponent: ");
                    int n2 = Integer.parseInt(scanner.nextLine());
    
                    double result = Math.pow(n1, n2);
    
                    System.out.println("The result of the exponentiation is: " + result);
                }catch(NumberFormatException e){
                    System.out.println("Please, just choise numbers in the operations");
                }
                break;
                
                case 7:
                Random random = new Random();
                System.out.println("Whats gonna be the longest number of the random number?");
                int n1 = Integer.parseInt(scanner.nextLine());
                int result = random.nextInt(n1);
                System.out.println("Your random number is: " + result);
                break;
    
                default:
                System.out.println("An error ocurred, restart the application.");
                break;
            }
            scanner.close();
    
        }catch(NumberFormatException e){
            System.out.println("Please, just choise numbers!");
        }

    }
}
