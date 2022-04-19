package LeetCode;
import java.util.HashMap;

public class MaximumUnitsOnATruck_1 {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        int currentSize = 0;
        int currentUnit = 0;
        HashMap<Integer,Integer> exists = new HashMap<Integer,Integer>();

        while(currentSize != truckSize) {

            int maxSize = 0;
            int maxIndex = 0;

            for(int i = 0; i < boxTypes.length; i++) {

                if((boxTypes[i][1] > maxSize) && (!exists.containsKey(i))) {
                    maxSize = boxTypes[i][1];
                    maxIndex = i;
                }
            }

            exists.put(maxIndex, maxIndex);

            int availableSpace = truckSize - currentSize;
            int insert_amount = availableSpace - (availableSpace - boxTypes[maxIndex][0]);

            currentSize += insert_amount;
            currentUnit += insert_amount * boxTypes[maxIndex][1];
        }

        return currentUnit;

    }


    public static void main(String[] args) {

        int[][] boxTypes = {{5,10}, {2,5}, {4,7}, {3,9}};
        System.out.println(maximumUnits(boxTypes,10));
    }
}
