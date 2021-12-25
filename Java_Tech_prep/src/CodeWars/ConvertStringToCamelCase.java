/*
URL:
Difficulty: 6-Kyu
Time Complexity:
Space Complexity:
 */

package CodeWars;
import java.lang.*;

public class ConvertStringToCamelCase {

    public static String toCamelCase(String s) {

        // Check if Input is Empty String or Doesn't Contain "_"/"-"
        if(s.length() == 0 || (!s.contains("-") && !s.contains("_"))) {
            return s;
        }

        String return_str = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-' || s.charAt(i) == '_') {
                return_str += Character.toUpperCase(s.charAt(i + 1));
                i += 1;
            } else {
                return_str += s.charAt(i);
            }
        }

        if(Character.isUpperCase(s.charAt(0))) Character.toUpperCase(return_str.charAt(0));

        return return_str;
    }

    public static void main(String[] args) {
        String sentence = "The_Stealth-Warrior";
        String empty = "";
        String without = "TheStealthWarrior";
        System.out.println(toCamelCase(sentence));

    }
}
