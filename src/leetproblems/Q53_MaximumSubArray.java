package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q53_MaximumSubArray {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int n = nums.length, ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			int sum = 0;
			for (int j = i; j < n; ++j) {
				sum += nums[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
}
