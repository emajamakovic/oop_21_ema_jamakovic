/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import java.util.Random;
public class JavaApplication2 {

  
    public static void main(String[] args) {
     // TASK 1
        /* Scanner reader= new Scanner(System.in);
        while (true) {
           System.out.print("Enter a password: ");
           String password= reader.nextLine();
           if (password.equals("IBU")) {
               System.out.println("The secret is: jryy qbar!");
               break;
           }
      
       */
        
        
        // TASK 2
        /*
         Scanner reader= new Scanner(System.in);
         int sum=0;
         int read;
         
         System.out.print("Enter a first number: ");
         int num1= Integer.parseInt(reader.nextLine());
         System.out.print("Enter a second number: ");
         int num2= Integer.parseInt(reader.nextLine());
         System.out.print("Enter a third number: ");
         int num3= Integer.parseInt(reader.nextLine());
         
         sum= num1+ num2 +num3;
         
         System.out.println("Sum: " +sum);
        
      */
     
        // TASK 3
        /*
        Scanner reader= new Scanner(System.in);
        int sum= 0; 
        while( true) {
            int read= Integer.parseInt(reader.nextLine());
            if(read==0) {
                break;
            }
            sum= sum+read;
            
            System.out.println("Sum now: " +sum);
        }
        System.out.println("Sum in the end: "+sum);
        
        */
        
        // TASK 4
        /*
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1= Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter a second number: ");
        int num2= Integer.parseInt(reader.nextLine());
        
        while (num1 < num2) {
            System.out.println(num1);
            num1++;
        }
        */
        
        // TASK 5
        /*
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the power: ");
        int power = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        for(int i = 0; i<=power; i++){
            sum = sum + (int)Math.pow(2, i);
        }
          
        System.out.println("Sum" + sum);
    */
        
        
        // TASK 6
        /*
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter how many times: ");
        int number= Integer.parseInt(reader.nextLine());
        
        
        for (int i=1; i<=number; i++) {
            printText();
        }
    }
        public static void printText() {
           System.out.println("In the beginning there were the swamp, the hoe and Java.");
       }
        */
        
        // TASK 7
        /*
        printStars(5);
        }
        public static void printStars(int number) {
            for (int i=0; i<number; i++) {
                System.out.print("*");
                   
            }
        }
        
        */
	    // TASK 8
    
       Random rand = new Random();
       int upperb = 101;
       int x = rand.nextInt(upperb);
       int i = 1;
       while(true) {
    	   
    	   Scanner reader = new Scanner(System.in);
   		   System.out.println("Guess the number: ");
    	   int y = reader.nextInt();
    	   
    	   if(y<x) {
    		   System.out.println("The number is greater, guesses made: " + i);
    		   i++;
    	   }else if(y>x){
    		   System.out.println("The number is lesser, guesses made: " + i);
    		   i++;
    	   }else if(y==x){
    		   System.out.println("Congrats, that's right!");
    		   break;
    	   }
       }
	}

}
