package leetproblems;

import basics.bst.TreeNode;

public class Q109_ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		return convert(head, null);
	}

	public TreeNode convert(ListNode head, ListNode tail) {
		if (head == tail)
			return null;

		ListNode slow = head;
		ListNode fast = head;
		while (fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = convert(head, slow);
		root.right = convert(slow.next, tail);
		return root;
	}
}
