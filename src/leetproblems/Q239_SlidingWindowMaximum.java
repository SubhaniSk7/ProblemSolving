package leetproblems;

import java.util.ArrayDeque;

public class Q239_SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length, l = 0, i = 0;
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		int[] ans = new int[n - k + 1];
		for (int r = 0; r < n; ++r) {
			while (dq.size() > 0 && dq.peekLast() < nums[r])
				dq.pollLast();
			dq.add(nums[r]);
			if (r - l + 1 == k) {
				ans[i++] = dq.peek();
				if (dq.peek() == nums[l])
					dq.pollFirst();
				l++;
			}
		}
		return ans;
	}
}
