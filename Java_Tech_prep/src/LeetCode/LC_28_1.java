package LeetCode;

public class LC_28_1 {

    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println("S: " + s);
        String t = s.substring(3);
        System.out.println("T: " + t);
        System.out.println("S: " + s);

    }
}
