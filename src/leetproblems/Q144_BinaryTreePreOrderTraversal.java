package leetproblems;

import java.util.ArrayList;

import basics.bst.TreeNode;

public class Q144_BinaryTreePreOrderTraversal {
	ArrayList<Integer> result = new ArrayList<Integer>();

	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		traverse(root);
		return result;
	}

	public void traverse(TreeNode root) {
		if (root != null) {
			result.add(root.val);
			traverse(root.left);
			traverse(root.right);
		}
	}
}
