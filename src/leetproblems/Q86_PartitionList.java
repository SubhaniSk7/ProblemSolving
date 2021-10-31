package leetproblems;

public class Q86_PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode first_head = new ListNode(0), first = first_head;
		ListNode second_head = new ListNode(0), second = second_head;
		ListNode cur = head;
		while (cur != null) {
			if (cur.val < x) {
				first.next = cur;
				first = first.next;
			} else {
				second.next = cur;
				second = second.next;
			}
			cur = cur.next;
		}
		second.next = null;
		first.next = second_head.next;
		return first_head.next;
	}
}
