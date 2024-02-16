
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        if(number > 0) {
            while(number != 0) {
                factorial *= number;
                number--;
            }
        }

        System.out.println("Factorial: " + factorial);
    }
}
