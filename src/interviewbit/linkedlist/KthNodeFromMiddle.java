package interviewbit.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KthNodeFromMiddle {
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
		System.out.println(solve(head, 5));
		printList(head);
	}

	public static int solve(ListNode A, int B) {
		int result = -1;
		int length = 0;
		ListNode cur = A;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		int mid = length / 2;
		int pos = mid - B;
		cur = A;
		length = 0;
		while (cur != null) {
			if (length == pos) {
				result = cur.val;
				break;
			}
			length++;
			cur = cur.next;
		}
		return result;
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
