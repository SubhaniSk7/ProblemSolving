package leetproblems;

public class Q82_RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode dummy = new ListNode(0, head);
		ListNode cur = head, prev = dummy;
		while (cur != null) {
			while (cur.next != null && cur.val == cur.next.val)
				cur = cur.next;

			if (prev.next == cur)
				prev = prev.next;
			else
				prev.next = cur.next;
			cur = cur.next;
		}
		return dummy.next;
	}
}
