package interviewbit.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemoveDuplicatesFromSortedList {
	static ListNode head;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ListNode cur = head;
		while (st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			ListNode newNode = new ListNode(val);
			if (head == null)
				head = newNode;
			else {
				cur = head;
				while (cur.next != null)
					cur = cur.next;
				cur.next = newNode;
			}
		}
//		printList(head);
		deleteDuplicates(head);
		printList(head);
	}

	public static ListNode deleteDuplicates(ListNode A) {
		if (A == null || A.next == null)
			return A;

		ListNode cur = A;
		while (cur != null && cur.next != null) {
			ListNode temp = cur.next;
			if (cur.val == temp.val) {
				cur.next = temp.next;
			} else {
				cur = cur.next;
			}
//			printList(A);
		}
		return A;
	}

	public static void printList(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}
