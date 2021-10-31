package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS_LongestRepeatingSubsequence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String x = br.readLine();
		String x = "AABEBCDD";
		lrs(x, x.length());
	}

	public static void lrs(String x, int n) {
		String y = x;
		int m = n;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (x.charAt(i - 1) == y.charAt(j - 1) && i != j) // changed to i!=j
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		print(x, dp, n, m);
		System.out.println(dp[n][m]);
	}

	public static void print(String x, int[][] dp, int n, int m) {
		for (int i = 0; i <= n; ++i) {
			if (i != 0)
				System.out.print(x.charAt(i - 1) + " ");
			else
				System.out.print("    ");
		}
		System.out.println();
		for (int i = 0; i <= n; ++i) {
			if (i != 0)
				System.out.print(x.charAt(i - 1) + " ");
			else
				System.out.print("  ");
			for (int j = 0; j <= m; ++j) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//i/p: 
//8
//AABEBCDD
//o/p: 3 --> ABD is lcs and there is another ABD as lcs
