package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubArray {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		MaximumSubArray obj = new MaximumSubArray();

		System.out.println(obj.maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {// with atleast one number
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; ++i) {
			int temp = 0;
			for (int j = i; j < nums.length; ++j) {
				temp += nums[j];
				ans = Math.max(ans, temp);
			}
		}
		return ans;
	}

	public int maxSubArray_1(int[] nums) {// with atleast one number
		int ans = Integer.MIN_VALUE;
		int a = 0;
		for (int x : nums) {
			a += x;
			ans = Math.max(ans, a);
			a = Math.max(a, 0);
		}
		return ans;
	}
}
