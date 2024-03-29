
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<UserInformation> userInfos = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            UserInformation info = new UserInformation(identifier, name);

            if(!userInfos.contains(info)) {
                userInfos.add(info);
            }
        }
        
        for(UserInformation info : userInfos) {
            System.out.println(info);
        }
    }
}
