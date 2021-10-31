package leetproblems;

import java.util.Arrays;

public class Q977_SquaresofaSortedArray {
	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; ++i) {
			int x = nums[i];
			nums[i] = x * x;
		}
		Arrays.sort(nums);
		return nums;
	}
}
