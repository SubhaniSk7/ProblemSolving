package basics.freq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class QueryOnQueues {
	public static int[] left, right;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			left = new int[n];
			right = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());

			build(n, arr);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < k; ++i) {
				int index = Integer.parseInt(br.readLine()) - 1;
				int seg = 0;
				if (left[index] != -1)
					seg += Math.abs(index - left[index]) - 1;
				else
					seg += index;

				if (right[index] != -1)
					seg += Math.abs(right[index] - index) - 1;
				else
					seg += Math.abs(n - index) - 1;
				seg++;
				sb.append(seg + "\n");
			}
			System.out.println(sb.toString());
		}
	}

	public static void build(int n, int[] arr) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		for (int i = 0, j = n - 1; i < n && j >= 0; ++i, --j) {
			if (!stack1.isEmpty())
				while (!stack1.isEmpty() && arr[stack1.peek()] <= arr[i])
					stack1.pop();
			left[i] = (stack1.isEmpty()) ? -1 : stack1.peek();
			stack1.push(i);

			if (!stack2.isEmpty())
				while (!stack2.isEmpty() && arr[stack2.peek()] <= arr[j])
					stack2.pop();
			right[j] = (stack2.isEmpty()) ? -1 : stack2.peek();
			stack2.push(j);
		}
	}
}
