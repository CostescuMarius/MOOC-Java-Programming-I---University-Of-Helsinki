
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String userMessage = scanner.nextLine();
        System.out.println(userMessage + "\n" + userMessage + "\n" + userMessage);
    }
}