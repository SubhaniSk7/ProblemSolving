package leetproblems;

import basics.bst.TreeNode;

public class Q606_ConstructStringFromBinaryTree {

	StringBuilder result = new StringBuilder();

	public String tree2str(TreeNode root) {
		if (root == null)
			return result.toString();
		preorder(root);
		return result.toString();
	}

	public void preorder(TreeNode root) {
		if (root != null) {
			result.append(root.val);
			if (root.left != null) {
				result.append('(');
				preorder(root.left);
				result.append(')');
			}
			if (root.left == null && root.right != null)
				result.append("()");
			if (root.right != null) {
				result.append('(');
				preorder(root.right);
				result.append(')');
			}
		}
	}
}
