package leetproblems;

public class Q713_SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int n = nums.length, l = 0, ans = 0;
		long product = 1;
		for (int r = 0; r < n; ++r) {
			product *= nums[r];
			while (l < n && product >= k) {
				product /= nums[l];
				l++;
			}
			if (product < k)
				ans += (r - l + 1);
		}
		return ans;
	}
}
