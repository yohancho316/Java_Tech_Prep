package LeetCode;

public class strStr {

    public static int strStr(String haystack, String needle) {

        if(needle.length() == 0) return 0;
        if(haystack.length() < needle.length()) return -1;

        for(int i = 0; i < haystack.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i + j) != haystack.charAt(j)) {
                    break;
                }
                if(j == (needle.length() - 1)) {
                    return i;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        String haystack = "noodle";
        String needle = "ood";
        System.out.println(strStr(haystack, needle));

    }
}
