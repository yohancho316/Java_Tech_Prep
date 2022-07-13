package LeetCode;

import java.lang.reflect.Array;

public class AddStrings_1 {

    public static String addStrings(String num1, String num2) {
        int pos = 0;
        int carry = 0;
        int temp_sum = 0;
        String sum = "";

        if(num1.length() >= num2.length()) pos = num2.length() - 1;
        else pos = num1.length() - 1;

        if(num1.length() >= num2.length()) {
            for(int i = num1.length() - 1; i >= 0; i--) {
                temp_sum = 0;
                if(pos >= 0) {
                    temp_sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(pos))) + carry;
                    if(temp_sum - 10 >= 0) carry = 1;
                    else carry = 0;
                    --pos;
                    sum = (temp_sum % 10) + sum;
                    System.out.println("Temp Sum: " + temp_sum);
                } else {
                    temp_sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + carry;
                    if(temp_sum - 10 >= 0) carry = 1;
                    else carry = 0;
                    sum = (temp_sum % 10) + sum;
                    System.out.println("Temp Sum: " + temp_sum);

                }
            }
        } else {
            for(int j = num2.length() - 1; j >= 0; j--) {
                temp_sum = 0;
                if(pos >= 0) {
                    temp_sum = Integer.parseInt(String.valueOf(num2.charAt(j))) + Integer.parseInt(String.valueOf(num1.charAt(pos))) + carry;
                    if(temp_sum - 10 >= 0) carry = 1;
                    else carry = 0;
                    --pos;
                    sum = (temp_sum % 10) + sum;
                    System.out.println("Temp Sum: " + temp_sum);

                } else {
                    temp_sum = Integer.parseInt(String.valueOf(num2.charAt(j))) + carry;
                    if(temp_sum - 10 >= 0) carry = 1;
                    else carry = 0;
                    sum = (temp_sum % 10) + sum;
                    System.out.println("Temp Sum: " + temp_sum);

                }
            }
        }

        if(carry == 1) {
            return "1" + sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        String num1 = "222";
        String num2 = "88";
        System.out.println(addStrings(num1, num2));
    }
}
