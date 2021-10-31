package leetproblems;

import basics.bst.TreeNode;

public class Q98_ValidateBinarySearchTree {
	TreeNode prev = null;

	public boolean isValidBST(TreeNode root) {
		return inorder(root);
	}

	public boolean inorder(TreeNode root) {
		if (root != null) {
			boolean l = inorder(root.left);
			if (prev != null) {
				if (prev.val >= root.val)
					return false;
			}
			prev = root;
			boolean r = inorder(root.right);
			return l && r;
		}
		return true;
	}
}
