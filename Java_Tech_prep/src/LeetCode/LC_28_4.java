package LeetCode;

public class LC_28_4 {

    public static int strStr(String haystack, String needle) {
        if(haystack.isEmpty() || needle.isEmpty() || (needle.length() > haystack.length())) return -1;
        int[] lps = new int[needle.length()];
        int x = 0; int y = 1;
        while(y < needle.length()) {
            if(needle.charAt(x) == needle.charAt(y)) {
                lps[y] = x + 1;
                ++x; ++y;
            } else if(needle.charAt(x) != needle.charAt(y) && x > 0) {
                x = lps[x - 1];
            } else {
                lps[y] = 0;
                ++y;
            }
        }

        x = 0;
        y = 0;

        while(x < needle.length() && y < haystack.length()) {
            if(needle.charAt(x) == haystack.charAt(y)) {
                ++x; ++y;
            } else if(needle.charAt(x) != haystack.charAt(y) && x != 0) {
                x = lps[x - 1];
            } else if(needle.charAt(x) != haystack.charAt(y) && x == 0) {
                ++y;
            }
            if(x == needle.length()) break;
        }

        if(x == needle.length()) return y - needle.length();
        return -1;
    }

    public static void main(String[] args) {
        String needle = "ll";
        String haystack = "hello";
        strStr(haystack, needle);
    }
}
