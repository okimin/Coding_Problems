package LeetCode.Compete;

public class abs_diff {

    // 5402. Longest Continuous Subarray With Absolute Diff Less Than or Equal to
    // Limit

    // User Accepted: 2320
    // User Tried: 4245
    // Total Accepted: 2386
    // Total Submissions: 8687
    // Difficulty: Medium

    // Given an array of integers nums and an integer limit, return the size of the
    // longest continuous subarray such that the absolute difference between any two
    // elements is less than or equal to limit.

    // In case there is no subarray satisfying the given condition return 0.

    // Input: nums = [8,2,4,7], limit = 4
    // Output: 2
    // Explanation: All subarrays are:
    // [8] with maximum absolute diff |8-8| = 0 <= 4.
    // [8,2] with maximum absolute diff |8-2| = 6 > 4.
    // [8,2,4] with maximum absolute diff |8-2| = 6 > 4.
    // [8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
    // [2] with maximum absolute diff |2-2| = 0 <= 4.
    // [2,4] with maximum absolute diff |2-4| = 2 <= 4.
    // [2,4,7] with maximum absolute diff |2-7| = 5 > 4.
    // [4] with maximum absolute diff |4-4| = 0 <= 4.
    // [4,7] with maximum absolute diff |4-7| = 3 <= 4.
    // [7] with maximum absolute diff |7-7| = 0 <= 4.
    // Therefore, the size of the longest subarray is 2.

    public int longestSubarray(int[] nums, int limit) {
        int answer = 0;
        return answer;
    }

}