package leetproblems;

import java.util.HashSet;

public class Q128_LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int result = 0;
		for (int x : nums)
			set.add(x);
		for (int i = 0; i < nums.length; ++i) {
			int cur = nums[i];
			int len = 1;
			if (!set.contains(cur - 1)) {
				while (set.contains(cur + 1)) {
					len += 1;
					cur += 1;
				}
			}
			result = Math.max(result, len);
		}
		return result;
	}
}
