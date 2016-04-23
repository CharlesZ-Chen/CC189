package Q1_08_Zero_Matrix;

public class Mysolution_A {
	public static void setZeros(int[][] matrix) {
		if(matrix == null || matrix.length < 1)
			return;
		final int M = matrix.length;
		final int N = matrix[0].length;
		boolean zeroFirstRow = false;
		boolean zeroFirstCol = false;

		for(int j = 0; j < N; j++) {
			if(matrix[0][j] == 0) {
				zeroFirstRow = true;
				break;
			}
		}

		for(int i = 0; i < M; i++) {
			if(matrix[i][0] == 0) {
				zeroFirstCol = true;
				break;
			}
		}

		for(int i = 1; i < M; i++) {
			for(int j = 1; j < N; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		for(int i = 1; i < M; i++) {
			if(matrix[i][0] == 0) {
				zeroRow(matrix, i);
			}
		}

		for(int j = 1; j < N; j++) {
			if(matrix[0][j] == 0) {
				zeroCol(matrix, j);
			}
		}

		if(zeroFirstRow) {
			zeroRow(matrix, 0);
		}

		if(zeroFirstCol) {
			zeroCol(matrix, 0);
		}
	}
	
	public static void zeroRow(int[][] matrix, int row) {
		for(int j = 0; j < matrix[row].length; j++) {
			matrix[row][j] = 0;
		}
	}
	
	public static void zeroCol(int[][] matrix, int col) {
		for(int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
}
