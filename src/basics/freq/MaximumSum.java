package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSum {
	// Complete the maxSubsetSum function below.
	static int maxSubsetSum(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return 0;
		int[] dp = new int[n];
		dp[0] = Math.max(0, arr[0]);
		if (n == 1)
			return dp[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < n; ++i) {
			dp[i] = Math.max(dp[i - 1], Math.max(arr[i] + dp[i - 2], arr[i]));
		}
		return dp[n - 1];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(st.nextToken());
			arr[i] = arrItem;
		}

		int res = maxSubsetSum(arr);
		System.out.println(res);
	}
}
