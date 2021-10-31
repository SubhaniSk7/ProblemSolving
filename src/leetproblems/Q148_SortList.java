package leetproblems;

public class Q148_SortList {
	public ListNode sortList(ListNode head) {// merge sort
		if (head == null || head.next == null)
			return head;
		ListNode temp = head;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		temp.next = null;
		ListNode left = sortList(head);
		ListNode right = sortList(slow);
		return merge(left, right);
	}

	public ListNode merge(ListNode left, ListNode right) {
		ListNode temp = new ListNode(0);
		ListNode cur = temp;
		while (left != null && right != null) {
			if (left.val < right.val) {
				cur.next = left;
				left = left.next;
			} else {
				cur.next = right;
				right = right.next;
			}
			cur = cur.next;
		}
		if (left != null)
			cur.next = left;

		if (right != null)
			cur.next = right;
		return temp.next;
	}
}
