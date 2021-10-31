package leetproblems;

import java.util.ArrayList;
import java.util.List;

import basics.bst.TreeNode;

public class Q113_PathSumII {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		dfs(root, al, targetSum);
		return result;
	}

	public void dfs(TreeNode root, ArrayList<Integer> al, int sum) {
		if (root == null)
			return;
		al.add(root.val);
		if (root.left == null && root.right == null && sum - root.val == 0) {
			result.add(al);
			return;
		}
		dfs(root.left, new ArrayList<>(al), sum - root.val);
		dfs(root.right, new ArrayList<>(al), sum - root.val);
	}
}
