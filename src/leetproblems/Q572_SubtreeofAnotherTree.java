package leetproblems;

import basics.bst.TreeNode;

public class Q572_SubtreeofAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null)
			return true;
		if (root == null)
			return false;
		if (same(root, subRoot))
			return true;
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	public boolean same(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 != null && root2 != null && root1.val == root2.val)
			return same(root1.left, root2.left) && same(root1.right, root2.right);
		return false;
	}
}
