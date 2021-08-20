package interviewbit.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortBinaryLinkedList {

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
		solve(head);
		printList(head);
	}

	public static ListNode solve(ListNode A) {
		int zeroes = 0, ones = 0;

		ListNode cur = head;
		while (cur != null) {
			if (cur.val == 0)
				zeroes++;
			else
				ones++;
			cur = cur.next;
		}
		cur = head;
		while (cur != null) {
			if (zeroes > 0) {
				cur.val = 0;
				zeroes--;
			} else {
				cur.val = 1;
				ones--;
			}
			cur = cur.next;
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
