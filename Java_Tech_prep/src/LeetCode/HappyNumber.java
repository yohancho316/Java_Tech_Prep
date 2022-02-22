package LeetCode;

public class HappyNumber {

    public static boolean isHappy(int n) {

        // Local Declarations
        String x = Integer.toString(n);

        while(true) {
            int sum = 0;
            for(int i = 0; i < x.length(); i++) {
                int square = Character.getNumericValue(x.charAt(i));
                sum += (square * square);
            }
            if(sum == 1) {
                return true;
            } else {
                x = Integer.toString(sum);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
