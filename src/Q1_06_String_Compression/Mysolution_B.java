package Q1_06_String_Compression;

public class Mysolution_B {
	public static String compress(String s) {
	
		if(s.length() < 3)
			return s;
	
		int finalLength = checkFinalLength(s);
		if(finalLength >= s.length())
			return s;
		
		StringBuilder sb = new StringBuilder(finalLength);
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			count++;
			
			if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				sb.append(s.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		
		return sb.toString();
	}
	
	public static int checkFinalLength(String s) {
		int finalLength = 0;
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			count++;
			
			if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				finalLength += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		
		return finalLength;
	}
}
