package gfg.ds.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularLinkedList {

	CLLNode tail;
	private int length;

	public CircularLinkedList() {
		super();
		setTail(null);
		setLength(0);
	}

	public CircularLinkedList(CLLNode tail, int length) {
		super();
		this.tail = tail;
		this.length = length;
	}

	public CLLNode getTail() {
		return tail;
	}

	public void setTail(CLLNode tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void clearList() {
		length = 0;
		tail = null;
	}

	// ----------------------------------------------
	public String insertAtBegin(CLLNode node) {
		if (tail == null) {
			tail = node;
			tail.setNextNode(tail);
		} else {
			CLLNode temp = node;
			temp.setNextNode(tail.getNextNode());
			tail.setNextNode(temp);
		}
		length++;
		return "inserted..";
	}

	// ----------------------------------------------
	public String insertAtEnd(CLLNode node) {
		insertAtBegin(node);
		tail = tail.getNextNode();
		return "inserted..";
	}

	// ----------------------------------------------
	public String insert(int data, int position) {
		CLLNode node = new CLLNode(data);
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (tail == null) {// if list is empty
			tail = node;
			tail.setNextNode(tail);
		} else if (position == 0) {// adding at begin
			insertAtBegin(node);
		} else if (position == length) {
			insertAtEnd(node);
		} else {// find position & insert
			CLLNode temp = tail.getNextNode();
			for (int i = 1; i < position; i++)
				temp = temp.getNextNode();
			node.nextNode = temp.nextNode;
			temp.setNextNode(node);
			length++;
		}
		return "inserted..";
	}

	// ----------------------------------------------

	//
	@Override
	public String toString() {
		String result = "[";
		if (tail == null) {
			result += "]";
			return result;
		}
		CLLNode temp = tail.getNextNode();
		while (temp != tail) {
			result += temp.getData() + ",";
			temp = temp.getNextNode();
		}
		result += temp.getData();
		return result + "]";
	}

	public String removeFromBegin() {

		CLLNode temp = tail.getNextNode();
		if (tail == null)
			return "empty list..";
		else if (tail.getNextNode() == tail)
			tail = null;
		else {
			tail.nextNode = temp.nextNode;
			temp.setNextNode(null);
		}
		length--;
		return "removed..";
	}

	public String removeFromEnd() {

		if (tail == null)
			return "empty list";
		else {
			CLLNode curr = tail;
			while ((curr.getNextNode() != tail))
				curr = curr.getNextNode();
			if (curr == tail)
				tail = null;
			else {
				curr.nextNode = tail.getNextNode();
				tail = curr;
			}
		}
		length--;
		return "removed..";
	}

	public String removePosition(int position) {

		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (tail == null)
			return "empty list..";
		else if (position == 0)
			removeFromBegin();
		else if (position == length)
			removeFromEnd();
		else {
			CLLNode temp = tail.getNextNode();
			for (int i = 1; i < position; i++)
				temp = temp.getNextNode();
			if (temp.nextNode == tail)
				tail = temp;
			else
				temp.nextNode = temp.nextNode.nextNode;

			length--;
		}
		return "removed..";
	}

	public String removeMatched(int data) {
		if (tail == null)
			return "empty list..";
		CLLNode temp = tail.getNextNode(), prev = tail;
		int len = 0;
		while (temp.getData() != data && len < length) {
			prev = temp;
			temp = temp.getNextNode();
			len++;
		}
		if (temp.getData() == data) {
			if (tail.getNextNode() == tail)
				tail = null;
			else {
				if (temp == tail)
					tail = prev;
				prev.nextNode = prev.nextNode.nextNode;
			}
			temp.nextNode = null;
			length--;
		}
		return "removed..";
	}

	public String printHead() {
		if (tail == null)
			return "empty list..";
		return tail.getNextNode().getData() + "";
	}

	public String printTail() {
		if (tail == null)
			return "empty list..";
		return tail.getData() + "";
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		CircularLinkedList cll = new CircularLinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int option, data, position;

		CLLNode node;
		do {
			System.out.println("\t1.print List\n\t2.insertAtBegin\n\t3.insertAtEnd\n\t"
					+ "4.insertAtPosition\n\t5.removeAtBegin\n\t6.removeAtEnd\n\t7.removeAtPosition\n"
					+ "\t8.removeWithMatchingNode\n\t9.Length of list.\n\t10.\n\t10.clear List\n\t"
					+ "11.getPosition\n\t12.exit\n" + "---Enter option");

			option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				System.out.println(cll.toString() + "\n\n");
				break;
			case 2:
				System.out.println("enter node data:");
				data = Integer.parseInt(br.readLine());
				node = new CLLNode(data);
				System.out.println(cll.insertAtBegin(node) + "\n\n");
				break;
			case 3:
				System.out.println("enter node data:");
				data = Integer.parseInt(br.readLine());
				node = new CLLNode(data);
				cll.insertAtEnd(node);
				System.out.println("inserted..\n\n");
				break;
			case 4:
				System.out.println("enter node data and position:");
				data = Integer.parseInt(br.readLine());
				position = Integer.parseInt(br.readLine());
				System.out.println(cll.insert(data, position) + "\n\n");
				break;
			case 5:

				System.out.println(cll.removeFromBegin() + "\n\n");
				break;
			case 6:

				System.out.println(cll.removeFromEnd() + "\n\n");
				break;
			case 7:
				System.out.println("enter position to remove:");
				position = Integer.parseInt(br.readLine());
				System.out.println(cll.removePosition(position) + "\n\n");
				break;
			case 8:
				System.out.println("enter data to remove(matching):");
				data = Integer.parseInt(br.readLine());
				node = new CLLNode(data);
				System.out.println(cll.removeMatched(data) + "\n\n");
				break;
			case 9:
				System.out.println(cll.getLength() + "\n\n");
				break;
			case 10:
				cll.clearList();
				System.out.println("list is cleared..");
				break;
			case 11:
				System.out.println("enter data to get Position:");// searching
				data = Integer.parseInt(br.readLine());
				// System.out.println(cll.getPosition(data));
				break;
			default:
				break;
			}
		} while (option != 12);
		System.out.println("exited");
	}
}

class CLLNode {

	private int data;
	CLLNode nextNode;

	public CLLNode(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CLLNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CLLNode nextNode) {
		this.nextNode = nextNode;
	}

}
