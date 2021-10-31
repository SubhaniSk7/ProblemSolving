package leetproblems;

public class Q143_ReorderList {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null)
			return;
		ListNode slow = head, fast = head, slowPtr = null;
		while (fast != null && fast.next != null) {
			slowPtr = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		slowPtr.next = null;
		ListNode l1 = head, l2 = reverse(slow);
		merge(l1, l2);
	}

	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

	public void merge(ListNode l1, ListNode l2) {
		while (l1 != null) {
			ListNode next1 = l1.next, next2 = l2.next;
			l1.next = l2;
			if (next1 == null)
				break;
			l2.next = next1;
			l1 = next1;
			l2 = next2;
		}
	}
}
