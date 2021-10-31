package leetproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import basics.bst.TreeNode;

public class Q1110_DeleteNodesAndReturnForest {
	Set<Integer> set = new HashSet<>();
	List<TreeNode> result = new ArrayList<>();

	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		if (root == null || to_delete.length == 0)
			return result;
		for (int x : to_delete)
			set.add(x);
		if (!set.contains(root.val))
			result.add(root);
		dfs(root);
		return result;
	}

	public TreeNode dfs(TreeNode root) {
		if (root != null) {
			root.left = dfs(root.left);
			root.right = dfs(root.right);
			if (set.contains(root.val)) {
				if (root.left != null)
					result.add(root.left);
				if (root.right != null)
					result.add(root.right);
				return null;
			}
			return root;
		}
		return root;
	}
}
