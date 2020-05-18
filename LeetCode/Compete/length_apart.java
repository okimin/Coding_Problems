package LeetCode.Compete;

public class length_apart {

    public boolean kLengthApart(int[] nums, int k) {
        int index = -1;
        for (int x = 0; x < nums.length; x++) {

            if (nums[x] == 1) {
                if (index == -1)
                    index = x;
                else if ((x - index) < k)
                    return false;
                else
                    index = x;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}