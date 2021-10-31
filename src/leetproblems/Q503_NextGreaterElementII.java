package leetproblems;

import java.util.Stack;

public class Q503_NextGreaterElementII {
	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int n = nums.length;
		for (int i = n - 1; i >= 0; --i)
			stack.push(nums[i]);

		int[] result = new int[n];
		for (int i = n - 1; i >= 0; --i) {

			while (!stack.isEmpty() && stack.peek() <= nums[i])
				stack.pop();

			if (stack.isEmpty())
				result[i] = -1;
			else
				result[i] = stack.peek();
			stack.push(nums[i]);
		}
		return result;
	}
}
