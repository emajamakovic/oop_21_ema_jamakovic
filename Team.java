/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

import java.util.ArrayList;

/**
 *
 * @author Korisnik
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
        private int maxSize;
        
    public Team(String name) {
        this.name=name;
        this.players=new ArrayList<Player>();
        this.maxSize=16;
    }
   
    public String getName() {
        return this.name;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public void addPlayer(Player player){
        if(this.players.size()<this.maxSize){
            this.players.add(player);
        }
        
    }
    
    public void printPlayers(){
        for(Player player : this.players){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
       return this.players.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        
        for(Player player : this.players){
            totalGoals = totalGoals + player.getNumGoals();
        }
        
        return totalGoals; 
    }
}
