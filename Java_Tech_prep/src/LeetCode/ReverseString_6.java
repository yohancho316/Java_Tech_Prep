package LeetCode;

public class ReverseString_6 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char left_char = s[left];
            s[left] = s[right];
            s[right] = left_char;
            ++left;
            --right;
        }
        return;
    }

    public static void main(String[] args) {

    }
}
