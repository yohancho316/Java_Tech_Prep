package LeetCode;

public class LongestCommonPrefix_4 {

    public static String longestCommonPrefix(String[] strs) {

        // Check for Empty Array
        if(strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++) {

            while(strs[i].indexOf(prefix) != 0) {

                // Check if Prefix Length == 0
                if(prefix.length() == 0) return "";

                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}
