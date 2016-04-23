package Q1_02_Check_Permutation;

public class MySolution_QB {
	
	public static boolean permutation(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		//assumption on charset size
		int[] letters = new int [256];
		
		for(int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			letters[c]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			int c = t.charAt(i);
			letters[c]--;
			if(letters[c] < 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
//		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
//		for (String[] pair : pairs) {
//			String word1 = pair[0];
//			String word2 = pair[1];
//			boolean anagram = permutation(word1, word2);
//			boolean answer = QuestionA.permutation(word1, word2);
//			if(anagram != answer) {
//				System.out.println(word1 + ", " + word2 + ": " + anagram);
//				return;
//			}
//		}
//		System.out.println("Pass.");
		
		System.out.println(Math.pow(2, 26));
	}
}
