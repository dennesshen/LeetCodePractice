package study;

public class LongestPalindrome {
	public static void main(String[] args) {
		System.out.println(longestPalindromeSolution("abacab"));
	}
	
	public static String longestPalindromeSolution(String s) {
        String result = "";
        
        int indexStart = 0;
        int indexEnd = 0;
        int compareNumber = 1; 
        for (int i = 0; i < s.length(); i++) {
            int expandNumber = 0;
    		while( (i-expandNumber)>=0 && (i+1+expandNumber) < s.length() ) {
    			if(s.charAt(i-expandNumber) != s.charAt(i+1+expandNumber)) {
    				break;
    			}
        		expandNumber++;
    		}
    		if(expandNumber*2 > compareNumber) {
    			compareNumber = expandNumber*2;
    			indexStart = i - expandNumber +1;
    			indexEnd = i + expandNumber;
    		}
    		expandNumber = 0;
     		while( (i-expandNumber)>=0 && (i+expandNumber) < s.length() ) {
     			if(s.charAt(i-expandNumber) != s.charAt(i+expandNumber)) {
     				break;
     			}
     			expandNumber++;
     		}
     		System.out.println("i="+i+"區間長度＝"+((expandNumber-1)*2 + 1));
     		if((expandNumber-1)*2 + 1 > compareNumber) {
     			compareNumber = (expandNumber-1)*2 + 1;
     			indexStart = i - expandNumber + 1 ;
     			indexEnd = i + expandNumber - 1;
     		}
		}
        
        result = s.substring(indexStart, indexEnd+1);
        
		return result;
    }
}
