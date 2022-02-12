package LeetCode;

public class ValidPalindrome_3 {

    public static boolean isPalindrome(String s) {

        // Local Declarations
        int front = 0;
        int end = s.length() - 1;

        // Check if String s is Empty
        if(s.isEmpty()) return true;

        // Iterate through S in Opposite Directions
        while(front < end) {
            if(!(Character.isLetterOrDigit(s.charAt(front)))) {
                ++front;
            } else if(!(Character.isLetterOrDigit(s.charAt(end)))) {
                --end;
            } else if(Character.toLowerCase(s.charAt(front)) == Character.toLowerCase(s.charAt(end))) {
                ++front;
                --end;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
