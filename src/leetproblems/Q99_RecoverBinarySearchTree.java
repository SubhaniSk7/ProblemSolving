package leetproblems;

import basics.bst.TreeNode;

public class Q99_RecoverBinarySearchTree {
	TreeNode first = null, second = null;
	TreeNode prev = null;

	public void recoverTree(TreeNode root) {
		inOrder(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			if (prev != null && first == null && prev.val >= root.val) {
				first = prev;
			}
			if (first != null && prev.val >= root.val) {
				second = root;
			}
			prev = root;
			inOrder(root.right);
		}
	}
}
