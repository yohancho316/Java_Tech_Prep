/*
URL: https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true
Difficulty: Easy
Time Complexity: O(N^2)
Space Complexity: O(N)
 */

package HackerRank;
import java.util.List;

public class TwoDArray {

    public static int hourGlassSum(List<List<Integer>> arr) {

        // Local Declarations
        int[] hourglass_sum = new int[16];
        int top = 0;
        int mid = 1;
        int bottom = 2;
        int index = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int top_sum = arr.get(top).get(j) + arr.get(top).get(j + 1) + arr.get(top).get(j + 2);
                int mid_sum = arr.get(mid).get(j + 1);
                int bottom_sum = arr.get(bottom).get(j) + arr.get(bottom).get(j + 1) + arr.get(bottom).get(j + 2);
                hourglass_sum[index] = top_sum + mid_sum + bottom_sum;
                index += 1;
            }
            top += 1;
            mid += 1;
            bottom += 1;
        }

        int max = hourglass_sum[0];

        for(int k = 1; k < hourglass_sum.length; k++) {
            if(hourglass_sum[k] > max) {
                max = hourglass_sum[k];
            }
        }
        System.out.println("Largest Sum: " + max);
        return max;
    }

    public static void main(String[] args) {

    }
}

//    // Local Declarations
//    int[] hourglass_sum = new int[16];
//    int top = 0;
//    int mid = 1;
//    int bottom = 2;
//    int index = 0;
//
//        for(int i = 0; i < 4; i++) {
//        for(int j = 0; j < 4; j++) {
//        int top_sum = arr[top][j] + arr[top][j + 1] + arr[top][j + 2];
//        int mid_sum = arr[mid][j + 1];
//        int bottom_sum = arr[bottom][j] + arr[bottom][j +1] + arr[bottom][j + 2];
//        hourglass_sum[index] = top_sum + mid_sum + bottom_sum;
//        index += 1;
//        }
//        top += 1;
//        mid += 1;
//        bottom += 1;
//        }
//
//        int max = hourglass_sum[0];
//
//        for(int k = 1; k < hourglass_sum.length; k++) {
//        if(hourglass_sum[k] > max) {
//        max = hourglass_sum[k];
//        }
//        }
//        System.out.println("Largest Sum: " + max);
//        return max;
