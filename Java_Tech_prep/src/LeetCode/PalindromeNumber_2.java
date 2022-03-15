package LeetCode;

public class PalindromeNumber_2 {

    public static boolean isPalindrome(int x) {

        // Local Declarations
        int reverse = 0;

        if(x < 0) return false;
        if(x < 10) return true;
        if(x % 10 == 0) return false;

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


        // Algorithm to Mathematically Reverse an Integer Value
//        int x = 1331;
//        int original_val = 1331;
//        int reverse = 0;
//        System.out.println("How to Reverse an Integer Value Completely");
//        while(x > 0) {
//            reverse = (reverse * 10) + (x % 10);
//            x /= 10;
//
//            System.out.println("Reverse: " + reverse + "\t| X = " + x + "\n");
//        }
//
//        if(reverse == original_val) {
//            System.out.println("X is a Palindrome!");
//        } else {
//            System.out.println("X is NOT a Palindrome!");
//        }
//
//        int y = 13331;
//        reverse = 0;
//        System.out.println("\n\n\n\nHow to Reverse an Integer Value Half-Way\n");
//        while(y > reverse) {
//            reverse = (reverse * 10) + (y % 10);
//            y /= 10;
//
//            System.out.println("Reverse: " + reverse + "\t| Y = " + y + "\n");
//        }
//
//        if(y == reverse || y == (reverse / 10)) {
//            System.out.println("Y is a Palindrome!");
//        } else {
//            System.out.println("Y is NOT a Palindrome!");
//        }

        System.out.println(isPalindrome(-10));
    }
}
