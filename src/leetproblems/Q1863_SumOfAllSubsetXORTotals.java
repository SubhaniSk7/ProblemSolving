package leetproblems;

public class Q1863_SumOfAllSubsetXORTotals {
	int result = 0;

	public int subsetXORSum(int[] nums) {
		rec(nums, 0, 0);
		return result;
	}

	public void rec(int[] nums, int index, int xor) {
		if (index == nums.length) {
			result += xor;
			return;
		}
		int x1 = xor ^ nums[index];
		int x2 = xor;
		rec(nums, index + 1, x1);
		rec(nums, index + 1, x2);
	}
}
