
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int quantity = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                first.add(quantity);
            } else if (parts[0].equals("move")) {
                if(quantity > 0) {
                    if(first.contains() - quantity >= 0) {
                        first.remove(quantity);
                        second.add(quantity);
                    } else {
                        second.add(first.contains());
                        first.remove(first.contains());
                    }
                }
                
                if(second.contains() > 100) {
                    second.remove(second.contains() - 100);
                }
            } else if (parts[0].equals("remove")) {
                second.remove(quantity);
            }
        }
    }

}
