package LeetCode.julymonth;

import java.util.ArrayList;
import java.util.List;

public class plusOne {
    public int[] plusone(int[] digits) {
        ArrayList<Integer> newdigits = new ArrayList<Integer>();
        int carryOn = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            newdigits.add(0, (carryOn + digits[i]) % 10);
            carryOn = (carryOn + digits[i] + 1) / 10;
        }
        if (carryOn == 1)
            newdigits.add(0, 1);

        int[] convert = new int[newdigits.size()];
        for (int i = 0; i < convert.length; i++) {
            convert[i] = newdigits.get(i);
        }

        return convert;

    }
}