package LeetCode;

public class HappyNumber_1 {

    public static boolean isHappy(int n) {

        if(n == 1) return true;

        String num = "" + n;
        int sum = 0;

        while(sum != 1) {
            int localSum = 0;
            for(int i = 0; i < num.length(); i++) {
                int curr = Integer.parseInt(String.valueOf(num.charAt(i)));
                localSum += Math.pow(curr, 2);
            }
            sum = localSum;
            num = "" + localSum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
