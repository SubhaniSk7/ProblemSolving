package gfg.ds.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SinglyLinkedList {

	int length;
	SLLNode head;// holds HEAD of list

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public synchronized SLLNode getHead() {
		return head;
	}

	public void setHead(SLLNode head) {
		this.head = head;
	}

	// Default constructor
	public SinglyLinkedList() {
		setLength(0);
	}

	// insert at BEGIN
	public void insertAtBegin(SLLNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	// insert at END
	public void insertAtEnd(SLLNode node) {
		if (head == null)
			head = node;
		else {
			SLLNode temp = head;
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(node);
		}
		length++;
	}

	// insert at specified position
	public void insert(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null) {// if list is empty
			head = new SLLNode(data);
		} else if (position == 0) {// adding at begin
			insertAtBegin(new SLLNode(data));
		} else {// find position & insert
			SLLNode temp = head;
			for (int i = 1; i < position; i++)
				temp = temp.getNext();
			SLLNode newNode = new SLLNode(data);
			newNode.next = temp.next;// newNode.setNext(temp.gtNext);
			temp.setNext(newNode);
		}
		length++;
	}

	// remove from BEGIN and return it
	public SLLNode removeFromBegin() {
		SLLNode temp = head;
		if (head == null) {
			System.out.println("List is Empty..");
			return null;
		}
		if (head != null) {
			head = temp.getNext();// head=head.getNext();
			temp.setNext(null);
		}
		length--;
		return temp;
	}

	// remove from END and return end of the list
	public SLLNode removeFromEnd() {
		if (head == null)
			return null;
		SLLNode p = head, previousNode = null, next = head.getNext();
		if (next == null) {
			head = null;
			length--;
			return p;
		}
		// while (next != null) {
		// previousNode = next;
		// next = next.getNext();
		// }

		while ((next = p.getNext()) != null) {
			previousNode = p;
			p = next;
		}

		previousNode.setNext(null);
		length--;
		return p;
		// return next;
	}

	// -------------------check
	// remove matching node from the list
	public void removeMatched(SLLNode node) {
		if (head == null)
			return;
		if (node.equals(head)) {
			head = head.getNext();
			length--;
			return;
		}
		SLLNode p = head, q = null;
		while ((q = p.getNext()) != null) {
			if (node.equals(q)) {
				p.setNext(q.getNext());
				length--;
				return;
			}
			p = q;
		}
	}

	// remove the specified position node
	public void remove(int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null)
			return;

		// if position=0
		if (position == 0)
			head = head.getNext();
		else {
			SLLNode temp = head;
			for (int i = 1; i < position; i++)
				temp = temp.getNext();
			temp.setNext(temp.getNext().getNext());
		}

		length--;
	}

	// get Position of first value that is equal to given value
	public int getPosition(int data) {
		int position = 0;
		SLLNode temp = head;

		while (temp != null) {
			if (temp.getData() == data)
				return position;
			position++;
			temp = temp.getNext();
		}

		return Integer.MIN_VALUE;
	}

	public void clearList() {
		head = null;
		length = 0;
	}

	@Override
	public String toString() {
		String result = "[";
		if (head == null) {
			result += "]";
			return result;
		}
		result = result + head.getData();
		SLLNode temp = head.getNext();
		while (temp != null) {
			result += "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		SinglyLinkedList list = new SinglyLinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int n = sc.nextInt();
		int option;
		do {
			System.out.println("\t1.print List\n\t2.insertAtBegin\n\t3.insertAtEnd\n\t"
					+ "4.insertAtPosition\n\t5.removeAtBegin\n\t6.removeAtEnd\n\t7.removeAtPosition\n"
					+ "\t8.removeWithMatchingNode\n\t9.Length of list.\n\t10.clear List\n\t"
					+ "11.getPosition\n\t12.exit\n" + "---Enter option");

			option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				System.out.println(list.toString() + "\n\n");
				break;
			case 2:
				System.out.println("enter node data:");
				int data = Integer.parseInt(br.readLine());
				SLLNode node = new SLLNode(data);
				list.insertAtBegin(node);
				System.out.println("inserted..\n\n");
				break;
			case 3:
				System.out.println("enter node data:");
				int endData = Integer.parseInt(br.readLine());
				SLLNode endNode = new SLLNode(endData);
				list.insertAtEnd(endNode);
				System.out.println("inserted..\n\n");
				break;
			case 4:
				System.out.println("enter node data and position:");
				int positionData = Integer.parseInt(br.readLine());
				int position = Integer.parseInt(br.readLine());
				list.insert(positionData, position);
				System.out.println("inserted..\n\n");
				break;
			case 5:
				list.removeFromBegin();
				System.out.println("removed..\n\n");
				break;
			case 6:
				list.removeFromEnd();
				System.out.println("removed..\n\n");
				break;
			case 7:
				System.out.println("enter position to remove:");
				int removePosition = Integer.parseInt(br.readLine());
				list.remove(removePosition);
				System.out.println("removed..\n\n");
				break;
			case 8:
				int removeData = Integer.parseInt(br.readLine());
				SLLNode removeMatchedData = new SLLNode(removeData);
				list.removeMatched(removeMatchedData);
				System.out.println("removed..\n\n");
				break;
			case 9:
				System.out.println(list.getLength() + "\n\n");
				break;
			case 10:
				list.clearList();
				System.out.println("list is cleared..");
				break;
			case 11:
				System.out.println("enter data to get Position:");
				int dataPosition = Integer.parseInt(br.readLine());
				System.out.println(list.getPosition(dataPosition));
				break;
			default:
				break;
			}
		} while (option != 12);
		System.out.println("exited");
	}
}

class SLLNode {
	private int data;
	SLLNode next;

	public SLLNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SLLNode getNext() {
		return next;
	}

	public void setNext(SLLNode nextNode) {
		this.next = nextNode;
	}
}