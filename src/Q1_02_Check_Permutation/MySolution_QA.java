package Q1_02_Check_Permutation;

public class MySolution_QA {
	
	public static String sort(String s) {
		char[] chars = s.toCharArray();
		java.util.Arrays.sort(chars);
		return new String(chars);
	}
	
	public static boolean permutation(String s, String t) {
		if(s.length() != t.length())
			return false;
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			boolean answer = QuestionA.permutation(word1, word2);
			if(anagram != answer) {
				System.out.println(word1 + ", " + word2 + ": " + anagram);
				return;
			}
		}
		System.out.println("Pass.");
	}
}
