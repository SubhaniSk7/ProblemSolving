package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q107_BinaryTreeLevelOrderTraversal_II {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			ArrayList<Integer> al = new ArrayList<>();
			int n = q.size();
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				al.add(cur.val);
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			result.add(0, al);
		}
		return result;
	}
}
