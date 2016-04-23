package Q1_04_Palindrome_Permutation;

public class MySolution_A {
	public static boolean isPermutationOfPalindrome(String s) {
		//assume 26 letters, case insensitive
		int[] char_set = new int [26];
		
//		char[] arr = s.toLowerCase().toCharArray();
		char[] arr = s.toCharArray();
		
		//case insensitive
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		for(int i = 0; i < arr.length; i++) {
			//will ignore all non-letter char
			int c = Character.getNumericValue(arr[i]);
			if( c < a || c > z) {
				continue;
			}
			c = c - a;
			char_set[c]++;
		}
		
		boolean has_odd = false;
		for(int count : char_set) {
			if(count%2 == 0) {
				continue;
			} else {
				if(has_odd) {
					return false;
				} else {
					has_odd = true;
				}
			}
		}
	
		return true;
	}
}