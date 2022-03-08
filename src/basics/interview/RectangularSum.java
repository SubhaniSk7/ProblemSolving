package basics.interview;

import java.io.IOException;

public class RectangularSum {

	public static void main(String[] subhani) throws IOException {
		System.out.println(solve(0, 0, 0, 0));
	}

	public static int solve(int x1, int y1, int x2, int y2) {

		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 8, 7, 6, 5 }, { 4, 3, 2, 1 } };
		int m = mat.length, n = mat[0].length;
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j)
				dp[i][j] = mat[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
		}
		for (int i = 0; i <= m; ++i) {
			for (int j = 0; j <= n; ++j) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		int r1 = x1 + 1, c1 = y1 + 1;
		int r2 = x2 + 1, c2 = y2 + 1;
		System.out.println(r1 + " " + c1 + " " + r2 + " " + c2);
		int val = dp[r2][c2] - dp[r1 - 1][c2] - dp[r2][c1 - 1] + dp[r1 - 1][c1 - 1];
		return val;
	}
}
