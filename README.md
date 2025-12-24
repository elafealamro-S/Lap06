# Lab 06 – Nested Loops

## 1. Objective
The purpose of this Lab is to familiarize students with using nested loops in Java.

## 2. Lab Learning Outcomes (LLO)
By completion of the lab, the students should be able to:
1. Apply a nested loop to solve a given problem.

## 3. Theory Review – Nested Loops
A nested loop is a loop inside another loop. In Java, you can use `while` or `for` loops as nested loops.

### Example using nested `while` loops:
```java
int x = 2;
while(x <= 10) {
    int y = 1;
    System.out.println("*** Multiplication Table for " + x + " ***");
    while (y <= 10) {
        System.out.println(x + " X " + y + " = " + (x * y));
        y++;
    }
    x++;
}
