package Project_Euler;

import java.util.*;
import java.io.*;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, 
// we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.
public class multiples {

    public static int mult(int num) {

        int total = 0;

        for (int x = 1; x < num; x++) {
            if (Math.min(x % 3, x % 5) == 0) {
                total += x;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        int input = 1000;
        System.out.println(mult(input));
    }

}