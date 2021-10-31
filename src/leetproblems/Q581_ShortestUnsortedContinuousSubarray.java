package leetproblems;

import java.util.Arrays;
import java.util.Stack;

public class Q581_ShortestUnsortedContinuousSubarray {

	public int findUnsortedSubarray(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return 0;

		int l = -1, r = -1;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < n; ++i) {
			while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
				l = stack.pop();
			if (l == -1)
				stack.push(i);
		}
		if (l == -1)
			return 0;

		stack = new Stack<>();
		stack.push(n - 1);
		for (int i = n - 2; i >= 0; --i) {
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
				r = stack.pop();
			if (r == -1)
				stack.push(i);
		}
		if (r == -1)
			return 0;
		return r - l + 1;
	}

	public int findUnsortedSubarray_1(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return 0;
		int[] temp = nums.clone();
		Arrays.sort(temp);
		int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
			if (nums[i] != temp[i]) {
				left = Math.min(left, i);
				right = Math.max(right, i);
			}
		}
		int len = right - left;
		return len >= 0 ? len : 0;
	}
}
