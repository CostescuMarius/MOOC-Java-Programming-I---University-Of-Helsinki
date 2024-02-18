/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class Bird {
    private String name;
    private String latinName;

    public Bird() {
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + ")";
    }
    
    @Override
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if (!(compared instanceof Bird)) {
            return false;
        }
        
        Bird comparedBird = (Bird) compared;
        
        if(this.name.equals(comparedBird) && this.latinName.equals(comparedBird)) {
            return true;
        }
        
        return false;
    }
}
