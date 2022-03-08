package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCS_LongestPalindromicSubsequence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// string x length
		String x = br.readLine();
		lps_0(x, n);
		lps_1(x, n);
	}

	public static void lps_0(String x, int n) {// from LCS
		int m = n;
		String y = new StringBuilder(x).reverse().toString();
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (x.charAt(i - 1) == y.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		print(dp, n, m);
		System.out.println(dp[n][m]);
	}

	public static void lps_1(String x, int n) {// Matrix Chain Multiplication type
		int m = n;
		String y = new StringBuilder(x).toString();
		int[][] dp = new int[n][m];
		for (int i = 0; i < n; ++i)// length 1 = char itself
			dp[i][i] = 1;

		for (int i = 0; i < n; ++i) {
			int k = 0;
			for (int j = i + 1; j < n && k < n - i; ++j) {
				if (x.charAt(k) == y.charAt(j))
					dp[k][j] = 2 + dp[k + 1][j - 1];
				else
					dp[k][j] = Math.max(dp[k][j - 1], dp[k + 1][j]);
				k++;
			}
		}
		print(dp, n - 1, m - 1);
		System.out.println(dp[0][m - 1]);
	}

	public static void print(int[][] dp, int n, int m) {
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
//i/p:
//5
//bbbab
//o/p: 4
