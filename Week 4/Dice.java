/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author Korisnik
 */
public class Dice {
    private int numberOfSides;
    private Random random;
    
    public Dice(int numberOfSides) {
       this.numberOfSides = numberOfSides;
       random = new Random();
    }

    public Dice() {
        System.out.println("Hello"); 
    }
    
    public int roll(){
        return random.nextInt(this.numberOfSides)+1;
    }
    
    public String toString(){
        return "Number of sides = " + this.numberOfSides;
    } 
}

