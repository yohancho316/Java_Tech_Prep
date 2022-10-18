package LeetCode;

public class ValidPalindrome_8 {

    public static boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return false;
        if(s.length() == 1) return true;

        int left = 0;
        int right = s.length() - 1;
        int compares = 0;

        while(left < right) {

            while((left < right) && (!Character.isLetterOrDigit(s.charAt(left)))) {
                ++left;
            }

            while((left < right) && (!Character.isLetterOrDigit(s.charAt(right)))) {
                --right;
            }

            if(Character.compare(Character.toLowerCase(s.charAt(left)), Character.toLowerCase(s.charAt(right))) == 0) {
                ++left;
                --right;
                ++compares;
            } else {
                return false;
            }
        }
        if(compares == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";


        System.out.println("Palindrome: " + isPalindrome(s));
    }
}
