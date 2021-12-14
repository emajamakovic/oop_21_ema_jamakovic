/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Korisnik
 */
public class ShoppingBasket {
     Map<String, Purchase> basket; 
    
    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){ 
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        }else {
             Purchase purchase = new Purchase(product, 1, price);
             basket.put(product, purchase);
        }
    }
    
    public int price(){
        int total_price = 0;
        
        for(Purchase p : basket.values()){
            total_price = total_price + p.price();
        }
        
        return total_price;        
    }
    
    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }
}
