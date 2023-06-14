package LeetCode;

public class LC_459_2 {

    public static boolean repeatedSubstringPattern(String s) {
        if(s.length() <= 1) return false;
        int[] lps = new int[s.length()];
        int x = 0; int y = 1;
        while(x < s.length() && y < s.length()) {
            if(s.charAt(x) == s.charAt(y)) {
                lps[y] = x + 1;
                ++x; ++y;
            } else if(s.charAt(x) != s.charAt(y) && x == 0) {
                lps[y] = 0;
                ++y;
            } else if(s.charAt(x) != s.charAt(y) && x > 0) {
                x = lps[x - 1];
            }
        }
        if(lps[s.length() - 1] == 0) return false;
        String subStr = "";
        String pattern = s.substring(0, s.length() - lps[s.length() - 1]);
        System.out.println("Pattern: " + pattern);

        for(int i = 0; i < s.length() / pattern.length(); i++) {
            subStr += "" + pattern;
        }

        return s.equals(subStr);
    }

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        repeatedSubstringPattern(s);
    }
}
