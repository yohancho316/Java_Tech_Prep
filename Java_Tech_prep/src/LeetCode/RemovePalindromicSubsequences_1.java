package LeetCode;

public class RemovePalindromicSubsequences_1 {

    public static int removePalindromeSub(String s) {
        if(s.length() == 1) return 1;
        int left = 0;
        int right = s.length() - 1;

        while(left <= right) {
            if(s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else {
                return 2;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
