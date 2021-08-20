package interviewbit.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KReverseLinkedList {
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
		int k = 3;
		ListNode node = reverseK(head, k);
		printList(node);
	}

	public static ListNode reverseK(ListNode A, int k) {
		if (A == null)
			return null;
		int count = 0;
		ListNode cur = A, prev = null, next = null;
		while (count < k && cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			count++;
		}
//		printList(prev);
		if (next != null)
			A.next = reverseK(next, k);
		return prev;
	}

	public static void printList(ListNode A) {
		ListNode cur = A;
		while (cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}
