package leetproblems;

import java.util.ArrayList;

import basics.bst.TreeNode;

public class Q872_LeafSimilarTrees {

	ArrayList<Integer> leaf1 = new ArrayList<>();
	ArrayList<Integer> leaf2 = new ArrayList<>();

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		dfs(root1, true);
		dfs(root2, false);
		if (leaf1.size() != leaf2.size())
			return false;
		for (int i = 0; i < leaf1.size(); ++i) {
			if (leaf1.get(i) != leaf2.get(i))
				return false;
		}
		return true;
	}

	public void dfs(TreeNode root, boolean tree1) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			if (tree1)
				leaf1.add(root.val);
			else
				leaf2.add(root.val);
			return;
		}
		dfs(root.left, tree1);
		dfs(root.right, tree1);
	}
}
