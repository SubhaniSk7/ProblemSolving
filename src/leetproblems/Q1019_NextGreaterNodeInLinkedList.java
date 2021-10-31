package leetproblems;

import java.util.ArrayList;
import java.util.Stack;

public class Q1019_NextGreaterNodeInLinkedList {
	ArrayList<Integer> al = new ArrayList<>();
	Stack<Integer> stack = new Stack<>();

	public int[] nextLargerNodes(ListNode head) {
		traverse(head);
		int n = al.size();
		int[] result = new int[n];
		int i = n - 1;
		for (int x : al)
			result[i--] = x;
		return result;
	}

	public void traverse(ListNode head) {
		if (head == null)
			return;

		traverse(head.next);
		while (!stack.isEmpty() && stack.peek() <= head.val)
			stack.pop();
		if (stack.isEmpty())
			al.add(0);
		else
			al.add(stack.peek());
		stack.push(head.val);
	}
}
