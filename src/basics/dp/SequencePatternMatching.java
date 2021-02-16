package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// is x is a subsequence of y --> true/false
public class SequencePatternMatching {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// string x length
		int m = Integer.parseInt(st.nextToken());// string y length
		String x = br.readLine(), y = br.readLine();
		lcs(x, y, n, m);
	}

	public static void lcs(String x, String y, int n, int m) {
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
		System.out.println(dp[n][m]);
		if (dp[n][m] == n)
			System.out.println("True");
		else
			System.out.println("False");
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
//3 6
//AXY
//ADXCPY
//o/p: true --> here AXY is a subsequence in ADXCPY i.e. complete 'x' is a subsequence of 'y'
