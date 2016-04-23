package Q1_07_Rotate_Matrix;

public class MySolution {
	public static boolean rotate(int[][] matrix) {
		if (matrix == null || matrix.length < 1 || matrix.length != matrix[0].length)
			return false;
		//single element matrix does not need to rotate
		if(matrix.length == 1)
			return true;
		
		int l = matrix.length;
	
		//first flip matrix over by cross-axis
		// *
		//   *
		//     *
		for(int i = 0; i < l; i++) {
			for(int j = i + 1; j < l; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		int axis = l/2;
		
		//then flip matrix over again by vertical-axis
		//   *
		//   *
		//   *
		for(int i = 0; i < l; i++) {
			for(int j = 0, k = l - 1; j < axis; j++, k--) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][k];
				matrix[i][k] = temp;
			}
		}
		
		return true;
	}
}
