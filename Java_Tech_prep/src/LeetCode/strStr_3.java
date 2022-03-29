package LeetCode;

public class strStr_3 {

    public static int strStr(String haystack, String needle) {

        if(needle.isEmpty()) {
            return 0;
        } else if(needle.length() > haystack.length()) {
            return -1;
        }

        int slow = 0;
        int fast = 0;
        int occurs = 0;

        for(; fast <= (haystack.length() - needle.length()); ++fast) {
            if(haystack.charAt(fast) == needle.charAt(slow)) {

                while(slow < needle.length()) {
                    if(needle.charAt(slow) == haystack.charAt(fast + slow)) {
                        ++occurs;
                        ++slow;
                    } else {
                        slow = 0;
                        occurs = 0;
                        break;
                    }
                }

                if(occurs == needle.length()) {
                    return fast;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(strStr(haystack, needle));
    }
}
