package leetproblems;

public class Q775_GlobalAndLocalInversions {
	public boolean isIdealPermutation(int[] nums) {
		int n = nums.length, max = -1;
		for (int i = 0; i < n - 2; ++i) {
			max = Math.max(max, nums[i]);
			if (max > nums[i + 2])
				return false;
		}
		return true;
	}
}
