package leetproblems;

import java.util.Stack;

public class Q232_ImplementQueueUsingStacks {
	Stack<Integer> s1, s2;

	public Q232_ImplementQueueUsingStacks() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		s1.push(x);
	}

	public int pop() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}
		return s2.pop();
	}

	public int peek() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}
		return s2.peek();
	}

	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
}
