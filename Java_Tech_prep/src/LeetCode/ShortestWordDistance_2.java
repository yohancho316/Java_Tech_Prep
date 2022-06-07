package LeetCode;

public class ShortestWordDistance_2 {

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {

        int pos1 = -1, pos2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < wordsDict.length; i++) {
            if(word1.equals(wordsDict[i])) {
                pos1 = i;
            } else if(word2.equals(wordsDict[i])) {
                pos2 = i;
            }

            if(pos1 != -1 && pos2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(pos1 - pos2));
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        String[] s = {"hi", "hello", "bye", "goodbye"};
        System.out.println(shortestDistance(s,"goodbye", "hello"));
    }
}
