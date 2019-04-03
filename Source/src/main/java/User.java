/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author 9518588
 */
public class User {
    /**
     * Member Variables
     */
    String firstName;
    String lastName;
    String ID;
    
    User(String firstName, String lastName, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }
    
    User(){
        firstName = "";
        lastName = "";
        ID = "";
    }
    
    /**
     * @params inString The new name that is over-riding the old one
     */
    void setFirstName(String inString){
        firstName = inString;
    }
    
    /**
     * @params inString The new name that is over-riding the old one
     */
    void setLastName(String inString){
        lastName = inString;
    }
    
    /**
     * @params inString The new name that is over-riding the old one
     */
    void setID(String inString){
        ID = inString;
    }
    
    String getFirstName(){
        return firstName;
    }
    
    String getLastName(){
        return lastName;
    }
    
    String getID(){
        return ID;
    }
    
}
