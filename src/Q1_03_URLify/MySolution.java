package Q1_03_URLify;

import CtCILibrary.AssortedMethods;

public class MySolution {

	/**
	 * This implementation is worser that CtCI solution reason: if replace
	 * symbol changed, e.g %20 -> %%20, this should change two places: 1. step
	 * 2. replace symbol assignment in line36-40
	 * 
	 * @param arr
	 * @param tL
	 *            trueLength
	 */
	public static void replaceSpaces(char[] arr, int tL) {
		int s_count = 0, // count of space that need to be convert
		step = 2; // step = length("%20") - length(' ')

		/*
		 * first count all spaces need to be convert assumption: convert space:
		 * all space which index < tL - 1
		 */
		for (int i = 0; i < tL; i++) {
			if (arr[i] == ' ') {
				s_count++;
			}
		}

		/* My origin solution */
		 for(int i = tL - 1; i > -1; i--) {
		 if(arr[i] != ' ') {
		 arr[i + step * s_count] = arr[i];
		 } else {
		 int j = i + step * s_count;
		 arr[j] = '0';
		 arr[j-1] = '2';
		 arr[j-2] = '%';
		 s_count --;
		 }
		 }

		/* modify based on CtCI */
//		int index = tL + s_count * 2 - 1;
//		/* set array end first */
//		if (index + 1 < arr.length) {
//			arr[index + 1] = '\0'; // End array
//		}
//
//		for (int i = tL - 1; i > -1; i--) {
//			if (arr[i] != ' ') {
//				arr[index--] = arr[i];
//			} else {
//				arr[index--] = '0';
//				arr[index--] = '2';
//				arr[index--] = '%';
//			}
//		}
	}

	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "  Mr John Smith            ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		replaceSpaces(arr, trueLength);
		System.out
				.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
}
