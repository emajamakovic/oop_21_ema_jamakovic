/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week.pkg6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class Week6 {

    
    public static void main(String[] args) {
        int[] values  = {6, 5,8, 7, 11};
        System.out.println("Smallest: " + smallest(values)); //TASK 1
        
        System.out.println("Index of the smallest:  " + indexOfSmallest(values)); //TASK2
        
        System.out.println("Index: " + indexOfTheSmallestStartingFrom(values, 1)); // TASK 3
        System.out.println("Index: " + indexOfTheSmallestStartingFrom(values, 2));
        System.out.println("Index: " + indexOfTheSmallestStartingFrom(values, 4));
        
        
        System.out.println("Before Swap: " + Arrays.toString(values)); //SWAP
        swap(values, 1, 0);
        System.out.println("After Swap: " + Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println("After Swap: " + Arrays.toString(values));
        
       
       
        int[] array2 = { -3, 2, 3, 4, 7, 8, 12 }; //BINARY SEARCH
       
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array2));
        System.out.println();
        
        System.out.print("Enter searched number: ");
        String value = reader.nextLine();
        System.out.println();
        
        int result = BinarySearch.search(array2,  0, array2.length, Integer.parseInt(value));
       
        if(result == -1){
            System.out.println("Value : " + value + " not in the array");
        }else{
            System.out.println("Value : " + value + " is in the array");
        }
        
        int[] array = {5, 1, 3, 4, 2}; //TASK 6
        printElegantly(array);
      
        NightSky sky = new NightSky(0.1, 40, 10); //NIGHT SKY
        sky.printLine();
        sky.print();
        
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
        System.out.println("");
        
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
     
        
        
        
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007); //BOOK 
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());
        
        System.out.println(cheese);
        
        
        Library library1 = new Library();
        library1.addBook(cheese);
        Book nh1 = new Book("NHL Hockey", "Stanley Cup", 1952);
        library1.addBook(nh1);
        library1.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        library1.printBooks();
        
        library1.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales","Penguin Group", 1995));
        ArrayList <Book> result1 = Library.searchByTitle("CHEESE");
        System.out.println("========");
        for(Book b : result1){
            System.out.println(b);
        }
    }
    
    public static int smallest(int[] array){
        int smallest = array[0]; 
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0]; 
        int index = 0; 
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                index = i; 
                smallest = array[i];
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index; 
        
        for(int i = index+1; i < array.length; i++){
            if(array[i] < smallest){
                indexOfSmallest = i; 
                smallest = array[i];
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp; 
        
    }
    
    public static void printElegantly(int[]array) {
        for (int i=0; i < array.length ; i++ ) {
            if (i==array.length-1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
    }
    
}

