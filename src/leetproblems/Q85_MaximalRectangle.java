package leetproblems;

import java.util.Stack;

public class Q85_MaximalRectangle {

	int maxArea = 0;

	public int maximalRectangle(char[][] matrix) {
		int m = matrix.length;
		if (m == 0)
			return maxArea;
		int n = matrix[0].length;
		int[] histogram = new int[n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (matrix[i][j] == '0')
					histogram[j] = 0;
				else
					histogram[j] += (matrix[i][j] - '0');
				// System.out.print(histogram[j]+" ");
			}
			// System.out.println();
			findArea(n, histogram);
		}
		return maxArea;
	}

	public void findArea(int n, int[] histogram) {
		int[] left_smaller = new int[n];
		int[] right_smaller = new int[n];
		left_smaller[0] = -1;
		right_smaller[n - 1] = n;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; ++i) {
			while (!stack.isEmpty() && histogram[stack.peek()] >= histogram[i])
				stack.pop();
			if (stack.isEmpty())
				left_smaller[i] = -1;
			else
				left_smaller[i] = stack.peek();
			stack.push(i);
		}
		stack = new Stack<>();
		for (int i = n - 1; i >= 0; --i) {
			while (!stack.isEmpty() && histogram[stack.peek()] >= histogram[i])
				stack.pop();
			if (stack.isEmpty())
				right_smaller[i] = n;
			else
				right_smaller[i] = stack.peek();
			stack.push(i);
		}

		for (int i = 0; i < n; ++i)
			maxArea = Math.max(maxArea, histogram[i] * (right_smaller[i] - left_smaller[i] - 1));
		// System.out.println(maxArea);
	}
}
