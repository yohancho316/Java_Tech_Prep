package LeetCode;

import java.util.Arrays;

public class LC_2335_1 {

    public static int fillCups(int[] amount) {
        int sum = amount[0] + amount[1] + amount[2];
        int count = 0;
        if(amount[0] == sum || (amount[1] == sum) || (amount[2] == sum)) return sum;
        Arrays.sort(amount);
        while((amount[1] >= 1) && (amount[2] >= 1)) {
            ++count;
            --amount[1];
            --amount[2];
            Arrays.sort(amount);
        }

        return count + amount[0] + amount[1] + amount[2];
    }

    public static void main(String[] args) {
        int[] amount = {5,4,4};
        System.out.println("Seconds to Fill: " + fillCups(amount));
    }
}
