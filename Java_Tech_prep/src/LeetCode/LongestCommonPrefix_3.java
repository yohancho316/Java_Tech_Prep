package LeetCode;

public class LongestCommonPrefix_3 {

    public static String longestCommonPrefix(String[] strs) {

        // Local Declarations
        String compare = strs[0];

        // Iterate through Each Word in String Array strs
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(compare) != 0) {
                if(compare.length() == 0) return "";
                compare = compare.substring(0, compare.length() - 1);
            }
        }

        return compare;
    }

    public static void main(String[] args) {
        String[] arr = {"b", "b", "b"};
        System.out.println(longestCommonPrefix(arr));
    }
}
