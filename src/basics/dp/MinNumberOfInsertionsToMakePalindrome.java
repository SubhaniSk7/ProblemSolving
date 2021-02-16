package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// here to find the answer : simply find longest palindromic subsequence length. from that we can delete elements from x to make it palindrome.
//so same way we can insert same number of elements to make it palindrome.
public class MinNumberOfInsertionsToMakePalindrome {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// string x length
		String x = br.readLine();
		longestPalindromicSubsequence(x, n);
	}

	public static void longestPalindromicSubsequence(String x, int n) {
		String y = new StringBuilder(x).reverse().toString();
		int m = n;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (x.charAt(i - 1) == y.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		print(dp, n, m);
		int insertions = n - dp[n][m];
		System.out.println(insertions);
	}

	public static void print(int[][] dp, int n, int m) {
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
// i/p:
//7
//aebcbda
//o/p: 2
