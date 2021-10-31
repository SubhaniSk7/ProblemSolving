package leetproblems;

import java.util.Stack;

public class Q84_LargestRectangleInHistogram {
	public int largestRectangleArea(int[] heights) {
		int n = heights.length;
		Stack<Integer> stack = new Stack<>();
		int[] leftSmall = new int[n];
		int[] rightSmall = new int[n];
		for (int i = 0; i < n; ++i) {
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
				stack.pop();
			if (!stack.isEmpty())
				leftSmall[i] = stack.peek();
			else
				leftSmall[i] = -1;
			stack.push(i);
		}
		stack.clear();
		for (int i = n - 1; i >= 0; --i) {
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
				stack.pop();
			if (!stack.isEmpty())
				rightSmall[i] = stack.peek();
			else
				rightSmall[i] = n;
			stack.push(i);
		}
		int area = 0;
		for (int i = 0; i < n; ++i) {
			int width = rightSmall[i] - leftSmall[i] - 1;
			area = Math.max(area, heights[i] * width);
		}
		return area;
	}
}
