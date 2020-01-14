package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SinglyLinkedListInsertion {

	ListNode head;// holds HEAD of list

	public synchronized ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	// insert at BEGIN
	public void insertAtBegin(ListNode node) {
		node.setNext(head);
		head = node;
	}

	// insert at END
	public void insertAtEnd(ListNode node) {
		if (head == null)
			head = node;
		else {
			ListNode temp = head;
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(node);
		}
	}

	public void printList() {
		String result = "";
		if (head != null) {
			result = result + head.getData();
			ListNode temp = head.getNext();
			while (temp != null) {
				result += " " + temp.getData();
				temp = temp.getNext();
			}
		}
		System.out.println(result);
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		SinglyLinkedListInsertion list;
		while (t-- > 0) {
			list = new SinglyLinkedListInsertion();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i, p, data;
			for (i = 0; i < 2 * n; i = i + 2) {
				data = Integer.parseInt(st.nextToken());
				p = Integer.parseInt(st.nextToken());

				ListNode node = new ListNode(data);
				if (p == 0)
					list.insertAtBegin(node);
				else
					list.insertAtEnd(node);
			}
			list.printList();
		}
	}
}

class ListNode {
	private int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode nextNode) {
		this.next = nextNode;
	}
}