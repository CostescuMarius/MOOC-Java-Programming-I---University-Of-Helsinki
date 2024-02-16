/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class UserInformation {
    private String identifier;
    private String name;

    public UserInformation(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof UserInformation)) {
            return false;
        }

        // convert the object to a Bird object
        UserInformation comparedUserInformation = (UserInformation) compared;

        // if the values of the object variables are equal, the objects are, too
        if(this.identifier.equals(comparedUserInformation.identifier)) {
            return true;
        }
        
        return false;
    }
}
