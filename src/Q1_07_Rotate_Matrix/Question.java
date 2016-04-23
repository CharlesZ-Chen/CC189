package Q1_07_Rotate_Matrix;

import CtCILibrary.*;

public class Question {

	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
		int n = matrix.length;
		
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return true;
	}
	
	/**
	 * assume passed matrix is square
	 * @param expected
	 * @param result
	 * @return
	 */
	public static boolean assertEqual(int [][] expected, int [][] result) {
		try {
			if(expected.length != result.length) {
				throw new Exception();
			}
			
			int l = expected.length;
			
			for(int i = 0; i < l; i++) {
				for(int j = 0; j < l; j++) {
					if(expected[i][j] != result[i][j]) {
						throw new Exception();
					}
				}
			}
		}
		catch (Exception e) {
			System.out.println("====Failed!====");
			System.out.println("expected:");
			AssortedMethods.printMatrix(expected);
			System.out.println("result:");
			AssortedMethods.printMatrix(result);
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		int[][] testMatrix = AssortedMethods.copySquareIntMatrix(matrix);
		System.out.println("Random Matrix:");
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		MySolution.rotate(testMatrix);
		if(assertEqual(matrix, testMatrix)) {
			System.out.println("====Passed====");
			System.out.println("result:");
			AssortedMethods.printMatrix(matrix);
		}
		
		
	}

}
