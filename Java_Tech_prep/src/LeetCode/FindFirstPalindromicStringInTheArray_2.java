package LeetCode;

public class FindFirstPalindromicStringInTheArray_2 {


    public static String firstPalindrome(String[] words) {

        if(words.length == 0) {
            return "";
        }

        for(int i = 0; i < words.length; i++) {
            String current_word = words[i];
            String reversed_half = "";
            int mid = current_word.length() / 2;
            for(int j = current_word.length() - 1; j >= mid; j--) {
                reversed_half += current_word.charAt(j);
            }
            String first_half = current_word.substring(0, mid);
            String parsed_reversed_half = reversed_half.substring(0, reversed_half.length() - 1);

            if((first_half.equals(reversed_half)) || (first_half.equals(parsed_reversed_half))) {
                return current_word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc", "def", "hij", "dad"};
        System.out.println(firstPalindrome(words));
    }
}
