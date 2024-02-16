
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        
        for(Suitcase currentSuitcase : suitcases) {
            currentWeight += currentSuitcase.totalWeight();
        }
        
        if(currentWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for(Suitcase currentSuitcase : suitcases) {
            currentSuitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        int currentWeight = 0;
        
        for(Suitcase currentSuitcase : suitcases) {
            currentWeight += currentSuitcase.totalWeight();
        }
        
        if(this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if(this.suitcases.size() == 1) {
            return "1 suitcase (" + currentWeight + " kg)";
        }
                
        return this.suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }
}
