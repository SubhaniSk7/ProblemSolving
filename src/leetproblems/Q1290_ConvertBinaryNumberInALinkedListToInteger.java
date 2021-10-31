package leetproblems;

public class Q1290_ConvertBinaryNumberInALinkedListToInteger {
	int result = 0, i = 0;

	public int getDecimalValue(ListNode head) {
		rec(head);
		// while(head!=null){
		// result *=2;
		// result += head.val;
		// head = head.next;
		// }
		return result;
	}

	public void rec(ListNode head) {
		if (head != null) {
			rec(head.next);
			result += head.val * Math.pow(2, i);
			i++;
		}
	}
}
