package LeetCode;

public class CountBinarySubstrings_2 {

    public static int countBinarySubstrings(String s) {

        int pos = 0;
        int[] occurs = new int[s.length()];

        occurs[pos] = 1;

        for(int i = 1; i < s.length(); i++) {

            if(s.charAt(i) == s.charAt(i - 1)) {
                ++occurs[pos];
            } else {
                occurs[++pos] = 1;
            }
        }

        int sum = 0;

        for(int j = 1; j <= pos; j++) {
            sum += Math.min(occurs[j - 1], occurs[j]);
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "1110000";
        System.out.println(countBinarySubstrings(s));
    }
}
