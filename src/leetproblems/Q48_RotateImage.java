package leetproblems;

public class Q48_RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length, half = n / 2;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {// transpose
				if (i < j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}

			for (int k = 0; k < half; ++k) {// flip
				int temp = matrix[i][k];
				matrix[i][k] = matrix[i][n - 1 - k];
				matrix[i][n - k - 1] = temp;
			}
		}
	}
}
