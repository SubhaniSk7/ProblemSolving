package leetproblems;

import basics.bst.TreeNode;

public class Q563_BinaryTreeTilt {
	int sum = 0;

	public int findTilt(TreeNode root) {
		inOrder(root);
		return sum;
	}

	public int inOrder(TreeNode root) {
		if (root == null)
			return 0;
		int l = inOrder(root.left);
		int r = inOrder(root.right);

		int temp = root.val + l + r;
		root.val = Math.abs(l - r);
		sum += root.val;
		return temp;
	}
}
