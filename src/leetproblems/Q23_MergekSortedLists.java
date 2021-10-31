package leetproblems;

import java.util.PriorityQueue;

public class Q23_MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < lists.length; ++i) {
			ListNode cur = lists[i];
			while (cur != null) {
				pq.offer(cur.val);
				cur = cur.next;
			}
		}

		ListNode head = new ListNode(-1);
		ListNode cur = head;
		while (!pq.isEmpty()) {
			ListNode temp = new ListNode(pq.poll());
			cur.next = temp;
			cur = cur.next;
		}
		return head.next;
	}
}
