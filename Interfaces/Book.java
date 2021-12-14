/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Korisnik
 */
public class Book implements ToBeStored{
    private String writer;
    private String name; 
    private double weight; 
    
    public Book(String wr, String n, double w){
        this.writer = wr;
        this.name = n; 
        this.weight = w;
    }
    
    
    public double weight() {
        return this.weight;
    }
    
    public String toString(){
        return this.writer + ": " + this.name;
    }
    
}

