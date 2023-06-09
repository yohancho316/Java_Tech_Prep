package LeetCode;

public class LC_28_2 {
    public static void method1(String haystack, String needle) {
        int match = 0;
        int totalMatch = 0;

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            ++totalMatch;
            if(haystack.charAt(i) == needle.charAt(0)) {
                ++match;
                ++totalMatch;
                for(int j = 1; j < needle.length(); j++) {
                    ++totalMatch;
                    if(haystack.charAt(i + j) != needle.charAt(j)) {
                        ++totalMatch;
                        break;
                    } else ++match;
                }
                if(match == needle.length()) break;
            }
        }

        System.out.println("total comparisons made: " + totalMatch);
    }

    public static void method2(String haystack, String needle) {

        
        Character[] prefix = new Character[needle.length()];
        for(int i = 0; i < needle.length(); i++) {
            prefix[i] = needle.charAt(i);
        }
    }

    public static void main(String[] args) {
        String haystack = "abkabkabkabkabkabc";
        String needle = "abc";
        System.out.println("Haystack Length: " + haystack.length());
        method1(haystack, needle);
    }
}
