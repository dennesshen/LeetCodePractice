package LeetCode75;

/**
 * @author christinehsieh on 2023/12/25
 */
public class MergeStringAlternately2_1768 {

    public String mergeAlternately(String word1, String word2) {

        String longerWord = word1.length() >= word2.length() ? word1 : word2;
        int shorterSize = word1.length() >= word2.length() ? word2.length(): word1.length();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < shorterSize; i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        result.append(longerWord.substring(shorterSize));

        return result.toString();

    }



}
