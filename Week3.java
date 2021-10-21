/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week.pkg3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class Week3 {

    public static void main(String[] args) {
        
        
        //TASK 1
        /*
        double answer= average(4,3,6,1);
        System.out.println("Average is: " +answer);
    }
    public static double average(int num1, int num2, int num3, int num4) {
        double sum;
        sum= num1+num2+num3+num4;
        double rezultat= sum/4;
        return rezultat;
    }
    */
        
        
        //TASK 2
        /*
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=reader.nextLine();
        int duzina=name.length();
        System.out.println("Length is: "+duzina);
        */
        
        
        
        // TASK 3
        /*
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=reader.nextLine();
        int duzina= name.length();
        for (int i=0; i<duzina; i++) {
            System.out.println((i+1) + " character: " + name.charAt(i));
        }
        */
        
        
        // TASK 4
        /*
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=reader.nextLine();
        int duzina= name.length()-1;
        for (int i=duzina; i>=0; i--) {
            System.out.print(name.charAt(i));     
        }
        */
        
        
        
        // TASK 5
        /*
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1=reader.nextLine();
        System.out.print("Enter the second word: ");
        String word2=reader.nextLine();
        int result= word1.indexOf(word2);
        if (result==-1) {
            System.out.println("First word does not contain second one");
        } else {
            System.out.println("First word contain the second one");
        }
        */
        
        
        
        // TASK 6 
        /*
        ArrayList<String> words= new ArrayList<String>();
        while (true) {
            Scanner reader= new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word=reader.nextLine();
            
            if(words.contains(word)) {
                System.out.println("Duplicated word");
                Collections.sort(words);
                System.out.println(words);
                break;
            } else {
                 words.add(word);
            }
        }
        */
        
        
        // TASK 7
        /*
        ArrayList<String> list=new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the strings: "+lengths);
        
}
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList= new ArrayList<Integer>();
        
        for (int i=0; i<4; i++) {
            lengthList.add(list.get(i).length());
        }
        return lengthList;
    }
*/
        
        // TASK 8
        
        String word, rvrs = "";
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter  string you want to check:");
	word = reader.nextLine();
	int length = word.length();
	for(int i = length - 1; i >= 0; i--) {
	    rvrs = rvrs + word.charAt(i);
	}
	if(word.equals(rvrs)) {
        System.out.println("The string is palindrome.");
        } else {
        System. out.println("The string is not a palindrome.");
	}
 }
}