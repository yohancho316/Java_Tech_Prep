package Interview.CISCO_TECHNICAL_ASSESSMENT;
import java.util.Arrays;

// DATE: 3/24/2022

public class SumDigits {

    public static int sumDigits(int numX, int numY) {

        int occurs = 0;
        int[] nums = new int[20];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }


        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int sum = nums[left] + nums[right];
            if(sum == numY) {
                System.out.println(nums[left] + " + " + nums[right] + " = " + sum);
                ++occurs;
                ++left;
                --right;
            } else if(sum >= numY) {
                --right;
            } else {
                ++left;
            }
        }

        return occurs;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(20,5));

    }
}

/*

        int occurs = 0;
        int[] nums = new int[numX + 1];

        for(int i = 0; i < numX + 1; i++) {
            nums[i] = i;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == numY) {
//                System.out.println(nums[left] + " + " + nums[right] + " = " + sum);
                ++occurs;
                ++left;
                --right;
            } else if(sum >= numY) {
                --right;
            } else {
                ++left;
            }
        }

        return occurs;



 */
