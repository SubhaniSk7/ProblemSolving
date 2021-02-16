package basics.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_Sorting {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			stack.push(Integer.parseInt(st.nextToken()));
		sort(stack);
		System.out.println(stack.toString());
	}

	public static void sort(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int x = stack.pop();
			sort(stack);
			arrange(x, stack);
		}
	}

	public static void arrange(int x, Stack<Integer> stack) {
		if (stack.isEmpty() || stack.peek() <= x) {
			stack.push(x);
			return;
		}
		int temp = stack.pop();
		arrange(x, stack);
		stack.push(temp);
	}
}
