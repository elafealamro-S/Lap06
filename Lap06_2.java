/*
 (Pyramid pattern) Write a nested for loop that displays the pyramid pattern given below
1
1 2 1
1 2 4 2 1
1 2 4 8 4 2 1
1 2 4 8 16 8 4 2 1
1 2 4 8 16 32 16 8 4 2 1
1 2 4 8 16 32 64 32 16 8 4 2 1
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
(Hint: Use %3f in System.out.printf() to format the output. And use Math.pow(2, generate powers of 2)
x) to
 */
package Lap06;

public class Lap06_2 {

    
     public static void main(String[] args) {
        int rows = 8;
        for (int x = 0; x < rows; x++) {
        
            for (int y = rows; y > x; y--) {
                System.out.print("    "); }

 
            for (int y = 0; y <= x; y++) {
                System.out.printf("%4d", (int) Math.pow(2, y));}

            for (int y = x - 1; y >= 0; y--) {
                System.out.printf("%4d", (int) Math.pow(2, y)); }
        }
    }
}