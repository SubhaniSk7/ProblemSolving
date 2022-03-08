package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MCM_MatrixChainMultiplication {
	public static int[][] operations;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] matrices = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			matrices[i] = Integer.parseInt(st.nextToken());

//		int cost = mcm_recursive(matrices, 1, n - 1);
//		System.out.println(cost);

//		operations = new int[n][n];
//		for (int i = 0; i < n; ++i)
//			for (int j = 0; j < n; ++j)
//				operations[i][j] = -1;
//		int res = mcm_bup(matrices, 1, n - 1);
//		print(operations, n);
//		System.out.println(res);

		mcm_tdp(matrices, n);
	}

	public static int mcm_recursive(int[] matrices, int i, int j) {
		if (i >= j)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; ++k) {
			int operations = mcm_recursive(matrices, i, k) + mcm_recursive(matrices, k + 1, j) + matrices[i - 1] * matrices[k] * matrices[j];
			min = Math.min(min, operations);
		}
		return min;
	}

	public static int mcm_bup(int[] matrices, int i, int j) {
		if (i >= j)
			return 0;
		if (operations[i][j] != -1)
			return operations[i][j];
		operations[i][j] = Integer.MAX_VALUE;
		for (int k = i; k < j; ++k) {
			operations[i][j] = Math.min(operations[i][j],
					mcm_bup(matrices, i, k) + mcm_bup(matrices, k + 1, j) + matrices[i - 1] * matrices[k] * matrices[j]);
			System.out.println(i + " " + k + " " + j + " " + operations[i][j]);
		}
		return operations[i][j];
	}

	public static void mcm_tdp(int[] matrices, int n) {
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; ++i)
			dp[i][i] = 0;

		for (int len = 2; len < n; len++) {// all lengths
			for (int i = 1; i < n - len + 1; ++i) {// 'len' length segments
				int j = i + len - 1;
				if (j == n)
					continue;
				dp[i][j] = Integer.MAX_VALUE;
				for (int k = i; k < j; ++k) {
//					System.out.println(len + " " + i + " " + j + " " + k);
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + matrices[i - 1] * matrices[k] * matrices[j]);
				}
			}
		}
		print(dp, n);
		System.out.println(dp[1][n - 1]);
	}

	public static void print(int[][] dp, int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
//i/p:
//5
//40 20 30 10 30
//o/p:26000

//i/p:
//5
//10 20 30 40 30
//o/p:30000

//i/p:
//3
//10 20 30
//o/p:6000