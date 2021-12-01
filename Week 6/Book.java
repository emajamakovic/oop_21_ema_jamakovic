/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

/**
 *
 * @author Korisnik
 */
public class Book {
    private String title;
    private String publisher; 
    private int year;
    
    public Book(String title, String publisher, int year){
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    
    public String title(){
        return this.title;
    }
    
     public String publisher(){
        return this.publisher;
    }
     
    public int year(){
        return this.year;
    }
      
    public String toString(){
        return this.title + " " + this.publisher + " " + this.year;
    }
}

