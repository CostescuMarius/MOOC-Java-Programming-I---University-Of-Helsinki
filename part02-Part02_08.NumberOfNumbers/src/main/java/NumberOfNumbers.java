
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfNumbers = 0;
        
        while(true) {
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0) {
                break;
            } else {
                noOfNumbers++;
            }
        }
        
        System.out.println("Number of numbers: " + noOfNumbers);
    }
}
