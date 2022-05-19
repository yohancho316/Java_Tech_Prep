package LeetCode;

public class ShortestWordDistance_1 {

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {

        int left_pos = -1, right_pos = -1;

        for(int i = 0; i < wordsDict.length; i++) {

            String current = wordsDict[i];

            if((current.equals(word1) || current.equals(word2)) && (left_pos == -1)) {
                left_pos = i;
                continue;
            }

            if((current.equals(word1) || current.equals(word2)) && (left_pos != -1)) {
                right_pos = i;
                break;
            }
        }

        return Math.max(left_pos, right_pos) - Math.min(left_pos, right_pos);
    }

    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(shortestDistance(wordsDict, "makes", "coding"));
    }
}
