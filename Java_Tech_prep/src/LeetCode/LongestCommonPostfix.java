package LeetCode;

public class LongestCommonPostfix {

    public static String longestCommonPostfix(String[] strs) {

        if(strs.length == 0) return "Does Not Exist";
        else if(strs.length == 1) return strs[0];

        String common = strs[0];

        for(int i = 1; i < strs.length; i++) {

            while(strs[i].endsWith(common) != true) {

                common = common.substring(1, common.length());
                System.out.println(common);

                if(common.length() == 0) return "DNE";
            }

        }

        return common;
    }

    public static void main(String[] args) {

        String[] strs = {"subtract", "contract", "extract", "retract", "bread"};
        System.out.println(longestCommonPostfix(strs));

    }
}
