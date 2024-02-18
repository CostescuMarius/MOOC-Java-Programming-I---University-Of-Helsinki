
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class DataBase {
    private ArrayList<Bird> birds;
    private HashMap<String, Integer> observations;

    public DataBase() {
        this.birds = new ArrayList<>();
        this.observations = new HashMap<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void addObservation(String name) {
        if(this.observations.get(name) != null) {
            this.observations.put(name, this.observations.get(name) + 1);
        } else {
            this.observations.put(name, 1);
        }
    }
    
    public void printAll() {
        for(Bird bird : birds) {
            if(this.observations.size() > 0) {
                int observationNo = this.observations.get(bird.getName());
            
                if(observationNo == 1) {
                    System.out.println(bird + ": " + observationNo + " observation");
                } else {
                    System.out.println(bird + ": " + observationNo + " observations");
                }
            } else {
                System.out.println(bird + ": 0 observations");
            }
        }  
    }
    
    public void printOne(String name) {
        for(Bird bird : birds) {
            if(bird.getName().equals(name)) {
                if(this.observations.size() > 0) {
                    int observationNo = this.observations.get(bird.getName());
            
                    if(observationNo == 1) {
                        System.out.println(bird + ": " + observationNo + " observation");
                    } else {
                        System.out.println(bird + ": " + observationNo + " observations");
                    }
                } else {
                    System.out.println(bird + ": 0 observations");
                }
            }
        }  
    }
}
