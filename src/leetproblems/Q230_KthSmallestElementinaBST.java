package leetproblems;

import basics.bst.TreeNode;

public class Q230_KthSmallestElementinaBST {
	int ans = 0, count = 0;

	public int kthSmallest(TreeNode root, int k) {
		inOrder(root, k);
		return ans;
	}

	public void inOrder(TreeNode root, int k) {
		if (root != null) {
			inOrder(root.left, k);
			count++;
			if (count > k)
				return;
			if (count == k) {
				ans = root.val;
				return;
			}
			inOrder(root.right, k);
		}
	}
}
