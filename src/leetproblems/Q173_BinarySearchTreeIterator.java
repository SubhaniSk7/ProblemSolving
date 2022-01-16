package leetproblems;

import java.util.Stack;

public class Q173_BinarySearchTreeIterator {
	TreeNode root;
	Stack<TreeNode> stack;

	public Q173_BinarySearchTreeIterator(TreeNode root) {
		this.root = root;
		stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while (cur != null) {
			stack.push(cur);
			cur = cur.left;
		}
	}

	public int next() {
		TreeNode node = stack.pop();
		TreeNode cur = node.right;
		while (cur != null) {
			stack.push(cur);
			cur = cur.left;
		}
		return node.val;
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}

	private class TreeNode {
		int val;
		TreeNode left, right;
	}
}
