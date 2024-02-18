
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class UserInterface {
    Scanner scanner;
    Statistics statistics;

    public UserInterface(Scanner scanner, Statistics statistics) {
        this.scanner = scanner;
        this.statistics = statistics;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            }
            
            if(input >= 0 && input <= 100) {
                this.statistics.add(input);
            }
        }
        
        System.out.println("Point average (all): " + this.statistics.average());
        
        double passingAverage = this.statistics.passingAverage();
        if(passingAverage > 0) {
            System.out.println("Point average (passing): " + passingAverage); 
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + this.statistics.passingPercentage());
        
        this.statistics.printGradeDistribution();
    }
}
