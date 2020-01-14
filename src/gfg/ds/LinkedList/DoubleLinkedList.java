package gfg.ds.LinkedList;

import java.util.Scanner;

public class DoubleLinkedList {

	private int length;
	public DLLNode head;
	public DLLNode tail;

	public DoubleLinkedList() {
		length = 0;
		head = new DLLNode(Integer.MIN_VALUE, null, null);
		tail = new DLLNode(Integer.MIN_VALUE, head, null);
		head.setNextNode(tail);
	}

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int option;
		DoubleLinkedList dll = new DoubleLinkedList();
		do {
			System.out.println("\t1.getLength()" + "\n\t2.forwardPrint()" + "\n\t3.backwardPrint()"
					+ "\n\t4.getPosition(data)" + "\n\t5.insert(newValue) to head" + "\n\t6.insert(data,position)"
					+ "\n\t7.insertBeforeTail()" + "\n\t8.remove(position)" + "\n\t9.removeMatched(node)"
					+ "\n\t10.removeHead()" + "\n\t11.removeTail()" + "\n\t12." + "");
			System.out.println("enter option:");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("length:" + dll.getLength());
				break;
			case 2:
				System.out.println(dll.forwardPrint());
				break;
			case 3:
				System.out.println(dll.backwardPrint());
				break;
			case 4:
				System.out.println("enter data to getPosition(data):");
				int getDataPosition = sc.nextInt();
				System.out.println(dll.getPosition(getDataPosition));
				break;
			case 5:
				System.out.println("enter data to insert to head:");
				int newValue = sc.nextInt();
				dll.insert(newValue);
				break;
			case 6:
				System.out.println("enter data to create newNode & position:");
				int newNodeData = sc.nextInt();
				int index = sc.nextInt();
				dll.insertAtPosition(newNodeData, index);
				break;
			case 7:
				System.out.println("enter data to insert before tail:");
				int newData = sc.nextInt();
				dll.insertBeforeTail(newData);
				break;
			case 8:
				System.out.println("enter position to remove Node:");
				int removePosition = sc.nextInt();
				dll.remove(removePosition);
				break;
			case 9:
				System.out.println("removeMatchedData() & enter data:");
				int removeData = sc.nextInt();
				DLLNode removeMatchedData = new DLLNode(removeData);
				dll.removeMatched(removeMatchedData);
				break;
			case 10:
				dll.removeHead();
				break;
			case 11:
				// dll.removeTail();
				break;

			default:
				break;
			}
		} while (option != 13);
	}

	public int getLength() {
		return length;
	}

	public String forwardPrint() {
		String result = "[";
		if (length == 0) {
			return result + "]";
		}
		DLLNode temp = head;
		while (temp != null) {
			result += "," + temp.getData();
			temp = temp.getNextNode();
		}
		return result + "]";
	}

	public String backwardPrint() {
		String result = "[";
		if (length == 0) {
			return result + "]";
		}
		DLLNode temp = tail;
		while (temp != null) {
			result += "," + temp.getData();
			temp = temp.getPrevNode();
		}
		return result + "]";
	}

	public int getPosition(int data) {

		DLLNode temp = head;
		int position = 0;
		while (temp != null) {
			if (temp.getData() == data) {
				return position;
			}
			temp = temp.getNextNode();
			position++;
		}
		return Integer.MIN_VALUE;
	}

	public void insert(int newValue) {

		DLLNode newNode = new DLLNode(newValue, null, head.getNextNode());
		newNode.getNextNode().setPrevNode(newNode);
		head = newNode;
		length++;
	}

	public void insertAtPosition(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;
		if (head == null) {
			head = new DLLNode(data, null, null);
			tail = head;
		}

		if (position == 0) {
			DLLNode newNode = new DLLNode(data);
			newNode.setNextNode(head);// newNode.next=head;
			newNode.getNextNode().setPrevNode(newNode);
			head = newNode;
		} else {

			DLLNode temp = head;
			int i;
			for (i = 0; i < position; i++) {
				temp = temp.getNextNode();
			}
			DLLNode newNode = new DLLNode(data);
			newNode.nextNode = temp.nextNode;
			newNode.prevNode = temp;
			newNode.nextNode.prevNode = newNode;
			temp.nextNode = newNode;
		}
		length++;
	}

	private void insertBeforeTail(int newValue) {
		DLLNode newNode = new DLLNode(newValue, tail.getPrevNode(), tail);
		tail.getPrevNode().setNextNode(newNode);
		tail.setPrevNode(newNode);
		length++;
	}

	private void remove(int position) {
		if (position < 0)
			position = 0;
		if (position >= length)
			position = length;
		if (head == null) {
			return;
		}
		if (position == 0) {
			head = head.getNextNode();
			if (head == null)
				tail = null;
		} else {
			DLLNode temp = head;
			int i;
			for (i = 1; i < position; i++) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(temp.getNextNode().getNextNode());
			temp.getNextNode().getNextNode().setPrevNode(temp);
		}
		length--;
	}

	public void removeMatched(DLLNode node) {
		if (head == null) {
			return;
		}
		if (node.equals(head)) {
			head = head.getNextNode();
			if (head == null)
				tail = null;
			length--;
			return;
		}
		DLLNode p = head;

		while (p != null) {
			if (node.equals(p)) {
				p.prevNode.nextNode = p.nextNode;
				p.nextNode.prevNode = p.prevNode;
				length--;
				return;
			}
		}

	}

	public void removeHead() {
		if (length == 0 || head == null)
			return;
		DLLNode temp = head.getNextNode();
		temp.getNextNode().setPrevNode(temp);
		head = temp;
		length--;
	}

	// public void removeTail() {
	// if (length == 0 || head == null)
	// return;
	// DLLNode temp=tail.getPrevNode();
	// temp.setPre
	// }
}

class DLLNode {
	private int data;
	DLLNode nextNode;
	DLLNode prevNode;

	public DLLNode(int data) {
		this.data = data;
		this.nextNode = null;
		this.prevNode = null;
	}

	public DLLNode(int data, DLLNode nextNode, DLLNode prevNode) {
		this.data = data;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}

	public int getData() {
		return data;
	}

	public DLLNode getNextNode() {
		return nextNode;
	}

	public DLLNode getPrevNode() {
		return prevNode;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNextNode(DLLNode nextNode) {
		this.nextNode = nextNode;
	}

	public void setPrevNode(DLLNode prevNode) {
		this.prevNode = prevNode;
	}

}