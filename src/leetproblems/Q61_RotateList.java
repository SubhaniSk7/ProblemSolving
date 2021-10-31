package leetproblems;

public class Q61_RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return head;
		ListNode tail = head;
		int len = 1;
		while (tail.next != null) {
			tail = tail.next;
			len++;
		}
		k = k % len;
		if (k == 0)
			return head;
		ListNode cur = head;
		for (int i = 0; i < len - k - 1; ++i)
			cur = cur.next;
		ListNode newHead = cur.next;
		cur.next = null;
		tail.next = head;

		return newHead;
	}
}
