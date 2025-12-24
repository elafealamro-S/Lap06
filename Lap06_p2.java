/*
(Display patterns using loops) Write two separate programs using nested loops that display
the following patterns
Sample runs of the program--- Pattern #2
1 2 3 4 5 6
  2 3 4 5 6
    3 4 5 6
      4 5 6
        5 6
          6
 */
package Lap06;

/**
 *
 * @author mac
 */
public class Lap06_p2 {
    
   public static void main(String[] args) {
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y < x; y++) {
                System.out.print("  ");}
            
            for (int z = x; z <= 6; z++) {
                System.out.print(z + " ");}
            System.out.println();}
    }
}