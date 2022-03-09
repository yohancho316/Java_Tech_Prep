package LeetCode;

public class LongestCommonPrefix_5 {

    public static String longestCommonPrefix(String[] strs) {

        // Check for Empty String or String Array with Only One Element
        if(strs.length == 0) return "";
        else if(strs.length == 1) return strs[0];

        String compare = strs[0];

        for(int i = 1; i < strs.length; i++) {

            while(strs[i].indexOf(compare) != 0) {

                compare = compare.substring(0,compare.length() - 1);

                if(compare.length() == 0) {
                    return "";
                }
            }
        }

        return compare;
    }

    public static void main(String[] args) {
        String[] arr = {"dog", "flow", "flank"};
        System.out.println(longestCommonPrefix(arr));
    }
}
