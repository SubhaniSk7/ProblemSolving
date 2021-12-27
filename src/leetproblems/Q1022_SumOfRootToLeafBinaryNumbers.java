package leetproblems;

import basics.bst.TreeNode;

public class Q1022_SumOfRootToLeafBinaryNumbers {
	int result = 0;

	public int sumRootToLeaf(TreeNode root) {
		// return sum(root, 0);
		dfs(root, 0);
		return result;
	}

// public int sum(TreeNode root, int parent){
//     if(root == null)
//         return 0;
//     int cur = parent * 2 + root.val;
//     if(root.left == null && root.right == null)
//         return cur;
//     int left = sum(root.left, cur);
//     int right = sum(root.right, cur);
//     return left + right;
// }

	public void dfs(TreeNode root, int parent) {
		if (root == null)
			return;
		int cur = parent * 2 + root.val;
		if (root.left == null && root.right == null) {
			result += cur;
			return;
		}
		dfs(root.left, cur);
		dfs(root.right, cur);
	}
}
