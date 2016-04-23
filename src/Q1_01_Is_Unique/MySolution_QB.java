package Q1_01_Is_Unique;

public class MySolution_QB {
	public static boolean isUniqueChars(String word) {
		//assume charset has 256 distinct chars
		if(word.length() > 256)
			return false;
		long[] char_set = new long [4];
		for(int i = 0; i < word.length(); i++) {
			int char_val = word.charAt(i);
			int offset = char_val/64;
			if((char_set[offset] & (1L << char_val%64)) > 0) {
				return false;
			}
			char_set[offset] |= (1L << char_val%64);
		}
		return true;
	}
}
