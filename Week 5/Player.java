/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author Korisnik
 */
public class Player {
    private String name;
    private int numGoals;
    
    public Player(String name) {
        this.name=name;
        this.numGoals=0;
    }
    
    public Player(String name, int numGoals) {
        this.name=name;  
        this.numGoals=numGoals;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumGoals() {
        return this.numGoals;
    }
    
    public String toString() {
        return  this.name + " ,numGoals: " + this.numGoals;
    }
     
    }



