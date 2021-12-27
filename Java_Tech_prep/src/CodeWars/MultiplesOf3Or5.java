/*
Date: 12/24/2021
URL: https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
Difficulty: 6-Kyu
Time Complexity: O(N)
Space Complexity: O(1)

 */

package CodeWars;

public class MultiplesOf3Or5 {

    public static int findMultiples(int number) {

        // Local Declarations
        int divisible_count = 0;

        // Resolve Negative Numbers
        if(number < 0) {
            return - 1;
        }

        // Iterate to Find Sum of Numbers % 3 % 5
        for(int i = 3; i < number; i++) {
            if((i % 3 == 0) || (i % 5 == 0)) {
                divisible_count += i;
            }
        }

        return divisible_count;
    }

    public static void main(String[] args) {

        int num = 2;
        System.out.println(findMultiples(num));
    }
}
