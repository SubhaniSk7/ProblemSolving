package leetproblems;

import java.util.Arrays;

public class Q16_Three3SumClosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length, result = nums[0] + nums[1] + nums[n - 1];
		for (int i = 0; i < n - 1; ++i) {
			int l = i + 1, r = n - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum < target)
					l++;
				else
					r--;
				if (Math.abs(target - sum) < Math.abs(target - result))
					result = sum;
			}
		}
		return result;
	}
}
