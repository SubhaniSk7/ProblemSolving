package leetproblems;

public class Q92_ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (head == null)
			return head;
		ListNode cur = head, prev = null;
		while (left > 1) {
			prev = cur;
			cur = cur.next;
			left--;
			right--;
		}
		ListNode connection = prev;
		ListNode tail = cur;
		while (right > 0) {
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			right--;
		}
		if (connection != null)
			connection.next = prev;
		else
			head = prev;
		tail.next = cur;
		return head;
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
