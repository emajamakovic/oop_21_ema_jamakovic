/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week.pkg7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class Week7 {

 
    public static void main(String[] args) {
       HashMap<String, String> names = new HashMap<String, String>();
        
        names.put("matti", "mage"); // TAKS 1
        names.put("mikael", "mixu");
        names.put("arto", "arppa");
        
        System.out.println(names.get("mikael"));
       
       //TASK 2
        /*PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsDebt("Arto"));
        System.out.println(mattisNote.howMuchIsDebt("Joel"));
*/
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
       
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        
        System.out.println(dictionary.amountOfWords());
        
        ArrayList<String> translations = dictionary.translationList();
        
        for(String translation: translations){
            System.out.println(translation);
        }
       
       String input = "translate\n" + "monkey\n"  +
                   "translate\n" + "cheese\n" +
                   "add\n"  + "cheese\n" + "juusto\n" +
                   "translate\n" + "cheese\n" +
                   "quit\n";
       
       Scanner reader = new Scanner(input);
       Dictionary dictionary1 = new Dictionary();
       
       TextUserInterface ui = new TextUserInterface(reader, dictionary1);
       ui.start();
       
    }
    
}
   

   