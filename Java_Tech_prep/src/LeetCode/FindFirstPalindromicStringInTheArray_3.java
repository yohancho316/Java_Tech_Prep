package LeetCode;

public class FindFirstPalindromicStringInTheArray_3 {

    public static String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++) {

            String current = words[i];
            int left = 0;
            int right = current.length() - 1;

            while(left < right) {
                if(current.charAt(left) == current.charAt(right)) {
                    ++left;
                    --right;
                } else {
                    break;
                }
            }

            if((left == right) || (left > right)) {
                return current;
            }

        }

        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc", "def", "ghi", "abk", "pp"};
        System.out.println(firstPalindrome(words));
    }
}
