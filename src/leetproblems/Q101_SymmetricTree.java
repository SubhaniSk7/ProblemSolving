package leetproblems;

import basics.bst.TreeNode;

public class Q101_SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return symmetric(root, root);
	}

	public boolean symmetric(TreeNode A, TreeNode B) {
		if (A == null && B == null)
			return true;

		if (A != null && B != null && A.val == B.val)
			return symmetric(A.left, B.right) && symmetric(A.right, B.left);
		return false;

	}
}
