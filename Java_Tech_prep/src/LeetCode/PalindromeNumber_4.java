package LeetCode;

public class PalindromeNumber_4 {

    public static boolean isPalindrome(int x) {

        if(x < 0) return false;

        String str = Integer.toString(Math.abs(x));

        if(str.length() == 1) return true;

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) == str.charAt(right)) {
                ++left; --right;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
}
