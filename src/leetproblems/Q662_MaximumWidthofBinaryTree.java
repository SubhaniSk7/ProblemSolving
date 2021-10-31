package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

import basics.bst.TreeNode;

public class Q662_MaximumWidthofBinaryTree {
	public int widthOfBinaryTree(TreeNode root) {
		return bfs(root);
	}

	public int bfs(TreeNode root) {
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(root, 0));
		int max = 0, r = 0;
		while (!q.isEmpty()) {
			System.out.println(q.toString());
			int n = q.size();
			int l = q.peek().index;
			r = q.peek().index;
			for (int i = 0; i < n; ++i) {
				Pair cur = q.poll();
				r = cur.index;
				if (cur.node.left != null)
					q.offer(new Pair(cur.node.left, 2 * r + 1));
				if (cur.node.right != null)
					q.offer(new Pair(cur.node.right, 2 * r + 2));
			}
			max = Math.max(max, r - l + 1);
		}
		return max;
	}

}

class Pair {
	TreeNode node;
	int index;

	Pair(TreeNode root, int l) {
		node = root;
		index = l;
	}

	@Override
	public String toString() {
		return "[" + node.val + "->" + index + "]";
	}
}
