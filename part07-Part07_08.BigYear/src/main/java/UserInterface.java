
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
    DataBase birdDatabase;
    Scanner scanner;

    public UserInterface(Scanner scanner, DataBase birdDatabase) {
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }
    
    public void start() {
        while(true) {
            System.out.println("? ");
            
            String input = scanner.nextLine();
            
            if(input.equals("Quit")) {
                break;
            }
            
            if(input.equals("Add")) {
                add();
            } else if(input.equals("Observation")) {
                observation();
            } else if(input.equals("All")) {
                all();
            } else if(input.equals("One")) {
                one();
            }
        }
    }
    
    public void add() {
        System.out.println("Name");
        String name = scanner.nextLine();
                
        System.out.println("Name in Latin");
        String nameInLatin = scanner.nextLine();
        this.birdDatabase.addBird(new Bird(name, nameInLatin));
    }
    
    public void observation() {
        System.out.println("Bird? ");
        String name = scanner.nextLine();

        this.birdDatabase.addObservation(name);
    }
    
    public void all() {
        this.birdDatabase.printAll();
    }
    
    public void one() {
        System.out.println("Bird? ");
        String name = scanner.nextLine();

        this.birdDatabase.printOne(name);
    }
}
