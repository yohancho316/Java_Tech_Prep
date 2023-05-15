package LeetCode;

public class LC_520_1 {

    public static boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        int lower = 0;
        int upper = 0;

        for(int i = 1; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) ++upper;
            else ++lower;
            if(upper >= 1 && lower >= 1) return false;
        }

        if(Character.isUpperCase(word.charAt(0)) && ((lower == word.length() - 1) || (upper == word.length() - 1))) {
            return true;
        } else if(Character.isLowerCase(word.charAt(0)) && (lower == word.length() - 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "ABbCD";
        System.out.println(detectCapitalUse(word));
    }
}
