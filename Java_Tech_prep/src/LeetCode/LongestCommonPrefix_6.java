package LeetCode;

public class LongestCommonPrefix_6 {

    public static String longestCommonPrefix(String[] strs) {

        int pos = 0;
        String prefix = "";
        char current = '\0';
        boolean exists = true;

        while(pos < strs[0].length()) {

            current = strs[0].charAt(pos);
            for(int i = 1; i < strs.length; i++) {
                if(pos < strs[i].length() && current == strs[i].charAt(pos)) {
                    exists = true;
                } else {
                    exists = false;
                    break;
                }
            }

            if(exists == true) {
                prefix += current;
                current = '\0';
                pos += 1;
            } else {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
