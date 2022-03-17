package LeetCode;
import java.util.Arrays;

public class PlusOne_2 {

    public static int[] plusOne(int[] digits) {
        String num = "";

        for(int i = 0; i < digits.length; i++) {
            num += Integer.toString(digits[i]);
        }

        int converted_num = Integer.parseInt(num) + 1;

        num = Integer.toString(converted_num);

        int[] return_arr = new int[num.length()];

        for(int i = 0; i < num.length(); i++) {
            return_arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return return_arr;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(Arrays.toString(plusOne(num)));
    }
}
