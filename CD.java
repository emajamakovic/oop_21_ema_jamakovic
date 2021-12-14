/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Korisnik
 */
public class CD implements ToBeStored{
    private String artist;
    private String title; 
    private int publishingYear;
    private double weight; 
    
    public CD(String a, String t, int pY){
        this.artist = a;
        this.title = t; 
        this.publishingYear = pY;
        this.weight = 0.1;
    }
    
 
    public double weight() {
      return this.weight;
    }
    
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}

