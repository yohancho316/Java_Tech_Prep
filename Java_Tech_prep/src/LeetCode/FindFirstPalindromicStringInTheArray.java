package LeetCode;

public class FindFirstPalindromicStringInTheArray {

    public static String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++) {

            String current = words[i];
            int left = 0;
            int right = words[i].length() - 1;
            int mid = words[i].length() / 2;

            while(left < right) {
                if(current.charAt(left) != current.charAt(right)) {
                    break;
                }
                ++left;
                --right;
            }

            if(left == mid) {
                return current;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"hello", "abc", "bad", "bro"};
        System.out.println(firstPalindrome(words));
    }
}
