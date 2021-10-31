package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q513_FindBottomLeftTreeValue {
	public int findBottomLeftValue(TreeNode root) {
		return bfs(root);
	}

	public int bfs(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int ans = 0;
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				if (i == 0)
					ans = cur.val;
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
		}
		return ans;
	}

	public int findBottomLeftValue_1(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			root = q.poll();
			if (root == null)
				return 0;
			if (root.right != null)
				q.offer(root.right);
			if (root.left != null)
				q.offer(root.left);
		}
		return root.val;
	}
}
