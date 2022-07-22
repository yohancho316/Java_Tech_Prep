package LeetCode;

public class LongestCommonPrefix_8 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        int maxLength = strs[0].length();
        for(int i = 0; i < strs.length; i++) {
            maxLength = (strs[i].length() < maxLength) ? strs[i].length() : maxLength;
        }
        String str = "";
        for(int i = 0; i < maxLength; i++) {
            char current = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != current) {
                    return str;
                }
            }
            str += current;
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
