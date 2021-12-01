/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg7;

import java.util.HashMap;

/**
 *
 * @author Korisnik
 */
public class PromissoryNote {
     private HashMap<String, Double> loans;
    
    public PromissoryNote(){
        this.loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String to, double value){
        this.loans.put(to, value);
    }
    
     public double howMuchIsDebt(String whose){
         if(this.loans.containsKey(whose)){
             return this.loans.get(whose);
         }
         
         return 0;
     }
}

