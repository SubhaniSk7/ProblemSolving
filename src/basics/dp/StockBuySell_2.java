package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StockBuySell_2 {// atmost k times
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), i = 0;
		int[] stocks = new int[n];
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			stocks[i++] = Integer.parseInt(st.nextToken());
		solve(n, k, stocks);
		solve_1(n, k, stocks);
	}

	public static void solve(int n, int k, int[] stocks) {
		int[][] dp = new int[k + 1][n];
		for (int i = 1; i <= k; ++i) {
			for (int j = 1; j < n; ++j) {
				int max = 0;
				for (int d = 0; d < j; ++d) {
					max = Math.max(max, stocks[j] - stocks[d] + dp[i - 1][d]);
				}
				dp[i][j] = Math.max(dp[i][j - 1], max);
			}
		}
		print(n, k, dp);
		System.out.println(dp[k][n - 1]);
	}

	public static void solve_1(int n, int k, int[] stocks) {
		int[][] dp = new int[k + 1][n];
		for (int i = 1; i <= k; ++i) {
			int diff = Integer.MIN_VALUE;
			for (int j = 1; j < n; ++j) {
				diff = Math.max(diff, dp[i - 1][j - 1] - stocks[j - 1]);
				dp[i][j] = Math.max(dp[i][j - 1], stocks[j] + diff);
			}
		}
		print(n, k, dp);
	}

	public static void print(int n, int k, int[][] dp) {
		for (int i = 0; i <= k; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}

//6 2
//10 22 5 75 65 80
