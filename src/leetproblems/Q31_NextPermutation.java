package leetproblems;

import java.util.Arrays;

public class Q31_NextPermutation {

	public void nextPermutation(int[] nums) {
		next(nums);
	}

	public void next(int[] nums) {
		int n = nums.length, index = n, minIndex = n - 1;
		for (int i = n - 1; i > 0; --i) {
			if (nums[i] > nums[i - 1]) {
				index = i - 1;
				break;
			}
		}
		if (index == n) {
			Arrays.sort(nums);
			return;
		}
		int x = nums[index];
		minIndex = index + 1;
		for (int i = index + 1; i < n; ++i) {
			if (nums[i] > x && nums[minIndex] > nums[i])
				minIndex = i;
		}
		int temp = nums[index];
		nums[index] = nums[minIndex];
		nums[minIndex] = temp;
		Arrays.sort(nums, index + 1, n);
	}
}