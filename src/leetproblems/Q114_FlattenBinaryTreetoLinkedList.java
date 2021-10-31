package leetproblems;

import basics.bst.TreeNode;

public class Q114_FlattenBinaryTreetoLinkedList {
	public TreeNode head;

	public void flatten(TreeNode root) {
		TreeNode node = root;
		while (node != null) {
			TreeNode left = node.left;
			TreeNode right = node.right;
			if (left != null) {
				TreeNode temp = left;
				while (temp.right != null)
					temp = temp.right;
				temp.right = right;
				node.right = left;
				node.left = null;
			}
			node = node.right;
		}
	}

//--------------------------------------------------------------
	public void flatten_1(TreeNode root) {
		traverse(root);
	}

	public void traverse(TreeNode root) {
		if (root != null) {
			TreeNode tempRight = root.right;
			if (root.left != null) {
				TreeNode rightMost = right(root.left);
				rightMost.right = tempRight;
				root.right = root.left;
				root.left = null;
			}
			traverse(root.right);
		}
	}

	public TreeNode right(TreeNode root) {
		if (root.right != null)
			return right(root.right);
		return root;
	}
}
