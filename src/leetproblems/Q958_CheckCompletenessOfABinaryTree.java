package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q958_CheckCompletenessOfABinaryTree {
	public boolean isCompleteTree(TreeNode root) {// null value only occurs at last for Valid Complete Tree
		return bfs(root);
	}

	public boolean bfs(TreeNode root) {
		boolean end = false;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode cur = q.poll();
			if (cur == null) {
				end = true;
			} else {
				if (end)
					return false;
				q.offer(cur.left);
				q.offer(cur.right);
			}
		}
		return true;
	}
}
