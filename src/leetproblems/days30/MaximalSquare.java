package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximalSquare {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		char[][] matrix = new char[m][n];
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; ++j)
				matrix[i][j] = ("" + st.nextElement()).charAt(0);
		}
		MaximalSquare obj = new MaximalSquare();
		System.out.println(obj.maximalSquare(matrix));
	}

	public int maximalSquare(char[][] matrix) {
		int ans = 0;
		int H = matrix.length, W = matrix[0].length;
		int[][] dp = new int[H][W];

		for (int r = 0; r < H; ++r) {
			for (int c = 0; c < W; ++c) {
				if (matrix[r][c] == '1') {
					dp[r][c] = 1;
					if (r > 0 && c > 0) {
						dp[r][c] += Math.min(dp[r - 1][c - 1], Math.min(dp[r - 1][c], dp[r][c - 1]));
					}
				}
				ans = Math.max(ans, dp[r][c]);
			}
		}
		return ans * ans;
	}
}
//4 5
//1 0 1 0 0
//1 0 1 1 1
//1 1 1 1 1
//1 0 0 1 0
//o/p : 4
