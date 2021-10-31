package leetproblems;

public class Q905_SortArrayByParity {
	public int[] sortArrayByParity(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int k = 0;
		for (int i = 0; i < n; ++i) {
			if (nums[i] % 2 == 0)
				result[k++] = nums[i];
		}
		for (int i = 0; i < n; ++i) {
			if (nums[i] % 2 == 1)
				result[k++] = nums[i];
		}
		return result;
	}
}
