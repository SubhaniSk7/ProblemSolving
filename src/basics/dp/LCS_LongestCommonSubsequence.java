package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class LCS_LongestCommonSubsequence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// string x length
		int m = Integer.parseInt(st.nextToken());// string y length
		String x = br.readLine(), y = br.readLine();
		lcs(x, y, n, m);
	}

	public static void lcs(String x, String y, int n, int m) {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; ++i)
			dp[i][0] = 0;
		for (int j = 0; j <= m; ++j)
			dp[0][j] = 0;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (x.charAt(i - 1) == y.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		print(dp, n, m);
		System.out.println(dp[n][m]);
		printSequences(x, y, n, m, dp);
		System.out.println("-------------------------");
		Set<String> res = printAllSequences(x, y, n, m, dp);
		System.out.println("\n" + res.toString());
	}

	public static Set<String> printAllSequences(String x, String y, int n, int m, int[][] dp) {
		Set<String> seq = new HashSet<>();
		if (m == 0 || n == 0) {
			seq.add("");
			return seq;
		}
		if (x.charAt(n - 1) == y.charAt(m - 1)) {
			Set<String> s = printAllSequences(x, y, n - 1, m - 1, dp);
			for (String str : s)
				seq.add(str + x.charAt(n - 1));
		} else {
			if (dp[n - 1][m] >= dp[n][m - 1])
				seq = printAllSequences(x, y, n - 1, m, dp);
			if (dp[n - 1][m] <= dp[n][m - 1]) {
				Set<String> s = printAllSequences(x, y, n, m - 1, dp);
				seq.addAll(s);
			}
		}
		return seq;
	}

	public static void printSequences(String x, String y, int n, int m, int[][] dp) {
		int i = n, j = m;
		StringBuilder s = new StringBuilder("");
		while (i > 0 && j > 0) {
			if (x.charAt(i - 1) == y.charAt(j - 1)) {
				s.append("" + x.charAt(i - 1));
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1])
				i--;
			else
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
//i/p:
//6 6
//ABCDGH
//AEDFHR
//o/p: 3 ADH

// i/p:
//7 5
//AGTGATG
//GTTAG
//o/p: GTAG, GTTG
