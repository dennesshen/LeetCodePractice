package study.zigzagConversion_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class solution_1 {
	

	
	 public String convert(String s, int numRows) {
	    
		int cycleCount = numRows*2 - 2; 
		if (cycleCount <= 0) return s;
		List<List<String>> resultList = new ArrayList<>();
		
		for (int i = 0; i < numRows; i++) {
			resultList.add(new ArrayList<String>());
		}
		
		for (int i = 1; i <= s.length(); i++) {
			boolean ifCategorize = false;
			
			for (int j = 1; j <= numRows; j++) {
				
				if (i % cycleCount == j) {
					resultList.get(j-1).add(String.valueOf(s.charAt(i-1)));
					ifCategorize = true;
					break;
				}
				if (i % cycleCount == 0) {
					resultList.get(1).add(String.valueOf(s.charAt(i-1)));
					ifCategorize = true;
					break;
				}
			}
			
			if (ifCategorize) continue;
			
			for (int j = numRows + 1; j <= cycleCount; j++) {
				if (i % cycleCount == j) {
					resultList.get(numRows*2-j-1).add(String.valueOf(s.charAt(i-1)));
					break;
				}
				if (i % cycleCount == 0) {
					resultList.get(1).add(String.valueOf(s.charAt(i-1)));
					break;
				}
			}
			
		}
		 
		 return resultList.stream().flatMap(r -> r.stream()).collect(Collectors.joining());
	 }
}
