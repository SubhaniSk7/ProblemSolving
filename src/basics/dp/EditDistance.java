package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EditDistance {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String x = br.readLine(), y = br.readLine();
		EditDistance obj = new EditDistance();
		System.out.println(obj.minDistance(x, y));
	}

	public int minDistance(String word1, String word2) {
		int m = word1.length(), n = word2.length();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 0; i <= m; ++i) {
			for (int j = 0; j <= n; ++j) {
				if (i == 0)
					dp[i][j] = j;
				else if (j == 0)
					dp[i][j] = i;
				else {
					if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1];
					} else {
						int replace = dp[i - 1][j - 1];
						int insert = dp[i][j - 1];
						int delete = dp[i - 1][j];

						dp[i][j] = 1 + Math.min(replace, Math.min(insert, delete));
					}
				}
			}
		}
		return dp[m][n];
	}
}
