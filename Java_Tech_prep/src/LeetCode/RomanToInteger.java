/*
URL: https://leetcode.com/problems/roman-to-integer/
Difficulty: Easy
Time Complexity: O(N)
Space Complexity: O(1)
 */

package LeetCode;

public class RomanToInteger {

    public static int romanToInt(String s) {

        // Local Declarations
        int sum = 0;

        // Check if Empty String is Passed
        if(s.length() == 0) {
            return sum;
        }

        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            switch(letter) {
                case 'I':
                    if((i < s.length() - 1) && (s.charAt(i + 1) == 'V')) {
                        sum += 4;
                        i += 1;
                    } else if((i < s.length() - 1) && (s.charAt(i + 1) == 'X')) {
                        sum += 9;
                        i += 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if((i < s.length() - 1) && (s.charAt(i + 1) == 'L')) {
                        sum += 40;
                        i += 1;
                    } else if((i < s.length() - 1) && (s.charAt(i + 1) == 'C')) {
                        sum += 90;
                        i += 1;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if((i < s.length() - 1) && (s.charAt(i + 1) == 'D')) {
                        sum += 400;
                        i += 1;
                    } else if((i < s.length() - 1) && (s.charAt(i + 1) == 'M')) {
                        sum += 900;
                        i += 1;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String numeral = "";
        System.out.println(romanToInt(numeral));
    }
}
