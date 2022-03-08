package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knapsack_0_1 {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		int capacity = Integer.parseInt(st.nextToken());// sum
		int[] weights = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			weights[i] = Integer.parseInt(st.nextToken());
		int[] profit = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			profit[i] = Integer.parseInt(st.nextToken());
		ks(weights, profit, n, capacity);
//		int best = ks_recursive(weights, values, n, W);
//		System.out.println(best);
	}

	public static void ks(int[] weights, int[] profit, int n, int capacity) {
		int[][] dp = new int[n + 1][capacity + 1];
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= capacity; ++j)
			dp[0][j] = 0;

		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= capacity; ++j) {
				if (weights[i - 1] <= j) {
					int included = profit[i - 1] + dp[i - 1][j - weights[i - 1]];
					int excluded = dp[i - 1][j];
					dp[i][j] = Math.max(included, excluded);
				} else
					dp[i][j] = dp[i - 1][j];
			}
		}
//		print(dp, n + 1, capacity + 1);
		System.out.println(dp[n][capacity]);
	}

//	public static int ks_recursive(int[] weights, int[] values, int n, int W) {
//		if (n == 0 || W == 0)
//			return 0;
//		if (weights[n - 1] <= W) {
//			int included = values[n - 1] + ks_recursive(weights, values, n - 1, W - weights[n - 1]);
//			int excluded = ks_recursive(weights, values, n - 1, W);
//			return Math.max(included, excluded);
//		} else
//			return ks_recursive(weights, values, n - 1, W);
//	}

	public static void print(int[][] dp, int rows, int columns) {
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
//3 50
//10 20 30
//60 100 120