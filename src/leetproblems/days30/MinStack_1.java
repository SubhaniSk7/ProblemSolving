package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class MinStack_1 {
	Stack<Long> stack;
	int min;

	public MinStack_1() {
		stack = new Stack<Long>();
		min = 0;
	}

	public void push(int val) {
		if (stack.isEmpty()) {
			min = val;
			stack.push((long) val);
		} else {
			if (val < min) {
				long ele = 2L * val - min;
				stack.push(ele);
				min = val;
			} else
				stack.push((long) val);
		}
	}

	public void pop() {
		if (stack.isEmpty())
			return;
		if (stack.peek() <= min) {
			long v1 = 2 * min;
			long t = stack.pop();
			long v = v1 - t;
			min = (int) v;
		} else
			stack.pop();
	}

	public int top() {
		if (stack.peek() <= min)
			return min;
		else {
			long val = stack.peek();
			return (int) val;
		}
	}

	public int getMin() {
		return min;
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
		MinStack_1 obj = new MinStack_1();
		for (String command : s) {
			if (command.equals("MinStack"))
				obj = new MinStack_1();
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
