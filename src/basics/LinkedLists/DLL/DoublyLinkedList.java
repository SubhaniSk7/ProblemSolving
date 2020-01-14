package basics.LinkedLists.DLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import basics.LinkedLists.SLL.SLLNode;

public class DoublyLinkedList implements DoublyLinkedList_interface {

	int length;
	DLLNode head, tail;

	public DoublyLinkedList() {
		length = 0;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public DLLNode getHead() {
		return head;
	}

	public void setHead(DLLNode head) {
		this.head = head;
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DoublyLinkedList dll = new DoublyLinkedList();
		int choice, data, position, element, n;

		DLLNode nth;
		do {
			System.out.println("\t1.print List\n\t2.insertAtBegin\t\t\t3.insertAtEnd\n\t"
					+ "4.insertAtPosition\t\t5.insertAfterElement\t\t6.insertBeforeElement\n\t"
					+ "------------------------\n\t" + "7.removeAtBegin\t\t\t"
					+ "8.removeAtEnd\t\t\t9.removeAtPosition.\n\t10.removeAfterElement\t\t"
					+ "11.removeBeforeElement\t\t12.removeMatchingElement\n\t" + "------------------------\n\t"
					+ "13.getNodeAtIndex\t\t14.searchNode\n\t" + "------------------------\n\t"
					+ "15.getNthNodeFromBegin\t\t16.getNthNodeFromEnd\t\t17.getMiddleNode\n\t"
					+ "------------------------\n\t" + "18.lengthOfList\t\t\t19.clearList\n\t"
					+ "------------------------\n\t" + "20.exit\n" + "enter choice:");

			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:// printList
				dll.printList();
				System.out.println("List length: " + dll.getLength());
				break;
			case 2:// insertAtBegin
				System.out.println("enter data to insert at begin:");
				data = Integer.parseInt(br.readLine());
				dll.insertAtBegin(data);
				break;
			case 3:// insertAtEnd
				System.out.println("enter data to insert at end:");
				data = Integer.parseInt(br.readLine());

				dll.insertAtEnd(data);
				break;
			case 4:// insertAtPosition
				System.out.println("enter data:");
				data = Integer.parseInt(br.readLine());
				System.out.println("enter index:");
				position = Integer.parseInt(br.readLine());

				dll.insertAtPosition(data, position);
				break;
			case 5:// insertAfterElement
				System.out.println("enter data:");
				data = Integer.parseInt(br.readLine());
				System.out.println("insert after element:");
				element = Integer.parseInt(br.readLine());

				dll.insertAfterElement(data, element);
				break;
			case 6:
				// insertBeforeElement
				System.out.println("enter data:");
				data = Integer.parseInt(br.readLine());
				System.out.println("insert before element:");
				element = Integer.parseInt(br.readLine());

				dll.insertBeforeElement(data, element);

				break;
			case 7:
				// removeAtBegin
				System.out.println("remove at begin..");
				dll.removeAtBegin();

				break;
			case 8:
				// removeAtEnd
				System.out.println("remove at end..");
				dll.removeAtEnd();

				break;
			case 9:
				// removeAtPosition
				System.out.println("enter index of element to remove:");
				position = Integer.parseInt(br.readLine());

				dll.removeAtPosition(position);

				break;
			case 10:
				// removeAfterElement
				System.out.println("remove after element:");
				element = Integer.parseInt(br.readLine());
				dll.removeAfterElement(element);

				break;
			case 11:
				// removeBeforeElement
				System.out.println("remove before element:");
				element = Integer.parseInt(br.readLine());
				dll.removeBeforeElement(element);

				break;
			case 12:
				// removeMatchingElement
				System.out.println("remove matching element:");
				element = Integer.parseInt(br.readLine());

				dll.removeMatchingElement(element);
				break;
			case 13:
				// getNodeAtPosition
				System.out.println("get node at index:");
				position = Integer.parseInt(br.readLine());
				DLLNode nodeAtIndex = dll.getNodeAtIndex(position);
				if (nodeAtIndex != null)
					System.out.println("Node at Index-" + position + " is :" + nodeAtIndex.getData());
				break;
			case 14:
				// searchNode
				System.out.println("element to search:");
				element = Integer.parseInt(br.readLine());

				boolean found = dll.searchNode(element);
				if (found == true)
					System.out.println("Found.");
				else
					System.out.println("Not Found.");
				break;
			case 15:// getNthNodeFromBegin
				System.out.println("get nth node from begin:");
				n = Integer.parseInt(br.readLine());
				nth = dll.getNthNodeFromBegin(n);
				if (nth != null)
					System.out.println("nth Node from Begin is :" + nth.getData());
				break;
			case 16:// getNthNodeFromEnd
				System.out.println("get nth node from end:");
				n = Integer.parseInt(br.readLine());
				nth = dll.getNthNodeFromEnd(n);
				if (nth != null)
					System.out.println("nth Node from End is :" + nth.getData());
				break;
			case 17:// getMiddleNode
				DLLNode middleNode = dll.getMiddleNode();
				if (middleNode != null)
					System.out.println("Middle Node is :" + middleNode.getData());
				break;
			case 18:// lengthOfList
				System.out.println("List length: " + dll.getLength());
				break;
			case 19:// clearList
				dll.clearList();
				break;
			case 20:// exit
				System.out.println("bye bye..");
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice..");
				break;
			}
		} while (choice != 20);
	}

