package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCS_MinNumberOfInsertionDeletionToXtoY {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// string x length
		int m = Integer.parseInt(st.nextToken());// string y length
		String x = br.readLine(), y = br.readLine();
		numberOfInsertionsDeletions(x, y, n, m);
	}

	public static void numberOfInsertionsDeletions(String x, String y, int n, int m) {
		int l = lcs(x, y, n, m);
		System.out.println("Min Deletions:" + (n - l) + " Min Insertions:" + (m - l));
	}

	public static int lcs(String x, String y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= m; ++j)
			dp[0][j] = 0;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (x.charAt(i - 1) == y.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		print(dp, n, m);
//		System.out.println(dp[n][m]);
		return dp[n][m];
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
//13 5
//geeksforgeeks
//geeks
//o/p: min Deletions=8, min Insertions = 0