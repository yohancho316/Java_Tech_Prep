package LeetCode;

public class LongestCommonPrefix_2 {

    public static String longestCommonPrefix(String[] strs) {

        // Local Declarations
        String compare = strs[0];

        // Iterate through the Elements of String Array
        for(int i = 1; i < strs.length; i++) {

            // Check if String Element is Empty
            if(strs[i].length() == 0) {
                return "";
            }

            // Iterate while String.indexOf() != 0
            while(strs[i].indexOf(compare) != 0) {
                compare = compare.substring(0, compare.length() - 1);

                // Check if Compare Length is 0 (Exhausted all Possible Prefix)
                if(compare.length() == 0) {
                    return "";
                }
            }
        }
        return compare;
    }

    public static void main(String[] args) {
        String[] list = {"flood", "", "floodlighters", ""};
        System.out.println(longestCommonPrefix(list));
    }
}
