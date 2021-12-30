/*
URL: https://www.codewars.com/kata/541c8630095125aba6000c00/java
Difficulty: 6-Kyu
Time Complexity: O(N^2)
Space Complexity: O(1)
 */
package CodeWars;

public class DigitalRoot {

    public static int digital_root(int n) {

        String num = Integer.toString(n);
        int sum = 0;

        while(num.length() != 1) {
            sum = 0;
            for(int i = 0; i < num.length(); i++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            num = Integer.toString(sum);
        }

        return sum;
    }

    public static void main(String[] args) {

        int num = 942;
        System.out.println(digital_root(num));
    }
}
