package leetproblems;

import basics.bst.TreeNode;

public class Q450_DeleteNodeInABST {
	public TreeNode deleteNode(TreeNode root, int key) {
		return delete(root, key);
	}

	public TreeNode delete(TreeNode root, int key) {
		if (root == null)
			return root;

		if (key < root.val) {
			root.left = delete(root.left, key);
		} else if (key > root.val) {
			root.right = delete(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				root.val = inOrderSuccessor(root, root.val).val;
				root.right = delete(root.right, root.val);
			}
		}
		return root;
	}

	public TreeNode inOrderSuccessor(TreeNode root, int ele) {
		if (root == null)
			return null;
		TreeNode cur = root, successor = null;
		while (cur != null) {
			if (ele == cur.val) {
				if (cur.right != null)
					successor = min(cur.right);
				return successor;
			} else if (cur.val < ele) {
				cur = cur.right;
			} else {
				successor = cur;
				cur = cur.left;
			}
		}
		return successor;
	}

	public TreeNode min(TreeNode root) {
		if (root == null)
			return root;
		TreeNode cur = root;
		while (cur.left != null)
			cur = cur.left;
		return cur;
	}
}
