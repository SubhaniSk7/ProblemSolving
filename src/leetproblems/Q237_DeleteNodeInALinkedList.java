package leetproblems;

public class Q237_DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
		ListNode temp = node;
		ListNode last = temp;
		while (temp.next != null) {
			temp.val = temp.next.val;
			last = temp;
			temp = temp.next;
		}
		last.next = null;
	}
}
