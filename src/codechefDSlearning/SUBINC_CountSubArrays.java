package codechefDSlearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SUBINC_CountSubArrays {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] nums = new int[n];
			for (int i = 0; i < n; ++i)
				nums[i] = Integer.parseInt(st.nextToken());
			solve(n, nums);
		}
	}

//	public static void solve(int n, int[] nums) {
//		int result = nums.length;
//		for (int i = 0; i < n; ++i) {
//			for (int j = i; j < n - 1; ++j) {
//				if (nums[j] <= nums[j + 1]) {
//					result++;
//				} else {
//					break;
//				}
//			}
//		}
//		System.out.println(result);
//	}
	public static void solve(int n, int[] nums) {
		long result = 1;
		long[] dp = new long[n + 1];
		Arrays.fill(dp, 1);
		for (int i = 1; i < n; i++) {
			if (nums[i - 1] <= nums[i])
				dp[i] = 1 + dp[i - 1];
			result += dp[i];
		}
		System.out.println(result);
	}
}
//     l
// 1 4 2 3
//       r
