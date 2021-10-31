package leetproblems;

import java.util.ArrayList;
import java.util.List;

import basics.bst.TreeNode;

public class Q257_BinaryTreePaths {
	ArrayList<String> result = new ArrayList<>();

	public List<String> binaryTreePaths(TreeNode root) {
		path(root, "");
		return result;
	}

	public void path(TreeNode root, String s) {
		if (root == null)
			return;

		s = s + root.val;
		if (root.left == null && root.right == null) {
			result.add(s);
			return;
		}
		s = s + "->";
		path(root.left, s);
		path(root.right, s);
	}
}
