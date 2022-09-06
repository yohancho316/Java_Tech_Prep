package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PascalsTriangleII_1 {

    public static List<Integer> getRow(int rowIndex) {

        HashMap<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
        map.put(0,new ArrayList<Integer>(Arrays.asList(1)));
        map.put(1,new ArrayList<Integer>(Arrays.asList(1,1)));


        for(int i = 2; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            for(int j = 1; j < map.get(i - 1).size(); j++) {
                Integer sum = map.get(i - 1).get(j - 1) + map.get(i - 1).get(j);
                list.add(sum);
            }
            list.add(1);
            map.put(i, list);
        }

        return map.get(rowIndex);
    }

    public static void main(String[] args) {

        List<Integer> list = getRow(3);
        for(Integer num : list) {
            System.out.println(num);
        }
    }
}
