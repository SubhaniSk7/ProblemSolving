package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q515_FindLargestValueInEachTreeRow {
	ArrayList<Integer> result = new ArrayList<Integer>();

	public List<Integer> largestValues(TreeNode root) {
		bfs(root);
		return result;
	}

	public void bfs(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n = q.size();
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				max = Math.max(max, cur.val);
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			result.add(max);
		}
	}
}
