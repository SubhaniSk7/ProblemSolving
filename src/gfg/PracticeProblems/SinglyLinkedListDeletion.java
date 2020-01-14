package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SinglyLinkedListDeletion {

	static Node head;// holds HEAD of list

	public synchronized Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insertAtEnd(Node node) {
		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(node);
		}
	}

	// remove the specified position node
	public Node remove(Node head, int position) {

		if (head == null)
			return head;

		// if position=1
		if (position == 1)
			head = head.next;
		else {
			Node temp = head;
			for (int i = 2; i < position; i++)
				temp = temp.next;
			temp.next = temp.next.next;
		}
		return head;
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		SinglyLinkedListDeletion list;
		while (t-- > 0) {
			list = new SinglyLinkedListDeletion();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i, p, data;
			for (i = 0; i < n; i++) {
				data = Integer.parseInt(st.nextToken());
				Node node = new Node(data);
				list.insertAtEnd(node);
			}
			int x = Integer.parseInt(br.readLine());

			list.printList();

			list.remove(head, x);
			list.printList();
		}
	}

	public void printList() {
		String result = "";
		if (head != null) {
			result = result + head.getData();
			Node temp = head.getNext();
			while (temp != null) {
				result += " " + temp.getData();
				temp = temp.getNext();
			}
		}
		System.out.println(result);
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node nextNode) {
		this.next = nextNode;
	}
}