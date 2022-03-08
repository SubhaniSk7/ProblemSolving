package leetproblems;

import java.util.HashMap;

public class Q138_CopyListWithRandomPointer {
	public Node copyRandomList(Node head) {
		if (head == null)
			return null;
		HashMap<Node, Node> map = new HashMap<>();
		Node cur = head;
		while (cur != null) {
			Node newNode = new Node(cur.val);
			map.put(cur, newNode);
			cur = cur.next;
		}

		cur = head;
		while (cur != null) {
			Node temp = map.get(cur);
			temp.next = map.get(cur.next);
			temp.random = map.get(cur.random);
			cur = cur.next;
		}
		return map.get(head);
	}

	private class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}
}
