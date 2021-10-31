package leetproblems;

public class Q203_RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return head;
		while (head != null && head.val == val) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
		}
		if (head == null)
			return head;
		ListNode temp = head, prev = temp;
		while (temp != null) {
			if (temp.val == val) {
				prev.next = temp.next;
				temp = prev.next;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		return head;
	}
}
