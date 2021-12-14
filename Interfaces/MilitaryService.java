/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Korisnik
 */
public class MilitaryService implements NationalService{
    private int daysLeft; 
    
    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }
    
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if(this.daysLeft > 0){
            this.daysLeft--;
        }
    }
    
    
}

