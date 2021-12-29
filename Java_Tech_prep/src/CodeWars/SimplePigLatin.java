/*
URL: https://www.codewars.com/kata/520b9d2ad5c005041100000f/java
Difficulty: 5-Kyu
Time Complexity: O(N)
Space Complexity: O(1)
 */

package CodeWars;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SimplePigLatin {

    public static String pigLatin(String str) {

        // Local Declarations
        String return_str = "";
        String regular_expression = "^[\\.\\[\\{\\$\\+\\]}%\\^&*(),!?]+$";

        // Split the String Argument by the White Space Delimiter
        String[] string_arr = str.split(" ");


        for(int i = 0; i < string_arr.length; i++) {

            Pattern pattern = Pattern.compile(regular_expression);
            Matcher matcher = pattern.matcher(string_arr[i]);

            // Check if the String doesn't Contain Punctuation apply Pig Latin
            if(!(matcher.matches()) && (string_arr[i].length() >= 2)) {
                String front = string_arr[i].substring(1);
                String end = string_arr[i].substring(0,1) + "ay";
                return_str += front + end + " ";
            } else if (!(matcher.matches()) && (string_arr[i].length() == 1)){
                return_str += string_arr[i] + "ay ";
            } else {
                return_str += string_arr[i] + " ";
            }
        }

        return return_str.substring(0, return_str.length() - 1);
    }

    public static void main(String[] args) {
        String sentence = "O [] tempora o mores !";

        System.out.println(pigLatin(sentence));
    }
}
