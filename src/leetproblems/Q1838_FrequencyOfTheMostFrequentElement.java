package leetproblems;

import java.util.Arrays;

public class Q1838_FrequencyOfTheMostFrequentElement {
	public int maxFrequency(int[] nums, int k) {
		Arrays.sort(nums);
		int n = nums.length, l = 0, result = 0;
		long total = 0;
		for (int r = 0; r < n; ++r) {
			total += nums[r];
			while (l < n && nums[r] * (r - l + 1) > total + k) {
				total -= nums[l];
				l++;
			}
			result = Math.max(result, r - l + 1);
		}
		return result;
	}
}
