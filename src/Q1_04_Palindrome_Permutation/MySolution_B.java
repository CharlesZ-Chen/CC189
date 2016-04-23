package Q1_04_Palindrome_Permutation;

public class MySolution_B {
	public static boolean isPermutationOfPalindrome(String s) {
		//assume 26 letters, case insensitive
		int[] char_set = new int [26];
		
		char[] arr = s.toCharArray();
		
		//case insensitive
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		//using one odd_count to save the second scan
		int odd_count = 0;
		for(int i = 0; i < arr.length; i++) {
			//will ignore all non-letter char
			int c = Character.getNumericValue(arr[i]);
			if( c < a || c > z) {
				continue;
			}
			c = c - a;
			
			char_set[c]++;
			if(char_set[c] % 2 == 1) {
				odd_count++;
			} else {
				odd_count--;
			}
		}

		return odd_count <= 1;
	}
}