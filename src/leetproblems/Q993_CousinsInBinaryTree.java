package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q993_CousinsInBinaryTree {
	public boolean isCousins(TreeNode root, int x, int y) {
		return bfs(root, x, y);
	}

	public boolean bfs(TreeNode root, int x, int y) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n = q.size();
			boolean isX = false, isY = false;
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				if (cur.val == x)
					isX = true;
				if (cur.val == y)
					isY = true;
				if (cur.left != null && cur.right != null) {
					if (cur.left.val == x && cur.right.val == y)
						return false;
					if (cur.left.val == y && cur.right.val == x)
						return false;
				}
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			if (isX && isY)
				return true;
		}
		return false;
	}
}
