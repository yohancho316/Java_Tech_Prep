package LeetCode;

public class LongestCommonPrefix_10 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        String prefix = strs[0];

        while(prefix.length() > 0) {
            int count = 0;
            for(int i = 0; i < strs.length; i++) {
                if(strs[i].indexOf(prefix) == 0) ++count;
            }
            if(count == strs.length) return prefix;
            else prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"low", "lower", "lowest"};
        System.out.println(new String("lower").indexOf(new String("low")));
        System.out.println(longestCommonPrefix(strs));
    }
}
