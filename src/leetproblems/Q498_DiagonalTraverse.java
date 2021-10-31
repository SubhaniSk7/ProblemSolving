package leetproblems;

public class Q498_DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length, n = mat[0].length, r = 0, c = 0;
		int[] result = new int[m * n];
		for (int i = 0; i < m * n; ++i) {
			result[i] = mat[r][c];
			if ((r + c) % 2 == 0) {// Up
				if (c == n - 1) {
					r++;
				} else if (r == 0) {
					c++;
				} else {
					r--;
					c++;
				}
			} else {// Down
				if (r == m - 1) {
					c++;
				} else if (c == 0) {
					r++;
				} else {
					c--;
					r++;
				}
			}
		}
		return result;
	}
}
