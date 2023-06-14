package LeetCode;

import java.util.Arrays;

public class LC_28_3 {

    public static int[] generateLPS(char[] needle) {
        int i = 0; int j = 1;
        int[] lps = new int[needle.length];
        while(j < needle.length) {
            if(needle[i] == needle[j]) {
                lps[j] = i + 1;
                ++i;
                ++j;
            } else if(i == 0) {
                lps[j] = 0;
                ++j;
            } else {
                i = lps[i - 1];
            }
        }
        return lps;
    }

    public static int strStr(String haystack, String needle) {

        if(haystack.isEmpty() || needle.isEmpty()) return -1;

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int[] lps = generateLPS(needle.toCharArray());

        // h = haystack pointer
        // n = needle pointer
        int h = 0; int n = 0; int pos = 0;

        while(h < haystack.length() && n < needle.length()) {
            if(haystackArr[h] == needleArr[n]) {
                ++h; ++n;
            } else {
                if(n == 0) {
                    ++h;
                } else {
                    pos = lps[n - 1];
                    n = lps[n - 1];
                }
            }
        }

        if(n == needle.length()) return h - n;
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int x = strStr(haystack,needle);
        System.out.println("X = " + x);
    }
}
