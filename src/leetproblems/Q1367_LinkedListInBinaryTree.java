package leetproblems;

import basics.bst.TreeNode;

public class Q1367_LinkedListInBinaryTree {
	public boolean isSubPath(ListNode head, TreeNode root) {
		if (head == null)
			return true;
		if (root == null)
			return false;
		return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
	}

	public boolean dfs(ListNode head, TreeNode root) {
		if (head == null)
			return true;
		if (root == null)
			return false;

		boolean l = false, r = false;
		if (head.val == root.val) {
			l = dfs(head.next, root.left);
			r = dfs(head.next, root.right);
		}
		return l || r;
	}
}
