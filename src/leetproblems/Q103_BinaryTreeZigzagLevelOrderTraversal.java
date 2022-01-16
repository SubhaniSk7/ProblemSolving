package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q103_BinaryTreeZigzagLevelOrderTraversal {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		bfs(root);
		return result;
	}

	public void bfs(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int level = 0;
		while (!q.isEmpty()) {
			int n = q.size();
			List<Integer> al = new ArrayList<>();
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				if (level % 2 == 0)
					al.add(cur.val);
				else
					al.add(0, cur.val);
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			result.add(al);
			level++;
		}
	}

	private class TreeNode {
		int val;
		TreeNode left, right;
	}
}
