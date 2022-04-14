package Technical_Interviews;// DATE: 3/24/2022

public class CISCO_ContinuousMaxSum {


    public static int largestSumSequence(int[] inputArr) {

        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < inputArr.length; i++) {
            current_sum += inputArr[i];

            if(current_sum > max_sum) max_sum = current_sum;

            if(current_sum < 0) current_sum = 0;
        }
        return max_sum;
    }

    public static void main(String[] args) {

        int[] inputArr = {2, -8, 3, -2, 4, -10};
        System.out.println(largestSumSequence(inputArr));

    }
}
