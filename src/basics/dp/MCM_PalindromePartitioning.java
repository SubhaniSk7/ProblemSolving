package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MCM_PalindromePartitioning {
	public static int[][] partitions;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = s.length();
		int parts = pp_recursive(s, 0, n - 1);
		System.out.println(parts);

		partitions = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				partitions[i][j] = -1;
		}
		pp_bup(s, 0, n - 1);
//		print(partitions, n);
		System.out.println(partitions[0][n - 1]);

		pp_tdp(s, n);
	}

	public static int pp_recursive(String s, int i, int j) {
		if (i >= j)
			return 0;
		if (isPalindrome(s, i, j))
			return 0;

		int partitions = Integer.MAX_VALUE;
		for (int k = i; k < j; ++k) {
			int count = 1 + pp_recursive(s, i, k) + pp_recursive(s, k + 1, j);
			partitions = Math.min(partitions, count);
		}
		return partitions;
	}

	public static int pp_bup(String s, int i, int j) {
		if (i >= j)
			return 0;
		if (isPalindrome(s, i, j))
			return 0;
		if (partitions[i][j] != -1)
			return partitions[i][j];
		int parts = Integer.MAX_VALUE;
		for (int k = i; k < j; ++k) {
			int count = 1 + pp_bup(s, i, k) + pp_bup(s, k + 1, j);
			parts = Math.min(parts, count);
		}

		partitions[i][j] = parts;
		return partitions[i][j];
	}

	public static void pp_tdp(String s, int n) {
		int[][] dp = new int[n][n];
		boolean[][] palindrome = new boolean[n][n];
		for (int i = 0; i < n; ++i) {
			dp[i][i] = 0;
			palindrome[i][i] = true;
		}

		for (int len = 2; len <= n; ++len) {
			for (int i = 0; i < n - len + 1; ++i) {
				int j = i + len - 1;
				if (len == 2)
					palindrome[i][j] = (s.charAt(i) == s.charAt(j));
				else
					palindrome[i][j] = (s.charAt(i) == s.charAt(j)) && palindrome[i + 1][j - 1];

				if (palindrome[i][j] == true)
					dp[i][j] = 0;
				else {
					dp[i][j] = Integer.MAX_VALUE;
					for (int k = i; k < j; ++k)
						dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k + 1][j]);
				}
			}
		}
		print(dp, n);
		System.out.println(dp[0][n - 1]);
	}

	public static boolean isPalindrome(String s, int i, int j) {
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void print(int[][] dp, int n) {
		System.out.println();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
