package LeetCode;

import java.util.Arrays;

public class ReverseString_4 {

    public static void reverseString(char[] s) {

        // Check if the length of s == 1
        if(s.length == 1) return;

        // Declare two integer variables to act as pointers
        int left = 0;
        int right = s.length - 1;

        while(left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            ++left;
            --right;
        }

    }

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd'};
        System.out.println("Original: " + Arrays.toString(s));
    }
}
