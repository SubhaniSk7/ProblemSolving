package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Q02_AddTwoNums {
	ListNode head;

	public void insertAtEnd(ListNode node) {
		if (head == null)
			head = node;
		else {
			ListNode temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Q02_AddTwoNums list1 = new Q02_AddTwoNums(), list2 = new Q02_AddTwoNums();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

		int i, p, data;
		System.out.println("enter number in reverse order into linked list");
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++) {
			data = Integer.parseInt(st.nextToken());

			ListNode node = new ListNode(data);
			list1.insertAtEnd(node);
		}

		st = new StringTokenizer(br.readLine());
		for (i = 0; i < m; i++) {
			data = Integer.parseInt(st.nextToken());

			ListNode node = new ListNode(data);
			list2.insertAtEnd(node);
		}
		printList(list1);
		printList(list2);

		System.out.println("-- sum in reverse order");
		addTwoNumbers_2(list1.head, list2.head);// method 2 --?Better than method 1
		addTwoNumbers_1(list1.head, list2.head);// changes l1 values

	}

	// method 1
	public static ListNode addTwoNumbers_1(ListNode l1, ListNode l2) {

		ListNode temp1 = l1, temp2 = l2;
		int len1 = 0, len2 = 0, i, j, carry = 0;
		while (temp1.next != null) {
			temp1 = temp1.next;
			len1 += 1;
		}
		len1 += 1;
		while (temp2.next != null) {
			temp2 = temp2.next;
			len2 += 1;
		}
		len2 += 1;

		if (len1 < len2) {
			int diff = len2 - len1;
			for (i = 0; i < diff; i++) {
				temp1.next = new ListNode(0);
				temp1 = temp1.next;
			}
		} else if (len1 > len2) {
			int diff = len1 - len2;
			for (i = 0; i < diff; i++) {
				temp2.next = new ListNode(0);
				temp2 = temp2.next;
			}
		}

		temp1 = l1;
		temp2 = l2;

		ListNode prev = null;

		int len = (len1 > len2) ? len1 : len2;
		for (i = 0; i < len; i++) {
			int val1 = temp1.val, val2 = temp2.val;

			int add = val1 + val2 + carry;
			temp1.val = add % 10;
			carry = add / 10;

			prev = temp1;
			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		if (carry > 0)
			prev.next = new ListNode(carry);

		printListNode(l1);
		return l1;

	}

	// method 2 --?Better than method 1
	public static ListNode addTwoNumbers_2(ListNode l1, ListNode l2) {

		ListNode temp1 = l1, temp2 = l2;
		int len1 = 0, len2 = 0, i, j, carry = 0;

		ListNode head = new ListNode(0);
		ListNode current = head;
		while (temp1 != null || temp2 != null) {

			int x = (temp1 != null) ? temp1.val : 0;
			int y = (temp2 != null) ? temp2.val : 0;

			int add = x + y + carry;
			carry = add / 10;

			current.next = new ListNode(add);
			current = current.next;
			if (temp1 != null)
				temp1 = temp1.next;
			if (temp2 != null)
				temp2 = temp2.next;
		}

		if (carry > 0)
			current.next = new ListNode(carry);

		printListNode(head.next);
		return head.next;
	}

	public static void printList(Q02_AddTwoNums list) {
		ListNode temp = list.head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void printListNode(ListNode list) {
		ListNode temp = list;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
