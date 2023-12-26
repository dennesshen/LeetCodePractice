package LeetCode75;

/**
 * @author christinehsieh on 2023/12/25
 */
public class MergeStringAlternately_1768 {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        if (word1.length() > word2.length()){
            extracted(word1, word2, result, true);
        } else {
            extracted(word2, word1, result, false);
        }

        return result.toString();
    }

    private void extracted(String longWord, String shortWord, StringBuilder result, boolean isLongFirst) {

        for (int i = 0; i < shortWord.length(); i++){
            if (isLongFirst) {
                result.append(longWord.charAt(i));
                result.append(shortWord.charAt(i));
            }else {
                result.append(shortWord.charAt(i));
                result.append(longWord.charAt(i));
            }
        }
        result.append(longWord.substring(shortWord.length(), longWord.length()));
    }

}
