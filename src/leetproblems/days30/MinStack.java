package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class MinStack {
	int x, min;
	Stack<MinStack> stack;

	public MinStack() {
		stack = new Stack<MinStack>();
	}

	public MinStack(int a, int b) {
		x = a;
		min = b;
	}

	public void push(int val) {
		MinStack obj;
		if (stack.isEmpty()) {
			obj = new MinStack(val, val);
		} else {
			obj = new MinStack(val, Math.min(val, stack.peek().min));
		}
		stack.push(obj);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek().x;
	}

	public int getMin() {
		return stack.peek().min;
	}

	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> s = new ArrayList<>();
		while (st.hasMoreTokens())
			s.add(st.nextToken());
		ArrayList<Integer> nums = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			nums.add(Integer.parseInt(st.nextToken()));
		long val = (2 * -2147483648) - 2147483647;
		System.out.println(val);
		System.out.println(-6442450943L);
		System.out.println((2 * -2147483648) - 2147483647);
		MinStack obj = new MinStack();
		for (String command : s) {
			if (command.equals("MinStack"))
				obj = new MinStack();
			else if (command.equals("push")) {
				obj.push(nums.get(0));
				nums.remove(0);
			} else if (command.equals("pop"))
				obj.pop();
			else if (command.equals("top"))
				System.out.println(obj.top());
			else if (command.equals("getMin"))
				System.out.println(obj.getMin());
		}
	}
}
//MinStack push push push getMin top pop getMin
//-2 0 -1 

//MinStack push push push top pop getMin pop getMin pop push top getMin push top getMin pop getMin
//2147483646 2147483646 2147483647 2147483647 -2147483648
