package leetproblems;

public class Q160_IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		int len1 = 0, len2 = 0;
		ListNode cur = headA;
		while (cur != null) {
			len1++;
			cur = cur.next;
		}
		cur = headB;
		while (cur != null) {
			len2++;
			cur = cur.next;
		}
		ListNode cur1 = headA, cur2 = headB;
		if (len1 < len2) {
			int diff = len2 - len1;
			while (diff > 0) {
				cur2 = cur2.next;
				diff--;
			}
		} else if (len1 > len2) {
			int diff = len1 - len2;
			while (diff > 0) {
				cur1 = cur1.next;
				diff--;
			}
		}
		while (cur1 != cur2) {
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		return cur1;
	}

	public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		ListNode cur1 = headA, cur2 = headB;
		while (cur1 != cur2) {
			if (cur1 == null)
				cur1 = headB;
			else
				cur1 = cur1.next;
			if (cur2 == null)
				cur2 = headA;
			else
				cur2 = cur2.next;
		}
		return cur1;
	}
}
