package leetproblems;

public class Q59_SpiralMatrixII {
	public int[][] generateMatrix(int n) {
		int top = 0, bottom = n - 1, left = 0, right = n - 1;
		int[][] matrix = new int[n][n];
		int dir = 0, cell = 1;
		while (top <= bottom && left <= right) {

			if (dir == 0) {
				for (int i = left; i <= right; ++i)
					matrix[top][i] = cell++;
				top++;
				dir = 1;
			} else if (dir == 1) {
				for (int i = top; i <= bottom; ++i)
					matrix[i][right] = cell++;
				right--;
				dir = 2;
			} else if (dir == 2) {
				for (int i = right; i >= left; --i)
					matrix[bottom][i] = cell++;
				bottom--;
				dir = 3;
			} else if (dir == 3) {
				for (int i = bottom; i >= top; --i)
					matrix[i][left] = cell++;
				left++;
				dir = 0;
			}
		}
		return matrix;
	}
}
