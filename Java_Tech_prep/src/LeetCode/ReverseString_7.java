package LeetCode;

public class ReverseString_7 {

    public static char[] recursiveReverse(char[] s, int left, int right) {
        // base condition
        if(left >= right) return s;

        char character = s[left];
        s[left] = s[right];
        s[right] = character;
        ++right;
        --left;
        return recursiveReverse(s,left,right);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        s = recursiveReverse(s, left, right);
        return;
    }

    public static void main(String[] args) {

    }
}
