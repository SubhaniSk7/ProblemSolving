package leetproblems;

import java.util.LinkedList;
import java.util.Queue;

public class Q117_PopulatingNextRightPointersInEachNodeII {
	public Node connect(Node root) {
		if (root == null)
			return root;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; ++i) {
				Node cur = q.poll();
				if (i + 1 == n)
					cur.next = null;
				else
					cur.next = q.peek();
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
		}
		return root;
	}

	private class Node {
		public int val;
		public Node left, right, next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	}
}
