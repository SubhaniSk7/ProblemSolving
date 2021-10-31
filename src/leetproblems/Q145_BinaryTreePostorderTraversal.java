package leetproblems;

import java.util.ArrayList;

import basics.bst.TreeNode;

public class Q145_BinaryTreePostorderTraversal {
	ArrayList<Integer> result = new ArrayList<Integer>();

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		traverse(root);
		return result;
	}

	public void traverse(TreeNode root) {
		if (root != null) {
			traverse(root.left);
			traverse(root.right);
			result.add(root.val);
		}
	}
}
