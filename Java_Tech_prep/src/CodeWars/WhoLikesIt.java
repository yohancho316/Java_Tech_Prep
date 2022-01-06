/*
URL: https://www.codewars.com/kata/5266876b8f4bf2da9b000362
Difficulty: 6-Kyu
Time Complexity: O(1)
Space Complexity: O(1)
 */

package CodeWars;

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {

        // Local Declarations
        int length = names.length;

        if(length == 0) {
            return "no one likes this";
        } else if(length == 1) {
            return names[0] + " likes this";
        } else if(length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if(length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + Integer.toString(length - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Mike", "Larry", "Max", "Jacob"};
        System.out.println(whoLikesIt(names));
    }
}
