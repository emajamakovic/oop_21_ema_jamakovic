/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Korisnik
 */
public class LyyraCard {
    private double balance;
    private String name; 
    
    public LyyraCard (double b){
        this.balance = b;
    }
    
    public LyyraCard (double b, String n){
        this.balance = b;
        this.name = n;
    }
    
    public String toString(){
        return  this.name + ": The card has " + this.balance + " euros";
    }
    
    public void payEconomical(){
        if(this.balance >= 2.5){
            this.balance = this.balance - 2.5;
        }
    }
    public void payGourmet(){
        if(this.balance >= 4){
             this.balance = this.balance - 4;
        }
    }
    
    public void loadMoney(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
            if(this.balance > 150){
                this.balance = 150;
            }
        }
    }
    
}

