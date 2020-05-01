package LeetCode.Day30;

public class moveZeroes {

    // Given an array nums, write a function to move all 0's to the end of it while
    // maintaining the relative order of the non-zero elements.

    // Example:

    // Input: [0,1,0,3,12]
    // Output: [1,3,12,0,0]
    public void swap(int[] nums, int indexX, int indexY) {
        int temp = nums[indexX];
        nums[indexX] = nums[indexY];
        nums[indexY] = temp;

    }

    public void moveZero(int[] nums) {

        int zero = 0;
        int nonzero = 0;

        while (Math.max(nonzero, zero) < nums.length) {
            if (nums[nonzero] == 0) {
                nonzero++;
            } else if (nums[zero] != 0) {
                zero++;
            } else if (nonzero > zero) {
                swap(nums, nonzero, zero);
                nonzero++;
                zero++;
            } else {
                nonzero = zero + 1;
            }

        }

    }
}