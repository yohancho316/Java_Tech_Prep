package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_1 {

    public static void fillList(List<List<Integer>> list, int count, int numRows) {

        // Base Case
        if(count == numRows) return;

        List<Integer> local = new ArrayList<Integer>();

        if(count == 0) {
            local.add(1);
            list.add(local);
            fillList(list, ++count, numRows);
        } else if(count == 1) {
            local.add(1);
            local.add(1);
            list.add(local);
            fillList(list, ++count, numRows);
        } else {
            local.add(1);
            for(int i = 1; i < list.get(count - 1).size(); i++) {
                Integer sum = list.get(count - 1).get(i - 1) + list.get(count - 1).get(i);
                local.add(sum);
            }
            local.add(1);
            list.add(local);
            fillList(list, ++count, numRows);
        }
        return;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int count = 0;
        fillList(list, count, numRows);
        return list;
    }

    public static void main(String[] args) {

        List<List<Integer>> filled = generate(5);

        System.out.println("Size: " + filled.size());

        for(int i = 0; i < filled.size(); i++) {
            for(int j = 0; j < filled.get(i).size(); j++) {
                System.out.print(filled.get(i).get(j) + "\t");
            }
            System.out.println();
        }

    }
}
