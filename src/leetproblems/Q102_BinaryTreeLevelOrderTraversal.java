package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q102_BinaryTreeLevelOrderTraversal {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		bfs(root);
		return result;
	}

	public void bfs(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> al = new ArrayList<>();
			while (size-- > 0) {
				TreeNode cur = q.poll();
				al.add(cur.val);
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			result.add(al);
		}
	}
}
