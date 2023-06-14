package LeetCode;

import java.util.Arrays;

public class LC_459_1 {

    public static boolean repeatedSubstringPattern(String s) {
        if(s.length() <= 1) return false;
        int[] lps = new int[s.length()];
        int x = 0; int y = 1;
        while(y < s.length()) {
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

        String pattern = "";

        // IF there is a non-empty prefix == suffix
        if(lps[s.length() - 1] > 0) {
            // IF there exists a non-empty prefix == suffix of size lps[s.length() - 1]
            // Does this prefix / suffix of the given length be split into multiple copies of the repeated pattern
            if((s.length() % (s.length() - lps[s.length() - 1])) == 0) {
                pattern = s.substring(0, s.length() - lps[s.length() - 1]);
            }
        }

        if(pattern.length() == 0) return false;

        pattern = new String(new char[s.length() / pattern.length()]).replace("\0", pattern);

        return pattern.length() > 0 && s.equals(pattern);
    }

    public static void main(String[] args) {
        String s = "abaababaab";
        System.out.println("Equals: " + repeatedSubstringPattern(s));
    }
}
