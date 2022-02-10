package CodeWars;

public class HumanReadableTime_2 {

    public static String makeReadable(int seconds) {

        // Local Declarations
        int hours = 0, minutes = 0;
        String final_time = "";

        // Calculate Total Hours
        if(seconds >= 3600) {
            hours = seconds / 3600;
            seconds -= (hours * 3600);
        }

        // Calculate Total Minutes
        if(seconds >= 60) {
            minutes = seconds / 60;
            seconds -= (minutes * 60);
        }

        // Concatenate Total Hours
        if(hours < 10) {
            final_time += ("0" + hours +":");
        } else {
            final_time += (hours +":");
        }

        // Concatenate Total Minutes
        if(minutes < 10) {
            final_time += ("0" + minutes +":");
        } else {
            final_time += (minutes + ":");
        }

        // Concatenate Total Seconds
        if(seconds < 10) {
            final_time += ("0" + seconds);
        } else {
            final_time += seconds;
        }

        return final_time;
    }


    public static void main(String[] args) {
        int seconds = 60;
        System.out.println(makeReadable(seconds));
    }
}
