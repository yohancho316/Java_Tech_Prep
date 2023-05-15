package LeetCode;

public class FindIndexOfTheFIrstOccurenceInAString_1 {

    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;


        
        return -1;
    }

    public static void main(String[] args) {
        String needle = "ell";
        String haystack = "hello";
        System.out.println(strStr(haystack, needle));
    }
}
