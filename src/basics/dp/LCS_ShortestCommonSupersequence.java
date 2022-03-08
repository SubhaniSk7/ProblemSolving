package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//merging two string x,y and should have both strings as in that output string
public class LCS_ShortestCommonSupersequence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// string x length
		int m = Integer.parseInt(st.nextToken());// string y length
		String x = br.readLine(), y = br.readLine();
		scss(x, y, n, m);
		scss_1(x, y, n, m);
	}

	public static void scss(String x, String y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (x.charAt(i - 1) == y.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int lcs = dp[n][m];
		print(dp, n, m);
		System.out.println(n + m - lcs);
		printSCSS(x, y, dp, n, m);
	}

	public static void scss_1(String x, String y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j) {
				if (i == 0)
					dp[i][j] = j;
				else if (j == 0)
					dp[i][j] = i;
				else if (x.charAt(i - 1) == y.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		print(dp, n, m);
		System.out.println(dp[n][m]);
		printSCSfromSCSS_1(x, y, dp, n, m);
	}

	public static void printSCSS(String x, String y, int[][] dp, int n, int m) {
		int i = n, j = m;
		StringBuilder s = new StringBuilder();
		while (i > 0 && j > 0) {
			if (x.charAt(i - 1) == y.charAt(j - 1)) {
				s.append(x.charAt(i - 1));
				i--;
				j--;
			} else {
				if (dp[i - 1][j] < dp[i][j - 1]) {
					s.append(y.charAt(j - 1));
					j--;
				} else {
					s.append(x.charAt(i - 1));
					i--;
				}
			}
		}
		while (i > 0) {
			s.append(x.charAt(i - 1));
			i--;
		}
		while (j > 0) {
			s.append(y.charAt(j - 1));
			j--;
		}
		System.out.println(s.reverse().toString());
	}

	public static void printSCSfromSCSS_1(String x, String y, int[][] dp, int n, int m) {
		int i = n, j = m;
		StringBuilder s = new StringBuilder();
		while (i > 0 && j > 0) {
			if (x.charAt(i - 1) == y.charAt(j - 1)) {
				s.append(x.charAt(i - 1));
				i--;
				j--;
			} else {
				if (dp[i - 1][j] < dp[i][j - 1]) {
					s.append(x.charAt(i - 1));
					i--;
				} else {
					s.append(y.charAt(j - 1));
					j--;
				}
			}
		}
		while (i > 0) {
			s.append(x.charAt(i - 1));
			i--;
		}
		while (j > 0) {
			s.append(y.charAt(j - 1));
			j--;
		}
		System.out.println(s.reverse().toString());
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
//6 7
//AGGTAB
//GXTXAYB
//o/p: 9