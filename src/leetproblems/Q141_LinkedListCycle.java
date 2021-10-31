package leetproblems;

public class Q141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head, fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null)
				return false;
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

	public boolean hasCycle_1(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}
}
