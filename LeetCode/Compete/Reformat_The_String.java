package LeetCode.Compete;

// 5388. Reformat The String

//     User Accepted: 5150
//     User Tried: 5476
//     Total Accepted: 5209
//     Total Submissions: 8833
//     Difficulty: Easy

// Given alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

// You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

// Return the reformatted string or return an empty string if it is impossible to reformat the string

// Example 1:

// Input: s = "a0b1c2"
// Output: "0a1b2c"
// Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.

// Example 2:

// Input: s = "leetcode"
// Output: ""
// Explanation: "leetcode" has only characters so we cannot separate them by digits.

// Example 3:

// Input: s = "1229857369"
// Output: ""
// Explanation: "1229857369" has only digits so we cannot separate them by characters.

// Example 4:

// Input: s = "covid2019"
// Output: "c2o0v1i9d"

// Example 5:

// Input: s = "ab123"
// Output: "1a2b3"

public class Reformat_The_String {

    public String reformat(String s) {
        String numbers = "";
        String letters = "";
        String ans = "";

        for (int x = 0; x < s.length(); x++) {
            if (Character.isLetter(s.charAt(x)))
                letters += s.charAt(x);
            else
                numbers += s.charAt(x);

        }

        if ((Math.abs(numbers.length() - letters.length()) > 1))
            return "";
        else {

            if (numbers.length() > letters.length()) {
                ans += numbers.charAt(0);
                for (int x = 0; x < (numbers.length() + letters.length()) / 2; x++) {
                    ans += letters.charAt(x);
                    ans += numbers.charAt(x + 1);
                }
            } else if (numbers.length() < letters.length()) {
                ans += letters.charAt(0);
                for (int x = 0; x < (numbers.length() + letters.length()) / 2; x++) {
                    ans += numbers.charAt(x);
                    ans += letters.charAt(x + 1);
                }
            } else {
                for (int x = 0; x < (numbers.length() + letters.length()) / 2; x++) {
                    ans += numbers.charAt(x);
                    ans += letters.charAt(x + 1);
                }
            }

        }

        return ans;
    }

}