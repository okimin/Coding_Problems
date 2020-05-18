package Project_Euler;

import jdk.jfr.Unsigned;

public class prime {

    /// MY IMPLENTATION
    public static long factor(long num) {
        // Method to find prime number is also a method to find factors in general
        // But this time adjusted to include checking for prime number factor
        // Run Time ( O(n))
        if (is_Prime(num))
            return num;

        long largestP = 1;
        long testFactor;

        for (testFactor = num / 2; testFactor > 1; testFactor--) {
            if (num % testFactor == 0)
                if (is_Prime(testFactor))
                    return testFactor;
        }

        return largestP;

    }

    public static boolean is_Prime(long num) {

        // Prime number if only divisible by 1 and itself
        // first number can either start by divided by two or by sqrt(num) rounded to
        // next highest number

        long testFactor = (long) (Math.ceil(Math.sqrt(num)));

        for (testFactor = testFactor + 0; testFactor > 1; testFactor--) {
            if (num % testFactor == 0)
                return false;
        }

        return true;

    }

    /// GFG IMPLEMENTATIONS
    public static long maxPrimeFactors(long n) {
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        long maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (n % 2 == 0) {
            maxPrime = 2;

            // equivalent to n /= 2
            n >>= 1;
        }

        // n must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }

    // Comparison
    // - They Use shifting instead of /= 2
    // - O(N) IMPLEMENTATION
    // - They knew that all prime numbers are odd
    // - They used odd number as their for loop implentation

    public static void main(String[] args) {

        // long because problem input pass int range
        long input = 600851475143l;
        System.out.println(maxPrimeFactors(input));
        // Answer Should Be 233168
    }

}