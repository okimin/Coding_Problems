package Project_Euler;

public class largestPal {

    // return the exponent of the first value
    public static int exponent(int val) {
        int value = val;
        int expo = 0;

        while (value > 10) {
            value /= 10;
            expo++;
        }
        return expo;
    }

    public static boolean europal(int num) {
        if (num < 10)
            return true;
        int start = exponent(num);
        // System.out.println(num + " " + start);

        int end = 0;
        while (start > end) {

            int s_digit = (num / ((int) Math.pow(10, start--))) % 10;
            int e_digit = (num / ((int) Math.pow(10, end++))) % 10;
            if (s_digit != e_digit)
                return false;

        }

        return true;
    }

    public static void main(String[] args) {
        // int num_one = 999;
        // int num_two = 999;
        int largest = 0;

        for (int one = 999; one > 100; one--) {
            for (int two = 999; two > 100; two--) {
                if (europal(one * two)) {
                    System.out.printf("The  palindrome product of %d and %d make %d \n", one, two, one * two);
                    largest = Math.max(largest, one * two);
                }
            }
        }
        // while (num_one > 100) {
        // if (europal(num_one-- * num_two)) {
        // System.out.printf("The palindrome product of %d and %d make %d \n",
        // ++num_one, num_two,
        // num_one-- * num_two);
        // largest = Math.max(largest, (num_one + 1) * num_two);
        // }

        // if (europal(num_one * num_two--)) {
        // System.out.printf("The palindrome product of %d and %d make %d \n", num_one,
        // ++num_two,
        // num_one * num_two--);
        // largest = Math.max(largest, (num_one) * (num_two + 1));

        // }
        // // brian.w@durouas.com
        // // Brian Wilson

        // // bianca.e.west@gmail.com
        // // Bianca West
        // }
        System.out.println("Largest Palindrome is " + largest);
    }

}