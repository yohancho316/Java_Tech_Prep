package In_Built_DSA;

public class ArrayPractice {

    public static void main(String[] args) {

        int[][] double_list = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i = 0; i < double_list.length; i++) {
            System.out.println("Row # " + i);
            for(int j = 0; j < double_list[i].length; j++) {
                System.out.println(double_list[i][j]);
            }
            System.out.println();
        }
    }
}
