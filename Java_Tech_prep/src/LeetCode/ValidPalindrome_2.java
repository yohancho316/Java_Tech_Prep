package LeetCode;

public class ValidPalindrome_2 {

    public static boolean isPalindrome(String s) {

        // Local Declarations
        int start = 0;
        int end = s.length() - 1;

        // Check for Empty String
        if(s.isEmpty()) return true;

        // Iterate through S w/ Two Pointer Technique (Opposite Directional)
        while(start < end) {
            if(!(Character.isLetterOrDigit(s.charAt(start)))) {
                ++start;
            } else if(!(Character.isLetterOrDigit(s.charAt(end)))) {
                --end;
            } else if((Character.toLowerCase(s.charAt(start)) == (Character.toLowerCase(s.charAt(end))))) {
                ++start;
                --end;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
