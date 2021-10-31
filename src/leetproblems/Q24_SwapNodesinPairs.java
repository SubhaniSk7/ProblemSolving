package leetproblems;

public class Q24_SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return head;
		ListNode temp = new ListNode(0, head);
		ListNode cur = temp;
		while (cur.next != null && cur.next.next != null) {
			ListNode first = cur.next;
			ListNode second = cur.next.next;
			first.next = second.next;
			cur.next = second;
			cur.next.next = first;
			cur = cur.next.next;
		}
		return temp.next;
	}
}
