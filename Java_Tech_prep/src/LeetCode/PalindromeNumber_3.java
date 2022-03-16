package LeetCode;

public class PalindromeNumber_3 {

    public static boolean isPalindrome(int x) {

        if(x < 0) return false;
        else if(x < 10) return true;
        else if(x % 10 == 0) return false;

        int reverse = 0;

        while(x > reverse) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        if((x == reverse) || (x == (reverse / 10))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(1003));
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(-35));
        System.out.println(isPalindrome(3333333));

    }
}
