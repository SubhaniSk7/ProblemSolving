package basics.bst;

import java.util.Stack;

public class TreeTraversalsIterative {
	public void preOrder(TreeNode root) {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		while (cur != null || !s.isEmpty()) {
			while (cur != null) {
				System.out.print(cur.data + " ");
				if (cur.right != null)
					s.push(cur.right);
				cur = cur.left;
			}
			if (!s.isEmpty())
				cur = s.pop();
		}
		System.out.println();
	}

	public void inOrder(TreeNode root) {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		while (cur != null || !s.isEmpty()) {
			while (cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			if (!s.isEmpty())
				cur = s.pop();
			System.out.print(cur.data + " ");
			cur = cur.right;
		}
		System.out.println();
	}

	public void postOrder(TreeNode root) throws InterruptedException {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		while (true) {
			while (cur != null) {
				s.push(cur);
				s.push(cur);
				cur = cur.left;
			}
			if (s.isEmpty())
				break;
			cur = s.pop();
			if (!s.isEmpty() && s.peek() == cur)
				cur = cur.right;
			else
				System.out.print(cur.data + " ");
		}
		System.out.println();
	}
}
