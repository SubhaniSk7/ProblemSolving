package leetproblems;

public class Q707_DesignLinkedList {

	Node root;
	int length = 0;

	public Q707_DesignLinkedList() {
		root = null;
	}

	public int get(int index) {
		if (index >= length)
			return -1;
		if (index == 0)
			return root.val;
		Node cur = root;
		for (int i = 1; i <= index; ++i)
			cur = cur.next;
		return cur.val;
	}

	public void addAtHead(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;
		} else {
			newNode.next = root;
			root = newNode;
		}
		length++;
	}

	public void addAtTail(int val) {
		if (root == null) {
			root = new Node(val);
		} else {
			Node cur = root;
			while (cur.next != null)
				cur = cur.next;
			cur.next = new Node(val);
		}
		length++;
	}

	public void addAtIndex(int index, int val) {
		if (index > length)
			return;
		Node newNode = new Node(val);
		if (index == 0) {
			newNode.next = root;
			root = newNode;
		} else {
			Node cur = root;
			for (int i = 1; i < index; ++i)
				cur = cur.next;
			newNode.next = cur.next;
			cur.next = newNode;
		}
		length++;
	}

	public void deleteAtIndex(int index) {
		if (index >= length)
			return;
		else {
			if (index == 0) {
				root = root.next;
			} else {
				Node cur = root;
				for (int i = 1; i < index; ++i)
					cur = cur.next;
				cur.next = cur.next.next;
			}
		}
		length--;
	}

	private class Node {
		int val;
		Node next;

		public Node() {
		}

		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
}
