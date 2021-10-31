package basics.stacks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class MaxAreaHistogram {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Subhani\\Desktop\\CP\\input.txt"));
		int n = Integer.parseInt(br.readLine());
		int[] bars = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			bars[i] = Integer.parseInt(st.nextToken());
		System.out.println(solve(n, bars));
	}

	public static int solve(int n, int[] bars) {
		int area = 0;
		int[] left_smaller = new int[n];
		int[] right_smaller = new int[n];
		left_smaller[0] = -1;
		right_smaller[n - 1] = n;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; ++i) {
			while (!stack.isEmpty() && bars[stack.peek()] >= bars[i])
				stack.pop();
			if (stack.isEmpty())
				left_smaller[i] = -1;
			else
				left_smaller[i] = stack.peek();
			stack.push(i);
		}
		stack = new Stack<>();
		for (int i = n - 1; i >= 0; --i) {
			while (!stack.isEmpty() && bars[stack.peek()] >= bars[i])
				stack.pop();
			if (stack.isEmpty())
				right_smaller[i] = n;
			else
				right_smaller[i] = stack.peek();
			stack.push(i);
		}

		for (int i = 0; i < n; ++i) {
			area = Math.max(area, bars[i] * (right_smaller[i] - left_smaller[i] - 1));
		}
		return area;
	}
}
