package interviewbit.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class RodCuttingPrint {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());// Rod Length
		ArrayList<Integer> lengths = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			lengths.add(Integer.parseInt(st.nextToken()));
		rodCut(R, lengths); // return min cost, lengths = prices
	}

	public static ArrayList<Integer> rodCut(int A, ArrayList<Integer> B) {
		ArrayList<Integer> result = new ArrayList<>();
		int n = B.size();
		int[][] dp = new int[n + 1][A + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= A; ++j) {
				System.out.println(i + " " + j);
				if (i == 0)
					dp[i][j] = A - j;
				else if (j == 0)
					dp[i][j] = A;
				else {
					int excluded = dp[i - 1][j];
					if (B.get(i - 1) <= j) {
						int included = j + dp[i - 1][j - B.get(i - 1)];
						dp[i][A - j] = Math.min(included, excluded);
					} else
						dp[i][A - j] = excluded;
				}
			}
			print(dp, n, A);
		}
//		print(dp, n, A);
		return result;
	}

	public static void print(int[][] dp, int n, int m) {
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= m; ++j) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
}
