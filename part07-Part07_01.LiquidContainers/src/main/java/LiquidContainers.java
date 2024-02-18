
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            //System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int quantity = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                if(quantity > 0) {
                    first += quantity;
                }
                
                if(first > 100) {
                    first = 100;
                }
            } else if (parts[0].equals("move")) {
                if(quantity > 0) {
                    if(first - quantity >= 0) {
                        first -= quantity;
                        second += quantity;
                    } else {
                        second += first;
                        first = 0;
                    }
                }
                
                if(second > 100) {
                    second = 100;
                }
            } else if (parts[0].equals("remove")) {
                if(quantity > 0) {
                    second -= quantity;
                }
                
                if(second < 0) {
                    second = 0;
                }
            }
        }
    }

}
