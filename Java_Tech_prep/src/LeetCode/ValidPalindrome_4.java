package LeetCode;

import java.awt.peer.ListPeer;

public class ValidPalindrome_4 {

    public static boolean isPalindrome(String s) {

        if(s.isEmpty() || (s.length() == 1 && Character.isLetterOrDigit(s.charAt(0)))) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(!(Character.isLetterOrDigit(s.charAt(left)))) {
                ++left;
                continue;
            } else if(!(Character.isLetterOrDigit(s.charAt(right)))) {
                --right;
                continue;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            ++left;
            --right;
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "Ab A-";
        System.out.println(isPalindrome(s));
    }
}
