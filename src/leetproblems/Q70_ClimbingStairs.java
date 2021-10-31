package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q70_ClimbingStairs {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Q70_ClimbingStairs obj = new Q70_ClimbingStairs();
		System.out.println(obj.climbStairs(n));
	}

	public int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 3; i <= n; ++i)
			dp[i] = dp[i - 1] + dp[i - 2];
		return dp[n];
	}
}
