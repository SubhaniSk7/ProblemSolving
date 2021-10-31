package leetproblems;

public class Q1886_DetermineWhetherMatrixCanBeObtainedByRotation {
	public boolean findRotation(int[][] mat, int[][] target) {
		int n1 = mat.length;
		int n2 = target.length;
		if (n1 != n2)
			return false;
		for (int t = 0; t < 4; ++t) {
			rotate(mat);// transpose and shift
			if (check(mat, target))
				return true;
		}
		return false;
	}

	public boolean check(int[][] mat, int[][] target) {
		int n1 = mat.length;
		for (int i = 0; i < n1; ++i) {
			for (int j = 0; j < n1; ++j)
				if (mat[i][j] != target[i][j])
					return false;
		}
		return true;
	}

	public void rotate(int[][] mat) {
		int n1 = mat.length, half = n1 / 2;
		for (int i = 0; i < n1; ++i) {
			for (int j = 0; j < n1; ++j) {
				if (i < j) {
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}
			}
			for (int k = 0; k < half; ++k) {
				int temp = mat[i][k];
				mat[i][k] = mat[i][n1 - 1 - k];
				mat[i][n1 - k - 1] = temp;
			}
		}
	}
}
