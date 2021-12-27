package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q637_AverageOfLevelsInBinaryTree {
	ArrayList<Double> result = new ArrayList<>();

	public List<Double> averageOfLevels(TreeNode root) {
		if (root == null)
			return result;
		bfs(root);
		return result;
	}

	public void bfs(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			int n = q.size();
			double val = 0;
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				val += cur.val;
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			val /= n;
			result.add(val);
		}
	}
}
