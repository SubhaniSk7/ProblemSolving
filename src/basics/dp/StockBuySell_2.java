package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockBuySell_2 {// atmost k times
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), i = 0;
//		int[] stocks = new int[n];
		int[] stocks = new int[] { 19230, 13765, 6863, 3840, 8367, 15603, 16327, 15140, 5582, 12937, 9472, 14190, 9541,
				4126, 2757, 400, 19685, 15908, 4929, 18136, 16050, 6622, 13439, 265, 5846, 3188, 8756, 4960, 18781,
				11139, 5152, 12314 };
		int n = stocks.length, k = 100000089;
//		st = new StringTokenizer(br.readLine());
//
//		while (st.hasMoreTokens())
//			stocks[i++] = Integer.parseInt(st.nextToken());
//		solve(n, k, stocks);
		solve_1(n, k, stocks);
	}

	public static void solve(int n, int k, int[] stocks) {
		int[][] dp = new int[k + 1][n];
		for (int i = 1; i <= k; ++i) {
			for (int j = 1; j < n; ++j) {
				int max = 0;
				for (int d = 0; d < j; ++d)
					max = Math.max(max, stocks[j] - stocks[d] + dp[i - 1][d]);
				dp[i][j] = Math.max(dp[i][j - 1], max);
			}
		}
		print(n, k, dp);
		System.out.println(dp[k][n - 1]);
	}

	public static void solve_1(int n, int k, int[] stocks) {
		k = Math.min(k, n / 2);
		int[][] dp = new int[k + 1][n + 1];
		for (int i = 0; i <= k; ++i) {
			int prevDiff = Integer.MIN_VALUE;
			for (int j = 0; j <= n; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else {
					prevDiff = Math.max(prevDiff, dp[i - 1][j - 1] - stocks[j - 1]);
					dp[i][j] = Math.max(dp[i][j - 1], stocks[j - 1] + prevDiff);
				}
			}
		}
		System.out.println(dp[k][n]);
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
