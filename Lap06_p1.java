/*
 (Display patterns using loops) Write two separate programs using nested loops that display
the following patterns
Sample runs of the program
--- Pattern #1
          1
        2 1
      3 2 1
    4 3 2 1
  5 4 3 2 1
6 5 4 3 2 1
 */

package Lap06;


public class Lap06_p1 {

    public static void main(String[] args) {
         for (int x = 1; x <= 6; x++) {
            for (int y = x; y < 6; y++) {
                System.out.print("  ");}
            
            for (int z = x; z >= 1; z--) {
                System.out.print(z + " ");}
            
            System.out.println();
 }
    }
}