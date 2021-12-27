package leetproblems;

import basics.bst.TreeNode;

public class Q701_InsertIntoABinarySearchTree {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val);
		TreeNode newNode = new TreeNode(val);
		TreeNode cur = root;
		TreeNode parent = null;
		while (true) {
			parent = cur;
			if (val < cur.val) {
				cur = cur.left;
				if (cur == null) {
					parent.left = newNode;
					break;
				}
			} else {
				cur = cur.right;
				if (cur == null) {
					parent.right = newNode;
					break;
				}
			}
		}
		return root;
	}
}
