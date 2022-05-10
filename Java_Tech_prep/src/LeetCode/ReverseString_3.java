package LeetCode;

public class ReverseString_3 {

    public static void reverseString(char[] s) {
        if(s.length == 1) return;

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
        char[] s = {'a', 'b', 'c'};
    }
}
