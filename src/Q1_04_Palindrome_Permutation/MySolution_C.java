package Q1_04_Palindrome_Permutation;

public class MySolution_C {
	public static boolean isPermutationOfPalindrome(String s) {
		int char_set = 0;
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			int c = Character.getNumericValue(arr[i]);
			if(c < a || c > z) {
				continue;
			}
			char_set ^= (1 << (c - a));
		}
		
		return (char_set & (char_set - 1)) == 0;
	}
	
}
