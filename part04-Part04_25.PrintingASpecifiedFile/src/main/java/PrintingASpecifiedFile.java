
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileToOpen = scanner.nextLine();
        
        try (Scanner scanner_file = new Scanner(Paths.get(fileToOpen))) {

            while (scanner_file.hasNextLine()) {
                String row = scanner_file.nextLine();
        
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
