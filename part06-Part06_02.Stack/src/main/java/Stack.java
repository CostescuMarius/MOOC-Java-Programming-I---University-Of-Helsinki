
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
public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        int lastIndex = this.stack.size() - 1;
        String lastElement = this.stack.get(lastIndex);
        this.stack.remove(lastElement);
        
        return lastElement;
    }
}
