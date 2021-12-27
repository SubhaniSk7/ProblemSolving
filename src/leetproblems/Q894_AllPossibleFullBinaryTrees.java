package leetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q894_AllPossibleFullBinaryTrees {
	HashMap<Integer, List<TreeNode>> map = new HashMap<>();

	public List<TreeNode> allPossibleFBT(int n) {
		return backtrack(n);
	}

	public List<TreeNode> backtrack(int n) {
		List<TreeNode> result = new ArrayList<>();
		if (map.containsKey(n))
			return map.get(n);

		if (n == 1) {
			result.add(new TreeNode(0));
			return result;
		}
		n = n - 1;
		for (int l = 1; l < n; l += 2) {
			List<TreeNode> left = backtrack(l);
			List<TreeNode> right = backtrack(n - l);

			for (TreeNode lst : left) {
				for (TreeNode rst : right)
					result.add(new TreeNode(0, lst, rst));
			}
		}
		map.put(n, result);
		return result;
	}

	private class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
