package study.LongestWord_524;

import java.util.List;
import java.util.stream.Collectors;

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
// 錯誤做法 -> 誤會題意 
public class Solution_1 {
	
	public static void main(String[] args) {
//		String string = "abadfgdsfg";
//
//		List<String> compareList = string.chars().mapToObj(Character::toString)
//				.collect(Collectors.toList());
//		System.out.println(compareList);
//		compareList.remove("a");
//		System.out.println(compareList);
		
	}
	
//	public String findLongestWord(String s, List<String> dictionary) {
//
//		int compareLenth = 0;
//		String longestString = "";
//
//		List<String> compareList;
//		for (String dictionary_string : dictionary) {
//
//			 compareList = s.chars().mapToObj(Character::toString)
//												.collect(Collectors.toList());
//
//			int maxlenth = 0;
//			for (int i = 0; i < dictionary_string.length(); i++) {
//
//			   boolean ifRemove =
//			   		compareList.remove(String.valueOf(dictionary_string.charAt(i)));
//
//			   maxlenth = i;
//			   if (!ifRemove) break;
//
//			}
//			if ( maxlenth+1 == dictionary_string.length() && maxlenth+1 > compareLenth) {
//				longestString = dictionary_string;
//				compareLenth = maxlenth+1;
//			}
//
//		}
//
//
//		return longestString;
//    }
}
