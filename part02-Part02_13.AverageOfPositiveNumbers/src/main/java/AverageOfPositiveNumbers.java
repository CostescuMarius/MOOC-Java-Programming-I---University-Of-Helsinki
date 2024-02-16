
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int noOfPositiveNumbers = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0) {
                break;
            } else if(number > 0){
                sum += number;
                noOfPositiveNumbers++;
            }
        }
        
        if(noOfPositiveNumbers > 0) {
            System.out.println(1.0 * sum / noOfPositiveNumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
