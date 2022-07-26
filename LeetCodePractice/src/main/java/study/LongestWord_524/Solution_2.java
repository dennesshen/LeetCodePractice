package study.LongestWord_524;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;

/*
524. Longest Word in Dictionary through Deleting：

Given a string s and a string array dictionary, 
return the longest string in the dictionary that can be formed by deleting some of the given string characters. 
If there is more than one possible result, return the longest word with the smallest lexicographical order. 
If there is no possible result, return the empty string.

Example 1:
Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"

Example 2:
Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a"

*/

/**
 * @author christinehsieh
 */
public class Solution_2 {

	public String findLongestWord(String s, List<String> dictionary) {
		Set<String> resultSet = new LinkedHashSet<>();

		for (String dictionary_string : dictionary) {
			compare(s, dictionary_string, resultSet);
		}

		BinaryOperator<String> accumulator = (s1, s2) -> {
			if (s1.length() > s2.length()) {
				return s1;
			} else if (s1.length() < s2.length()) {
				return s2;
			}
			return compareLexicographicalOrder(s1, s2);
		};
		
		String answer = resultSet.stream().reduce(accumulator).orElseGet(() -> "");

		return answer;
	}

	private static void compare(String content, String target, Set<String> answerSet) {

		int contentIndex = 0;
		int targetIndex = 0;

		for (int i = 0; i < target.length(); i++) {

			char targetWord = target.charAt(i);

			for (int j = contentIndex; j < content.length(); j++) {

				if (targetWord == content.charAt(j)) {
					contentIndex = j + 1;
					targetIndex += 1;
					break;
				}
			}

			if (i == targetIndex)
				break;

		}

		if (targetIndex == target.length()) {
			answerSet.add(target);
		}
	}

	private static String compareLexicographicalOrder(String s1, String s2) {

		if (s1.compareTo(s2) > 0) {
			return s2;
		} else {
			return s1;
		}

	}

}
