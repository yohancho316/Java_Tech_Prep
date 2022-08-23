package LeetCode;

public class PartitionArrayIntoThreePartsWithEqualSum_1 {

    public static boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        int average = 0;
        int sum = 0;
        int occurs = 0;

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        if(total % 3 == 0) {
            average = total / 3;
        } else {
            return false;
        }

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if(sum == average) {
                sum = 0;
                ++occurs;
            }
        }

        return occurs >= 3 && sum % 3 == 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        System.out.println(canThreePartsEqualSum(arr));

    }
}