	@Override
	public void insertAtBegin(int data) {
		DLLNode newNode = new DLLNode(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
		}
		length++;
	}

	@Override
	public void insertAtEnd(int data) {
		DLLNode newNode = new DLLNode(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
		length++;
	}

	@Override
	public void insertAtPosition(int data, int position) {
		DLLNode newNode = new DLLNode(data);

		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null) {
			head = tail = newNode;
			length++;
		} else if (position == 0) {
			insertAtBegin(data);
		} else if (position == length) {
			insertAtEnd(data);
		} else {
			DLLNode temp = head;
			for (int i = 1; i < position; i++) // here i=1 becz temp=head initially
				temp = temp.next;
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);
			temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
			length++;
		}
	}

	@Override
	public void insertAfterElement(int data, int element) {

		DLLNode newNode = new DLLNode(data);
		if (head == null) {// or length=0
			System.out.println("list is empty..inserting at head");
			insertAtBegin(data);
		} else {
			boolean found = false;
			DLLNode temp = head;
			while (temp != null) {
				if (temp.getData() == element) {
					found = true;
					break;
				} else
					temp = temp.getNext();
			}
			if (found == true) {
				newNode.setNext(temp.getNext());
				newNode.setPrev(temp);
				if (temp.getNext() != null)
					temp.getNext().setPrev(newNode);
				temp.setNext(newNode);
				length++;
			} else {
				System.out.println("element not found..inserting at end");
				insertAtEnd(data);//
			}
		}
	}

	@Override
	public void insertBeforeElement(int data, int element) {
		DLLNode newNode = new DLLNode(data);
		if (head == null) {// or length=0
			System.out.println("list is empty..inserting at head");
			insertAtBegin(data);
		} else if (head.getData() == element) {
			insertAtBegin(data);
		} else {
			boolean found = false;
			DLLNode temp = head;
			while (temp.getNext() != null) {
				if (temp.getNext().getData() == element) {
					found = true;
					break;
				} else
					temp = temp.getNext();
			}
			if (found == true) {
				newNode.setNext(temp.getNext());
				newNode.setPrev(temp);
				if (temp.getNext() != null)
					temp.getNext().setPrev(newNode);
				temp.setNext(newNode);
				length++;
			} else {
				System.out.println("element not found..inserting at end");
				insertAtEnd(data);// here length++ will be in this function
			}
		}
	}

	@Override
	public void removeAtBegin() {
		if (head == null)
			System.out.println("list is empty..");
		DLLNode temp = head;
		if (head.getNext() != null) {
			head = temp.getNext();
			head.setPrev(null);
			temp.setNext(null);
		} else {
			head = null;
			tail = null;
		}
		length--;
	}

	@Override
	public void removeAtEnd() {
		if (head == null) {
			System.out.println("list is empty..");
			return;
		}

		DLLNode temp = head;
		if (head.getNext() != null) {
			while (temp.getNext().getNext() != null)
				temp = temp.getNext();
			temp.getNext().setPrev(null);
			temp.setNext(null);
			tail = temp;
		} else {
			head = null;
			tail = null;
		}
		length--;
	}

	@Override
	public void removeAtPosition(int position) {

		if (position < 0)
			position = 0;
		if (position >= length)
			position = length - 1;

		if (head == null)
			return;
		else if (position == 0) {
			head = head.getNext();
			if (head == null)
				tail = null;
		} else {
			DLLNode temp = head;
			for (int i = 1; i < position - 1; i++) // i=1 becz already temp=head i.e., i=0; and position is not 0 and traverse i till position-1 i.e., before index
				temp = temp.getNext();

			if (temp.getNext() != tail) {
				temp.getNext().setPrev(null);
				temp.setNext(temp.getNext().getNext());
				temp.getNext().setPrev(temp);
			} else {
				tail = temp;
				tail.setNext(null);
			}
		}
		length--;
	}

	@Override
	public void removeAfterElement(int element) {

		if (head == null) {
			System.out.println("List is empty..");
			return;
		}

		DLLNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.getData() == element) {
				found = true;
				break;
			} else
				temp = temp.getNext();
		}

		if (found) {
			if (temp.getNext() != null) {
				if (temp.getNext() == tail) {
					tail = temp;
					tail.setNext(null);
				} else {
					temp.getNext().setPrev(null);
					temp.setNext(temp.getNext().getNext());
					temp.getNext().setPrev(temp);
				}
				length--;

			} else
				System.out.println("No element after element..");
		} else
			System.out.println("element not found..");
	}

	@Override
	public void removeBeforeElement(int element) {

		if (head == null)
			System.out.println("list is empty..inserting at head");
		else if (head.getData() == element)
			System.out.println("no node before element.");
		else if (head.getNext().getData() == element) {//
			DLLNode temp = head;
			head = head.getNext();
			temp.setNext(null);
			length--;
		} else {
			boolean found = false;
			DLLNode previousNode = head, currentNode = head.getNext(), nextNode = currentNode.getNext();
			while (nextNode != null) {
				if (nextNode.getData() == element) {
					found = true;
					break;
				} else {
					previousNode = currentNode;
					currentNode = currentNode.getNext();
					nextNode = nextNode.getNext();
				}
			}
			if (found == true) {
				previousNode.setNext(nextNode);
				previousNode.getNext().setPrev(previousNode);
				length--;
			} else
				System.out.println("element not found..");
		}

	}

	@Override
	public void removeMatchingElement(int element) {

		if (head == null) {
			System.out.println("list is empty..");
			return;
		}

		if (head.getData() == element) {
			head = head.getNext();
			length--;
		} else {
			boolean found = false;
			DLLNode temp = head;
			while (temp.getNext() != null) {
				if (temp.getNext().getData() == element) {
					found = true;
					break;
				} else
					temp = temp.getNext();
			}
			if (found == true) {
				if (temp.getNext().getNext() != null) {
					temp.setNext(temp.getNext().getNext());
					temp.getNext().setPrev(temp);
				} else {// i.e., temp.next is tail
					tail = temp;
					tail.setNext(null);
				}
				length--;
			} else
				System.out.println("element not found..");
		}

	}

	@Override
	public DLLNode getNodeAtIndex(int index) {// returns first occurence index of the element
		if (index < 0 || index >= length) {
			System.out.println("index out of bound..");
			return null;
		}

		DLLNode nodeAtIndex = null;
		if (head == null) {
			System.out.println("List is empty..");
			return nodeAtIndex;
		}

		nodeAtIndex = head;
		for (int i = 1; i <= index; i++) // from i=1 to index becz i=0 is for 'head'
			nodeAtIndex = nodeAtIndex.getNext();
		return nodeAtIndex;
	}

	@Override
	public boolean searchNode(int element) {
		boolean found = false;
		if (head == null) {
			System.out.println("List is empty..");
			return found;
		}

		DLLNode temp = head;
		while (temp != null) {
			if (temp.getData() == element) {
				found = true;
				break;
			} else
				temp = temp.getNext();
		}
		return found;
	}

	@Override
	public DLLNode getNthNodeFromBegin(int n) {
		if (n < 1 || n > length) {
			System.out.println("index out of bound..");
			return null;
		}

		DLLNode nth = null;
		if (head == null) {
			System.out.println("List is empty..");
			return nth;
		}
		nth = head;
		for (int i = 0; i < n - 1; i++) // till n-1 becz nth=head is for 1st
			nth = nth.getNext();
		return nth;
	}

	@Override
	public DLLNode getNthNodeFromEnd(int n) {// with using length field
		if (n < 1 || n > length) {
			System.out.println("index out of bound..");
			return null;
		}

		DLLNode nth = null;
		if (head == null) {
			System.out.println("List is empty..");
			return nth;
		}
		nth = head;
		for (int i = 0; i < length - n; i++) // till n-1 becz nth=head is for 1st
			nth = nth.getNext();
		return nth;

//		or set nth=tail and traverse from end using prev pointer
	}

	@Override
	public DLLNode getMiddleNode() {// without using length otherwise traverse till ceil(length/2)+1
		// if even number of nodes i.e., 6 nodes return 4th node i.e., return length/2+1
		// for odd number of nodes i.e.,return ceil(length/2)-1 or floor(length/2)+1
		// both are same for odd number of nodes;

		DLLNode middleNode = null;
		if (head == null) {
			System.out.println("List is empty..");
			return middleNode;
		}

		DLLNode rabbit = head, tortoise = head;
		while (rabbit != null && rabbit.getNext() != null) {
			tortoise = tortoise.getNext();
			rabbit = rabbit.getNext().getNext();
		}
		middleNode = tortoise;
		return middleNode;

//		or traverse from both ends like forward,backward directions and when forward==backward return it or when forward crosses backward return forward node
	}

	@Override
	public void clearList() {
		head = null;
		tail = null;
		length = 0;
	}

	@Override
	public void printList() {// like SinglyLinkedList
		if (head == null)
			System.out.println("List is Empty.");
		else {
			DLLNode temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + "-->");
				temp = temp.getNext();
			}
			System.out.println("NULL");
			System.out.println("\nhead:" + head.getData() + "\ttail:" + tail.getData());
		}
	}
}
