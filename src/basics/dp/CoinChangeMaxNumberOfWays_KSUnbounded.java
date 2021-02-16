package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinChangeMaxNumberOfWays_KSUnbounded {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int S = Integer.parseInt(st.nextToken());// totalSum
		int[] coins = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			coins[i] = Integer.parseInt(st.nextToken());
		maxWays(n, S, coins);
	}

	public static void maxWays(int n, int S, int[] coins) {
		int[][] dp = new int[n + 1][S + 1];
		for (int j = 0; j <= S; ++j)
			dp[0][j] = 0;
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 1;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= S; ++j) {
				int excluded = dp[i - 1][j];
				if (coins[i - 1] <= j) {
					int included = dp[i][j - coins[i - 1]];
					dp[i][j] = included + excluded;
				} else
					dp[i][j] = excluded;
			}
		}
		print(dp, n, S);
		System.out.println(dp[n][S]);
	}

	public static void print(int[][] dp, int n, int S) {
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= S; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
//i/p:
//3 5 
//1 2 3
//o/p: 5