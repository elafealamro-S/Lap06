/*
 (Factorial) Calculate and display the factorial of numbers from 2 to 20 as shown below.
 */
package Lap06;

import java.util.Scanner;
public class Lap06_3 {

       public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        for(int x=2;x<=20;x++){
            long fact=1;
            for(int y=1;y<=x;y++){
                fact*=y;}
            
             System.out.println(x+"!="+fact);}
    }
    
}

    
    

