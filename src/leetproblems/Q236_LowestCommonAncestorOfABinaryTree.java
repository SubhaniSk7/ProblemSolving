package leetproblems;

import java.util.ArrayList;

import basics.bst.TreeNode;

public class Q236_LowestCommonAncestorOfABinaryTree {
	public TreeNode lowestCommonAncestor(TreeNode A, TreeNode B, TreeNode C) {
		ArrayList<TreeNode> bal = new ArrayList<>(), cal = new ArrayList<>();
		if (!path(A, bal, B.val) || !path(A, cal, C.val))
			return null;
		int i = 0;
		for (i = 0; i < bal.size() && i < cal.size(); ++i) {
			if (bal.get(i) != cal.get(i))
				break;
		}
		return bal.get(i - 1);
	}

	public boolean path(TreeNode A, ArrayList<TreeNode> al, int n) {
		if (A == null)
			return false;

		al.add(A);
		if (A.val == n)
			return true;
		if (A.left != null && path(A.left, al, n))
			return true;
		if (A.right != null && path(A.right, al, n))
			return true;
		al.remove(al.size() - 1);
		return false;
	}

//	-----------------------------------------------------------------------

	public TreeNode path_1(TreeNode root, int a, int b) {
		if (root == null)
			return null;
		if (root.val == a || root.val == b)
			return root;
		TreeNode left = path_1(root.left, a, b);
		TreeNode right = path_1(root.right, a, b);
		if (left != null && right != null)
			return root;
		if (left == null && right == null)
			return null;

		return left != null ? left : right;
	}
}
