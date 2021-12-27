package leetproblems;

public class Q41_FirstMissingPositive {
//	public int firstMissingPositive(int[] nums) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int x : nums) {
//			if (x > 0)
//				map.put(x, 1);
//		}
//		for (int i = 1; i <= Integer.MAX_VALUE; ++i) {
//			if (map.getOrDefault(i, 0) == 0)
//				return i;
//		}
//		return 0;
//	}

	public int firstMissingPositive(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; ++i) {
			if (nums[i] <= 0 || nums[i] > n)
				nums[i] = n + 1;
		}
		for (int i = 0; i < n; ++i) {
			int x = Math.abs(nums[i]);
			if (x > n)
				continue;
			x--;
			if (nums[x] > 0)
				nums[x] = -1 * nums[x];
		}
		for (int i = 0; i < n; ++i) {
			if (nums[i] >= 0)
				return i + 1;
		}
		return n + 1;
	}
}
