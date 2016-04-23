package Q1_01_Is_Unique;

import java.util.HashSet;
public class MySolution_QA {
	public static boolean isUniqueChars(String word) {
		HashSet<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if(! charSet.contains(c))
				charSet.add(c);
			else
				return false;
		}
		return true;
	}
}
