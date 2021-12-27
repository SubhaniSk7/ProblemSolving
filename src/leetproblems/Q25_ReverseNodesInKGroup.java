package leetproblems;

public class Q25_ReverseNodesInKGroup {

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			if (head == null)
				return head;
			ListNode dummy = new ListNode(0, head);
			ListNode groupLast = dummy;
			while (true) {
				ListNode kth = kthNode(groupLast, k);
				if (kth == null)
					break;
				ListNode next = kth.next;

				reverse(groupLast.next, next, k);

				ListNode temp = groupLast.next;
				groupLast.next = kth;
				groupLast = temp;
			}
			return dummy.next;
		}

		public ListNode kthNode(ListNode head, int k) {
			ListNode cur = head;
			while (k-- > 0 && cur != null)
				cur = cur.next;
			return cur;
		}

		public void reverse(ListNode head, ListNode prev, int k) {
			ListNode cur = head;
			while (k-- > 0 && cur != null) {
				ListNode next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
		}
	}

	private class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
