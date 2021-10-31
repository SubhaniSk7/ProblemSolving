package leetproblems;

import basics.bst.TreeNode;

public class Q700_SearchinaBinarySearchTree {
	public TreeNode searchBST(TreeNode root, int val) {
		TreeNode cur = root;
		while (cur != null) {
			if (cur.val == val)
				return cur;
			else if (val < cur.val) {
				cur = cur.left;
			} else
				cur = cur.right;
		}
		return null;
	}
}
