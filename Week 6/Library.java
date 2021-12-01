/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

import java.util.ArrayList;

/**
 *
 * @author Korisnik
 */
public class Library {
    private static ArrayList<Book> library = new ArrayList<Book>();
    
    public void addBook(Book newBook){
        library.add(newBook);
    }
    
    public void printBooks(){
        for(Book book : library){
            System.out.println(book);
        }
    }
    
    public static ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book b : library){
             if(b.title().equals(title)){
                found.add(b);
            }
        }
        return found; 
    }
}

