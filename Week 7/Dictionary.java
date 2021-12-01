/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg7;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Korisnik
 */
public class Dictionary {
    private HashMap<String, String> dictionary; 
    
    public Dictionary(){
        dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        
        return "Word " + word + " is not in dictionary";
    }
    
    public void add(String word, String translation){
        dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return dictionary.size();
    }
    
    public ArrayList<String> translationList(){
      ArrayList<String> translateList = new ArrayList<String>();
      
      for(String k : dictionary.keySet()){
          translateList.add(k + " = " + dictionary.get(k));
      }
      
      return translateList;
    }
    
    
}

