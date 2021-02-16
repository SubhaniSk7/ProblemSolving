package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// here for sum=5 --> 1+1+3 and 1+3+1 are same i.e,. order doesn't matter.
// in Staircase problem order matter
public class CoinChangeMinNumberOfCoins_KSUnbounded {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int S = Integer.parseInt(st.nextToken());// totalSum
		int[] coins = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			coins[i] = Integer.parseInt(st.nextToken());
		minCoins(n, S, coins);
	}

	public static void minCoins(int n, int S, int[] coins) {
		int[][] dp = new int[n + 1][S + 1];
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= S; ++j)
			dp[0][j] = Integer.MAX_VALUE - 1;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= S; ++j) {
				int excluded = dp[i - 1][j];
				if (coins[i - 1] <= j) {
					int included = 1 + dp[i][j - coins[i - 1]];
					dp[i][j] = Math.min(included, excluded);
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
//o/p: 2 --> coins {2,3}=5
