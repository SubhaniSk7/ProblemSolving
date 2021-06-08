package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS_LongestPalindromicSubstring {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(lps_0(s));
		System.out.println(lps_1(s));
	}

	public static String lps_0(String s) {// bruteforce
		int n = s.length(), maxLength = 0;
		String result = "";
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				int len = j - i + 1;
				String sub = s.substring(i, i + len);
				if (len > maxLength && isPalindrome(sub)) {
					maxLength = len;
					result = sub;
				}
			}
		}
		return result;
	}

	public static String lps_1(String s) {
		int n = s.length();
		String ans = "";
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; ++i)
			dp[i][i] = 1;
		int maxLength = 1, start = 0;
		for (int len = 2; len <= n; len++) {
			for (int i = 0; i < n - len + 1; ++i) {
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j)) {
					if (len == 2 || dp[i + 1][j - 1] != 0)
						dp[i][j] = len;
					if (maxLength < dp[i][j]) {
						start = i;
						maxLength = dp[i][j];
					}
				}
			}
		}
		ans = s.substring(start, start + maxLength);
//		print(s, dp, n, n);
		return ans;
	}

	public static void print(String s, int[][] dp, int n, int m) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}

	public static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < s.length() / 2; ++i)
			if (s.charAt(i) != s.charAt(n - i - 1))
				return false;
		return true;
	}
}
