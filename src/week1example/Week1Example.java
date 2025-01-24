/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1example;
import java.util.*;
/**
 *
 * @author navro
 */
public class Week1Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Friends");
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 
        char[] charArray = input.toCharArray();
        
        int n = charArray.length;
        for(int i = n-1;i>=0;i--){
            System.out.print(charArray[i]);
        }
        System.out.println();
        
    }
    
}
