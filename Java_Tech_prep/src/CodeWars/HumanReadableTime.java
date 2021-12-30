/*
URL: https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
Difficulty: 5-Kyu
Time Complexity: O(1)
Space Complexity: O(1)
 */

package CodeWars;

public class HumanReadableTime {

    public static String convertTime(int seconds) {

        // Local Declarations
        int hours = 0;
        int minutes = 0;
        String convertedTime = "";

        // Find Total Hours
        if(seconds >= 3600) {
            hours = seconds / 3600;
            seconds -= (hours * 3600);
        }

        // Find Total Minutes
        if(seconds >= 60) {
            minutes = seconds / 60;
            seconds -= (minutes * 60);
        }

        if(hours < 10) {
            convertedTime += "0" + hours + ":";
        } else {
            convertedTime += hours + ":";
        }

        if(minutes < 10) {
            convertedTime += "0" + minutes + ":";
        } else {
            convertedTime += minutes + ":";
        }

        if(seconds < 10) {
            convertedTime += "0" + seconds;
        } else {
            convertedTime += seconds;
        }

        return convertedTime;
    }

    public static void main(String[] args) {

        int seconds = 86399;
        System.out.println(convertTime(seconds));

    }
}
