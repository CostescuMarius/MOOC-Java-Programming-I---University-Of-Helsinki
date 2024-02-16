import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }
            
            int pagesNo = Integer.valueOf(scanner.nextLine());
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pagesNo, publicationYear));
        }
        
        System.out.print("What information will be printed?");
        String information = scanner.nextLine();
        
        if(information.equals("everything")) {
            for(Book book : books) {
                System.out.println(book);
            }
        } else  if(information.equals("name")) {
            for(Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
