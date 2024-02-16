
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        int currentWeight = this.totalWeight();
        
        if(currentWeight + item.getWeight() <= maximumWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for(Item currentItem : items) {
            System.out.println(currentItem);;
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        
        for(Item currentItem : items) {
            currentWeight += currentItem.getWeight();
        }
        
        return currentWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for(Item item : items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    @Override
    public String toString() {
        int currentWeight = this.totalWeight();
        
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(this.items.size() == 1) {
            return "1 item (" + currentWeight + " kg)";
        }
                
        return this.items.size() + " items (" + currentWeight + " kg)";
    }
}
