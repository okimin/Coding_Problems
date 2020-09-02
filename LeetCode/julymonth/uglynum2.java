package LeetCode.julymonth;

import java.util.HashSet;

class Solution {
    public static int nthUglyNumber(int n) {
        int[] allUgly = new int[n];
        allUgly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;

        for (int i = 1; i < n; i++) {
            allUgly[i] = Math.min(Math.min(allUgly[index2] * 2, allUgly[index3] * 3), allUgly[index5] * 5);

            System.out.printf("%d Number is %d \n", i + 1, allUgly[i]);
            if (allUgly[i] == allUgly[index2] * 2)
                index2++;
            if (allUgly[i] == allUgly[index3] * 3)
                index3++;

            if (allUgly[i] == allUgly[index5] * 5)
                index5++;

        }
        return allUgly[n - 1];

    }

    public static void main(String[] args) {
        nthUglyNumber(10);
    }

}