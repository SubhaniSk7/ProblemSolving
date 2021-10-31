package leetproblems;

public class Q268_MissingNumber {
	public int missingNumber(int[] nums) {
		int sum = 0, total = nums.length * (nums.length + 1) / 2;
		for (int x : nums)
			sum += x;
		int val = total - sum;
		return val;
	}
}
