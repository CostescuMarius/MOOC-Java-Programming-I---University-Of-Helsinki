
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
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if(this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.persons.get(0);
        
        for(Person person : persons) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if(this.isEmpty()) {
            return null;
        }
        
        Person takenPerson = this.shortest();
        this.persons.remove(takenPerson);
        
        return takenPerson;
    }
}
