package leetproblems;

import java.util.ArrayList;
import java.util.List;

import basics.bst.TreeNode;

public class Q1305_AllElementsInTwoBinarySearchTrees {
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		ArrayList<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>(), result = new ArrayList<>();
		dfs(root1, list1);
		dfs(root2, list2);
		int i = 0, j = 0, n = list1.size(), m = list2.size();
		while (i < n || j < m) {
			if (j == m || (i < n && list1.get(i) < list2.get(j)))
				result.add(list1.get(i++));
			else
				result.add(list2.get(j++));
		}
		return result;
	}

	public void dfs(TreeNode root, ArrayList<Integer> list) {
		if (root != null) {
			dfs(root.left, list);
			list.add(root.val);
			dfs(root.right, list);
		}
	}
}
