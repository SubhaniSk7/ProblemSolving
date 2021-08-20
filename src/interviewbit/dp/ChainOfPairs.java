package interviewbit.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChainOfPairs {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(Integer.parseInt(st.nextToken()));
			al.add(Integer.parseInt(st.nextToken()));
			pairs.add(al);
		}
		System.out.println(solve(pairs));
	}

	public static int solve(ArrayList<ArrayList<Integer>> A) {
		int n = A.size(), max = 1;
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		for (int i = 1; i < n; ++i) {
			int c = A.get(i).get(0), d = A.get(i).get(1);
			for (int j = 0; j < i; ++j) {
				int a = A.get(j).get(0), b = A.get(j).get(1);
				if (b < c && 1 + dp[j] > dp[i])
					dp[i] = 1 + dp[j];
			}
			max = Integer.max(max, dp[i]);
		}
		return max;
	}
}
// i/p:
//5
//5 24
//39 60
//15 28
//27 40
//50 90
//o/p : 3
