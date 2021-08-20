package interviewbit.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AddTwoNumbersAsList {
	static ListNode head1, head2, head3;
	static int carry = 0;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int list1 = 1, list2 = 2;

		ArrayList<Integer> n1 = new ArrayList<Integer>(), n2 = new ArrayList<Integer>();
		while (st.hasMoreTokens())
			n1.add(Integer.parseInt(st.nextToken()));
		for (int i = n1.size() - 1; i >= 0; --i)
			insertAtHead(n1.get(i), list1);

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			n2.add(Integer.parseInt(st.nextToken()));
		for (int i = n2.size() - 1; i >= 0; --i)
			insertAtHead(n2.get(i), list2);

//		printList(head1);printList(head2);
		sum(head1, head2);
		printList(head3);
	}

	public static void sum(ListNode A, ListNode B) {
		int len1 = len(A), len2 = len(B);
		int diff = 0;
		if (len1 == len2) {
			diff = 0;
			add(A, B);
			if (carry > 0)
				insertAtHead(carry, 3);
		} else {
			if (len1 < len2) {
				diff = len2 - len1;
				ListNode temp = A;
				A = B;
				B = temp;
			} else
				diff = len1 - len2;
			int count = 0;
			ListNode cur = A;
			while (count < diff) {
				cur = cur.next;
				count++;
			}
			add(cur, B);
			addCarry(A, cur);
		}
	}

	public static void add(ListNode A, ListNode B) {
		if (A == null)
			return;
		add(A.next, B.next);
		int s = A.val + B.val + carry;
		int digit = s % 10;
		carry = s / 10;
		insertAtHead(digit, 3);
	}

	public static void addCarry(ListNode head, ListNode cur) {
		if (head != cur) {
			addCarry(head.next, cur);
			int s = head.val + carry;
			int digit = s % 10;
			carry = s / 10;
			insertAtHead(digit, 3);
		}
	}

	public static void insertAtHead(int val, int list) {
		ListNode newNode = new ListNode(val);
		if (list == 1) {
			newNode.next = head1;
			head1 = newNode;
		} else if (list == 2) {
			newNode.next = head2;
			head2 = newNode;
		} else if (list == 3) {
			newNode.next = head3;
			head3 = newNode;
		}
	}

	public static int len(ListNode node) {
		int length = 0;
		ListNode cur = node;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		return length;
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
