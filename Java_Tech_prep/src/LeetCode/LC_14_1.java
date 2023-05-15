package LeetCode;

public class LC_14_1 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        for(int i = 1; i < strs.length; i++) {
            if(strs[0].length() > strs[i].length()) {
                String temp = strs[0];
                strs[0] = strs[i];
                strs[i] = temp;
            }
        }

        String compare = strs[0];

        while(compare.length() >= 1) {
            int count = 0;
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].indexOf(compare) == 0) ++count;
                else {
                    break;
                }
            }
            if(count == strs.length - 1) return compare;
            compare = compare.substring(0, compare.length() - 1);
        }
        return compare;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("Compare: " + longestCommonPrefix(strs));
    }
}
