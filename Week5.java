/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author Korisnik
 */
public class Week5 {

   
    public static void main(String[] args) {
        // TASK 1
        /*
       Team barc= new Team("FC Barcelona");
       System.out.println("Team: "+ barc.getName() );
       */
         
        // TASK 2
       
       Team barc= new Team("FC Barcelona");
       System.out.println("Team: "+ barc.getName() );
       
       Player brian=new Player("Brian");
       System.out.println("Player: " + brian );
       
       Player pekka=new Player("Pekka", 39);
       System.out.println("Player: " + pekka);
       
       
       barc.addPlayer(pekka);
       barc.addPlayer(brian);
       barc.addPlayer(new Player("Mikael", 1));
        
       barc.printPlayers();
       System.out.println("Number of players: " + barc.size());
       System.out.println("Total goals: " + barc.goals()); 
}
    
}
