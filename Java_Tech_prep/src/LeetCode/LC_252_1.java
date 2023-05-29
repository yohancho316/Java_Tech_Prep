package LeetCode;

import javafx.scene.SceneAntialiasing;
import sun.jvm.hotspot.utilities.Interval;

import java.util.Arrays;
import java.util.Comparator;

public class LC_252_1 {

    public static boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length == 0 || intervals.length == 1) return true;

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] > intervals[i - 1][0]) {
                System.out.println("previous hour: " + intervals[i - 1][0]);
                System.out.println("current hour: " + intervals[i][0]);
                continue;
            } else if((intervals[i][0] == intervals[i - 1][0]) && intervals[i - 1][1] < intervals[i][1]) {
                System.out.println("previous minutes: " + intervals[i - 1][0]);
                System.out.println("current minutes: " + intervals[i][0]);
                continue;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        matrix[0][0] = 0;
        matrix[1][0] = 5;
        matrix[2][0] = 15;

        matrix[0][1] = 30;
        matrix[1][1] = 10;
        matrix[2][1] = 20;

        canAttendMeetings(matrix);
    }
}
