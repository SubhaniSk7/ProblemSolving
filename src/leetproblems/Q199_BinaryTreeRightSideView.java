package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q199_BinaryTreeRightSideView {
	ArrayList<Integer> result = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode root) {
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
			for (int i = 0; i < n; ++i) {
				TreeNode cur = q.poll();
				if (i == 0)
					result.add(cur.val);
				if (cur.right != null)
					q.offer(cur.right);
				if (cur.left != null)
					q.offer(cur.left);
			}
		}
	}
}
