
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.valueOf(scanner.nextLine());
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        while(lastNumber != firstNumber - 1) {
            sum += lastNumber;
            lastNumber--;
        }
        
        System.out.println("The sum is " + sum);
    }
}
