package LeetCode;

public class CountBinarySubstrings_1 {

    public static int countBinarySubstrings(String s) {
        int x = 0;
        int[] occurs = new int[s.length()];

        occurs[x] = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) != s.charAt(i)) {
                occurs[++x] = 1;
            } else {
                occurs[x] += 1;
            }
        }


        int count = 0;

        for(int j = 1; j <= x; j++) {
            count += Math.min(occurs[j - 1],occurs[j]);
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "101010";
        System.out.println(countBinarySubstrings(s));

    }
}
