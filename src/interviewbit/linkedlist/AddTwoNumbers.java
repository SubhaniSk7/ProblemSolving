package interviewbit.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AddTwoNumbers {

	static ListNode head1, head2;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int list1 = 1, list2 = 2;

		ArrayList<Integer> n1 = new ArrayList<Integer>(), n2 = new ArrayList<Integer>();
		while (st.hasMoreTokens())
			n1.add(Integer.parseInt(st.nextToken()));
		for (int i = 0; i < n1.size(); ++i)
			insertAtHead(n1.get(i), list1);

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			n2.add(Integer.parseInt(st.nextToken()));
		for (int i = 0; i < n2.size(); ++i)
			insertAtHead(n2.get(i), list2);

		printList(head1);
		printList(head2);
		ListNode result = addTwoNumbers(head1, head2);
		printList(result);
	}

	public static ListNode addTwoNumbers(ListNode A, ListNode B) {
		int carry = 0;
		ListNode result = null;
		ListNode cur1 = A, cur2 = B;
		while (cur1 != null && cur2 != null) {
			int sum = cur1.val + cur2.val + carry;
			int digit = sum % 10;
			carry = sum / 10;
			ListNode node = new ListNode(digit);
			node.next = result;
			result = node;
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		if (cur1 != null) {
			while (cur1 != null) {
				int sum = cur1.val + carry;
				int digit = sum % 10;
				carry = sum / 10;
				ListNode node = new ListNode(digit);
				node.next = result;
				result = node;
				cur1 = cur1.next;
			}
		}
		if (cur2 != null) {
			while (cur2 != null) {
				int sum = cur2.val + carry;
				int digit = sum % 10;
				carry = sum / 10;
				ListNode node = new ListNode(digit);

				node.next = result;
				result = node;

				cur2 = cur2.next;
			}
		}
		if (carry > 0) {
			ListNode node = new ListNode(carry);
			node.next = result;
			result = node;
		}
		result = reverse(result);
		return result;
	}

	public static ListNode reverse(ListNode list) {
		ListNode cur = list, prev = null, next = null;
		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}

	public static void insertAtHead(int val, int list) {
		ListNode newNode = new ListNode(val);
		if (list == 1) {
			newNode.next = head1;
			head1 = newNode;
		} else if (list == 2) {
			newNode.next = head2;
			head2 = newNode;
		}
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
