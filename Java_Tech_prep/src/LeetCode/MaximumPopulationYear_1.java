package LeetCode;

public class MaximumPopulationYear_1 {

    public static int maximumPopulation(int[][] logs) {

        int start_year = Integer.MAX_VALUE;
        int end_year = Integer.MIN_VALUE;

        for(int i = 0; i < logs.length; i++) {

            if(logs[i][0] < start_year) {
                start_year = logs[i][0];
            }

            if(logs[i][1] > end_year) {
                end_year = logs[i][1];
            }
        }

        int max_year = start_year;
        int max_pop = 0;

        while(start_year <= end_year) {

            int count = 0;

            for(int j = 0; j < logs.length; j++) {
                if(logs[j][0] <= start_year && (start_year <= (logs[j][1] - 1))) {
                    ++count;
                }
            }

            //System.out.println("Current Year: " + start_year + "\t Count: " + count);

            if(count > max_pop) {
                max_pop = count;
                max_year = start_year;
            }

            start_year++;
        }


        //System.out.println("Max Year: " + max_year + "\t Max Pop: " + max_pop);
        return max_year;
    }


    public static void main(String[] args) {
        int[][] logs = {{1993,  1998}, {1994, 1999}, {1992, 2000}, {1990, 2000}};
        System.out.println(maximumPopulation(logs));
    }
}
