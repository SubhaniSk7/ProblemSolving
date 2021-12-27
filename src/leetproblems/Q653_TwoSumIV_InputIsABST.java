package leetproblems;

import java.util.HashSet;

import basics.bst.TreeNode;

public class Q653_TwoSumIV_InputIsABST {
	HashSet<Integer> set = new HashSet<>();
	boolean result = false;

	public boolean findTarget(TreeNode root, int k) {
		inOrder(root, k);
		return result;
		// return dfs(root, k);
	}

	public void inOrder(TreeNode root, int k) {
		if (root != null) {
			if (result)
				return;
			inOrder(root.left, k);
			int need = k - root.val;
			if (set.contains(need)) {
				result = true;
				return;
			}
			set.add(root.val);
			if (result)
				return;
			inOrder(root.right, k);
		}
	}

//	public boolean dfs(TreeNode root, int k) {
//		if (root == null)
//			return false;
//		if (set.contains(k - root.val))
//			return true;
//		set.add(root.val);
//		return dfs(root.left, k) || dfs(root.right, k);
//	}
}
