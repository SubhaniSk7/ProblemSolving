package leetproblems;

class Q19_RemoveNthNodeFromEndOfList {
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode temp = head;
//		int length = 0;
//		while (temp != null) {
//			temp = temp.next;
//			length++;
//		}
//		int position = length - n;
//		if (position == 0)
//			head = head.next;
//		else {
//			temp = head;
//			for (int i = 1; i < position; i++)
//				temp = temp.next;
//			temp.next = temp.next.next;
//		}
//		return head;
//	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		ListNode l = dummy, r = head;
		while (n-- > 0 && r != null) {
			r = r.next;
		}

		while (r != null) {
			l = l.next;
			r = r.next;
		}
		l.next = l.next.next;
		return dummy.next;
	}
}