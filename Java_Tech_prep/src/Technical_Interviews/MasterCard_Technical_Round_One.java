package Technical_Interviews;

public class MasterCard_Technical_Round_One {

    public static void main(String[] args) {

        // 1 = blue
        // 2 = red
        // 3 = orange

        int[][] tubes = new int[5][4];

        int possible_moves = 0;

        for(int i = 0; i < tubes.length; i++) {

            int top_index = tubes[i].length - 1;
            int current_color = tubes[i][top_index];

            for(int j = 0; j < tubes.length; j++) {

                int current_height = tubes[j].length;

                if(i == j) {
                    continue;
                } else if(current_height >= 4) {
                    continue;
                } else if(current_height >= 4) {
                    continue;
                } else if(current_color != tubes[i][current_height]) {
                    continue;
                } else {
                    ++possible_moves;
                }
            }
            System.out.println("possible moves: " + possible_moves);
        }



    }
}
