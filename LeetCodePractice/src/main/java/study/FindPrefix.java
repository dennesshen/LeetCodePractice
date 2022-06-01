package study;


public class FindPrefix {
	
	public static void main(String[] args) {
		String answer = find("flower", "flow", "flowergh" );
		System.out.println(answer);
	}
	public static String find(String... str ) {
		String answer = "";
		
		for (int j = 0; j < str[0].length(); j++) {
			String buffer = str[0].charAt(j)+"";
			boolean isPrefix = true;
			for (int i = 1; i < str.length; i++) {
				try {
					String compareString = str[i].charAt(j)+"";
					if(!buffer.equals(compareString)) {
						isPrefix = false;
						break;
					}
				} catch (IndexOutOfBoundsException e) {
					return answer;
				}
				
			}
			
			if(isPrefix==false) {
				return answer;
			}
			answer = answer + buffer;
		}
		
		return answer;
	}
}
