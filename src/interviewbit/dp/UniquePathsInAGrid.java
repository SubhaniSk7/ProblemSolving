package interviewbit.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UniquePathsInAGrid {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] A = new int[n][m];
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; ++j)
				A[i][j] = Integer.parseInt(st.nextToken());
		}
		System.out.println(uniquePathsWithObstacles(A));
	}

	public static int uniquePathsWithObstacles(int[][] A) {
		int n = A.length, m = A[0].length;
		int[][] dp = new int[n][m];
		dp[0][0] = (A[0][0] == 1) ? 0 : 1;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (i == 0 && j == 0)
					continue;
				if (A[i][j] != 1) {
					if (i == 0)
						dp[i][j] = dp[i][j - 1];
					else if (j == 0)
						dp[i][j] = dp[i - 1][j];
					else
						dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				} else
					dp[i][j] = 0;
			}
		}
		return dp[n - 1][m - 1];
	}
}
