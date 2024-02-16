
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        
        int sum = 0;
        int noOfNumbers = 0;
        int noOfEvenNumbers = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            } else {
                sum += number;
                noOfNumbers++;
                
                if(number % 2 == 0) {
                    noOfEvenNumbers++;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + noOfNumbers);
        System.out.println("Average: " + (1.0 * sum / noOfNumbers));
        System.out.println("Even: " + noOfEvenNumbers);
        System.out.println("Odd: " + (noOfNumbers - noOfEvenNumbers));
    }
}
