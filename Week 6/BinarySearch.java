/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg6;

/**
 *
 * @author Korisnik
 */
public class BinarySearch {
     public static int search(int[] array, int first, int last, int value){
        if (last>=first){  
            int mid = first+(last - first)/2;  
            if (array[mid] == value){  
                return mid;  
            }  
            if (array[mid] > value){  
              return search(array, first, mid-1, value);//search left 
            }else{  
              return search(array, mid+1, last, value);//search right 
            }  
        }  
        return -1;  
    }   
}

