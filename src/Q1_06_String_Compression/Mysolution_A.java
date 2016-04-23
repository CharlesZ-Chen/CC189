package Q1_06_String_Compression;

public class Mysolution_A {
	public static String compress(String s) {
		if(s == null || s.length() < 3)
			return s;
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char c = s.charAt(0);
		
		for(int i = 1; i < s.length(); i++) {
			if(c == s.charAt(i)) {
				count++;
			} else {
				//flush to sb
				sb.append(c);
				sb.append(count);
				c = s.charAt(i);
				count = 1;
			}
		}
		
		//flush last c and its count to sb
		sb.append(c);
		sb.append(count);
		
		return sb.length() < s.length() ? sb.toString() : s;
	}
}
