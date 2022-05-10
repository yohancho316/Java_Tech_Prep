package LeetCode;

import java.util.Arrays;

public class ReverseString_5 {


    public static void reverseRecursively(char[] s, int left, int right, int count) {

        // Base Condition
        if(count == s.length / 2) return;

        // Swap
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        ++left;
        ++count;
        --right;

        reverseRecursively(s,left,right,count);
    }


    public static void reverseString(char[] s) {

        // Check if the Length of s == 1
        if(s.length == 1) return;

        // Make recursive method call
        reverseRecursively(s, 0, s.length - 1, 0);
    }


    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd'};
        System.out.println("Before: " + Arrays.toString(s));
        reverseString(s);
        System.out.println("After: " + Arrays.toString(s));

    }
}
