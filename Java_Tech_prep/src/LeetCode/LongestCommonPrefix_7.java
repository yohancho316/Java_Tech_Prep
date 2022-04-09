package LeetCode;

public class LongestCommonPrefix_7 {

    public static String longestCommonPrefix(String[] strs) {

        String compare = strs[0];

        if(compare.isEmpty()) return "";

        for(int i = 1; i < strs.length; i++) {

            String current = strs[i];

            if(compare.length() > current.length()) {
                compare = compare.substring(0, current.length());
            }

            while(current.indexOf(compare) != 0) {
                compare = compare.substring(0, compare.length() - 1);

                if(compare.isEmpty()) return "";
            }
        }

        return compare;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
