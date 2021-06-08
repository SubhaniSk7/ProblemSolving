package leetproblems;

class ListNode_1 {
	int val;
	ListNode_1 next;

	ListNode_1() {
	}

	ListNode_1(int val) {
		this.val = val;
	}

	ListNode_1(int val, ListNode_1 next) {
		this.val = val;
		this.next = next;
	}
}

class Q19_RemoveNthNodeFromEndOfList {
	public ListNode_1 removeNthFromEnd(ListNode_1 head, int n) {
		ListNode_1 temp = head;
		int length = 0;
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		int position = length - n;
		if (position == 0)
			head = head.next;
		else {
			temp = head;
			for (int i = 1; i < position; i++)
				temp = temp.next;
			temp.next = temp.next.next;
		}
		return head;
	}
}