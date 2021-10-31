package leetproblems;

import java.util.Arrays;

public class Q1968_ArrayWithElementsNotEqualToAverageOfNeighbors {
	public int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		for (int i = 1; i < n; i = i + 2) {// zig-zag wave form
			if (i + 1 < n) {
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}
		return nums;
	}
}
