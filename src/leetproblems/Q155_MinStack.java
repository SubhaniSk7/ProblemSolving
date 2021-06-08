package leetproblems;

import java.io.IOException;
import java.util.Stack;

public class Q155_MinStack {

	public static void main(String subhani[]) throws IOException {
		MinStack obj = new MinStack();

	}

}

class MinStack {// integer overflow problem
	Stack<Integer> stack;
	int min;

	/** initialize your data structure here. */
	public MinStack() {
		this.stack = new Stack<Integer>();
		this.min = 0;
	}

	public void push(int x) {
		if (this.stack.isEmpty()) {
			this.stack.push(x);
			this.min = x;
		} else {
			if (x >= this.min)
				this.stack.push(x);
			else {
				this.stack.push(2 * x - this.min);
				this.min = x;
			}
		}
	}

	public void pop() {
		if (this.stack.peek() < this.min)
			this.min = 2 * this.min - this.stack.peek();
		this.stack.pop();
	}

	public int top() {
		if (this.stack.peek() >= this.min)
			return this.stack.peek();
		else
			return this.min;
	}

	public int getMin() {
		return this.min;
	}
}

class MinStack_1 {
	Stack<Integer> stack, minStack;

	/** initialize your data structure here. */
	public MinStack_1() {
		this.stack = new Stack<Integer>();
		this.minStack = new Stack<Integer>();
	}

	public void push(int x) {
		this.stack.push(x);
		if (this.minStack.isEmpty() || x <= this.minStack.peek())
			this.minStack.push(x);
		else
			this.minStack.push(this.minStack.peek());
	}

	public void pop() {
		if (this.stack.isEmpty())
			return;
		else {
			this.stack.pop();
			this.minStack.pop();
		}
	}

	public int top() {
		return this.stack.peek();
	}

	public int getMin() {
		return this.minStack.peek();
	}
}