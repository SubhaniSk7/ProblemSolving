package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q1302_DeepestLeavesSum {
	public int deepestLeavesSum(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int result = 0;
		while (!q.isEmpty()) {
			int n = q.size();
			result = 0;
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				result += cur.val;
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
		}
		return result;
	}
}
