package Technical_Interviews;// DATE: 3/24/2022

public class CISCO_MaxDiff {

    public static int maximumDifference(int[] inputArr) {

        int max = Integer.MIN_VALUE;

        if(inputArr.length == 0) return 0;

        for(int i = 0; i < (inputArr.length - 1); i++) {
            for(int j = i + 1; j < inputArr.length; j++) {
                int current_diff = inputArr[j] - inputArr[i];
                if(current_diff > max) {
                    max = current_diff;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,10,6,4,8,1};
        System.out.println(maximumDifference(nums));
    }
}
