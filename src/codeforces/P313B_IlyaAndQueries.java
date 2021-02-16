package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P313B_IlyaAndQueries {
	public static int[][] dp;
	public static int[] res = new int[100000];

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
//		dp = new int[len][len];
//		fill(s, len);
		fill_1(s, len);
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
//			System.out.println(dp[l - 1][r - 1]);
			System.out.println(res[r - 1] - res[l - 1]);
		}
	}

	public static void fill(String s, int len) {
		for (int i = 0; i < len; ++i) {
			for (int j = i + 1; j < len; ++j) {
				if (i < j) {
					if (s.charAt(j) == s.charAt(j - 1))
						dp[i][j] = dp[i][j - 1] + 1;
					else
						dp[i][j] = dp[i][j - 1];
				}
			}
		}
	}

	public static void fill_1(String s, int len) {
		int count = 0;
		for (int i = 1; i < len; ++i) {
			if (s.charAt(i) == s.charAt(i - 1))
				count++;
			res[i] = count;
		}
	}
}
