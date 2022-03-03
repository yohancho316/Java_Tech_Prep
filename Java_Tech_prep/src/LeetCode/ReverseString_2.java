package LeetCode;
import java.util.Arrays;

public class ReverseString_2 {

    public static void reverseString(char[] s) {
        // Local Declarations
        int start = 0, end = s.length - 1;

        if(s.length == 1) return;

        while(start < end) {
            Character temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            ++start;
            --end;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Original: " + Arrays.toString(s));
        ReverseString_2.reverseString(s);
        System.out.println("Original: " + Arrays.toString(s));

    }

}
