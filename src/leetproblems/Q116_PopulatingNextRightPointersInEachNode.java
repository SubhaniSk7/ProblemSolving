package leetproblems;

public class Q116_PopulatingNextRightPointersInEachNode {
	public Node connect(Node root) {
		if (root == null)
			return root;
		// return bfs(root);
		return bfsRevised(root);
	}

//	public Node bfs(Node root) {
//		Queue<Node> q = new LinkedList<>();
//		q.offer(root);
//		while (!q.isEmpty()) {
//			int n = q.size();
//			for (int i = 0; i < n; ++i) {
//				Node cur = q.poll();
//				if (i + 1 == n)
//					cur.next = null;
//				else
//					cur.next = q.peek();
//				if (cur.left != null)
//					q.offer(cur.left);
//				if (cur.right != null)
//					q.offer(cur.right);
//			}
//		}
//		return root;
//	}

	public Node bfsRevised(Node root) {
		Node levelStart = root;
		while (levelStart != null) {
			Node cur = levelStart;
			while (cur != null) {
				if (cur.left != null)
					cur.left.next = cur.right;
				if (cur.right != null && cur.next != null)
					cur.right.next = cur.next.left;
				cur = cur.next;
			}
			levelStart = levelStart.left;
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
