
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesOfTeam = 0;
        int wonGames = 0;
        int lostGames = 0;
        
        try (Scanner scanner_file = new Scanner(Paths.get(file))) {

            while (scanner_file.hasNextLine()) {
                String row = scanner_file.nextLine();
                
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                if(homeTeam.equals(team)) {
                    gamesOfTeam++;
                    
                    if(homeTeamPoints > visitingTeamPoints) {
                        wonGames++;
                    } else {
                        lostGames++;
                    }
                } else if(visitingTeam.equals(team)) {
                    gamesOfTeam++;
                    
                    if(homeTeamPoints > visitingTeamPoints) {
                        lostGames++;
                    } else {
                        wonGames++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Games: " + gamesOfTeam);
        System.out.println("Wins: " + wonGames);
        System.out.println("Losses: " + lostGames);
    }

}
