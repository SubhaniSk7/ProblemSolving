/**
 * @author subhani007
 *
 * 26-Jul-2018 7:58:26 PM
 */

package basics.LinkedLists.SLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SinglyLinkedList implements SinglyLinkedList_interface {

	int length;
	SLLNode head;

	public SinglyLinkedList() {
		length = 0;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public SLLNode getHead() {
		return head;
	}

	public void setHead(SLLNode head) {
		this.head = head;
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		SinglyLinkedList sll = new SinglyLinkedList();
		int choice, data, position, element, n;

		SLLNode nth;

		do {
			System.out.println("\t1.print List\n\t2.insertAtBegin\t\t\t3.insertAtEnd\n\t"
					+ "4.insertAtPosition\t\t5.insertAfterElement\t\t6.insertBeforeElement\n\t"
					+ "------------------------\n\t" + "7.removeAtBegin\t\t\t"
					+ "8.removeAtEnd\t\t\t9.removeAtPosition.\n\t10.removeAfterElement\t\t"
					+ "11.removeBeforeElement\t\t12.removeMatchingElement\n\t" + "------------------------\n\t"
					+ "13.getNodeAtIndex\t\t\t14.searchNode\n\t" + "------------------------\n\t"
					+ "15.getNthNodeFromBegin\t\t16.getNthNodeFromEnd\t\t17.getMiddleNode\n\t"
					+ "------------------------\n\t" + "18.lengthOfList\t\t\t19.clearList\n\t"
					+ "------------------------\n\t" + "20.exit\n" + "enter choice:");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:// printList
				sll.printList();
				break;
			case 2:// insertAtBegin
				System.out.println("enter data to insert at begin:");
				data = Integer.parseInt(br.readLine());
				sll.insertAtBegin(data);
				break;
			case 3:// insertAtEnd
				System.out.println("enter data to insert at end:");
				data = Integer.parseInt(br.readLine());
				sll.insertAtEnd(data);
				break;
			case 4:// insertAtPosition
				System.out.println("enter data:");
				data = Integer.parseInt(br.readLine());
				System.out.println("enter index:");
				position = Integer.parseInt(br.readLine());
				sll.insertAtPosition(data, position);
				break;
			case 5:// insertAfterElement
				System.out.println("enter data:");
				data = Integer.parseInt(br.readLine());
				System.out.println("insert after element:");
				element = Integer.parseInt(br.readLine());
				sll.insertAfterElement(data, element);
				break;
			case 6:// insertBeforeElement
				System.out.println("enter data:");
				data = Integer.parseInt(br.readLine());
				System.out.println("insert before element:");
				element = Integer.parseInt(br.readLine());
				sll.insertBeforeElement(data, element);
				break;
			case 7:// removeAtBegin
				System.out.println("remove at begin..");
				sll.removeAtBegin();
				break;
			case 8:// removeAtEnd
				System.out.println("remove at end..");
				sll.removeAtEnd();
				break;
			case 9:// removeAtPosition
				System.out.println("enter index of element to remove:");
				position = Integer.parseInt(br.readLine());
				sll.removeAtPosition(position);
				break;
			case 10:// removeAfterElement
				System.out.println("remove after element:");
				element = Integer.parseInt(br.readLine());
				sll.removeAfterElement(element);
				break;
			case 11:// removeBeforeElement
				System.out.println("remove before element:");
				element = Integer.parseInt(br.readLine());
				sll.removeBeforeElement(element);
				break;
			case 12:// removeMatchingElement
				System.out.println("remove matching element:");
				element = Integer.parseInt(br.readLine());
				sll.removeMatchingElement(element);
				break;
			case 13:// getNodeAtPosition
				System.out.println("get node at index:");
				position = Integer.parseInt(br.readLine());
				SLLNode nodeAtIndex = sll.getNodeAtIndex(position);
				if (nodeAtIndex != null)
					System.out.println("Node at Index-" + position + " is :" + nodeAtIndex.getData());
				break;
			case 14:// searchNode
				System.out.println("element to search:");
				element = Integer.parseInt(br.readLine());
				boolean found = sll.searchNode(element);
				if (found == true)
					System.out.println("Found.");
				else
					System.out.println("Not Found.");
				break;
			case 15:// getNthNodeFromBegin
				System.out.println("get nth node from begin:");
				n = Integer.parseInt(br.readLine());
				nth = sll.getNthNodeFromBegin(n);
				if (nth != null)
					System.out.println("nth Node from Begin is :" + nth.getData());
				break;
			case 16:// getNthNodeFromEnd
				System.out.println("get nth node from end:");
				n = Integer.parseInt(br.readLine());
				nth = sll.getNthNodeFromEnd(n);
				if (nth != null)
					System.out.println("nth Node from End is :" + nth.getData());
				break;
			case 17:// getMiddleNode
				SLLNode middleNode = sll.getMiddleNode();
				if (middleNode != null)
					System.out.println("Middle Node is :" + middleNode.getData());
				break;
			case 18:// lengthOfList
				System.out.println("List length: " + sll.getLength());
				break;
			case 19:// clearList
				sll.clearList();
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
	public void printList() {
		if (head == null) {
			System.out.println("List is Empty.");
		} else {
			SLLNode temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + "-->");
				temp = temp.getNext();
			}
			System.out.println("NULL");
		}
	}

	@Override
	public void insertAtBegin(int data) {
		SLLNode newNode = new SLLNode(data);
		newNode.setNext(head);
		head = newNode;
		length++;
	}

	@Override
	public void insertAtEnd(int data) {
		SLLNode newNode = new SLLNode(data);
		if (head == null) {
			head = newNode;
		} else {
			SLLNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		length++;
	}

	@Override
	public void insertAtPosition(int data, int position) {
		SLLNode newNode = new SLLNode(data);
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (head == null)
			head = newNode;
		else if (position == 0) {
			newNode.setNext(head);
			head = newNode;
		} else {
			SLLNode temp = head;
			for (int i = 1; i < position; i++) // here i=1 becz temp=head initially
				temp = temp.next;

			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length++;
	}

	@Override
	public void insertAfterElement(int data, int element) {
		SLLNode newNode = new SLLNode(data);
		if (head == null) {// or length=0
			System.out.println("list is empty..inserting at head");
			head = newNode;
			// or insertAtBegin(data); then remove length++
			length++;
		} else {
			boolean found = false;
			SLLNode temp = head;
			while (temp != null) {
				if (temp.getData() == element) {
					found = true;
					break;
				} else
					temp = temp.getNext();
			}
			if (found == true) {
				newNode.setNext(temp.getNext());
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
		SLLNode newNode = new SLLNode(data);
		if (head == null) {// or length=0
			System.out.println("list is empty..inserting at head");
			head = newNode;

			length++;// I wrote becz insertAtEnd() if element not found in else
			// or insertAtBegin(data); then remove length++
		} else if (head.getData() == element) {
			newNode.setNext(head);
			head = newNode;

			// or insertAtBegin(data); then remove length++
			length++;
		} else {
			boolean found = false;
			SLLNode temp = head;
			while (temp.getNext() != null) {
				if (temp.getNext().getData() == element) {
					found = true;
					break;
				} else
					temp = temp.getNext();
			}
			if (found == true) {
				newNode.setNext(temp.getNext());
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
		SLLNode temp = head;
		if (head == null)
			System.out.println("list is empty..");
		else if (head.getNext() != null) {
			head = temp.getNext();
			temp.setNext(null);
			length--;
		} else {
			head = null;
			length--;
		}
	}

	@Override
	public void removeAtEnd() {

		if (head == null) {
			System.out.println("list is empty..");
			return;
		}
		SLLNode temp = head;
		if (head.getNext() == null) {
			while (temp.getNext().getNext() != null)
				temp = temp.getNext();
			temp.setNext(null);

			// SLLNode p = head, previousNode = null;
			// while ((next = p.getNext()) != null) {
			// previousNode = p;
			// p = next;
			// }
			// previousNode.setNext(null);
		} else {
			head = null;
		}
		length--;
	}

	@Override
	public void removeAtPosition(int position) {

		if (position < 0)
			position = 0;
		if (position >= length)
			position = length;

		if (head == null)
			return;
		else if (position == 0)
			head = head.getNext();
		else {
			SLLNode temp = head;
			for (int i = 1; i < position - 1; i++) // i=1 becz already temp=head i.e., i=0; and position is not 0 and traverse i till position-1 i.e., before index
				temp = temp.getNext();

			if (temp.getNext() != null)
				temp.setNext(temp.getNext().getNext());
			else
				temp.setNext(null);
		}
		length--;
	}

	@Override
	public void removeAfterElement(int element) {
		if (head == null) {
			System.out.println("List is empty..");
			return;
		}

		SLLNode temp = head;
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
				temp.setNext(temp.getNext().getNext());
				length--;
			} else
				System.out.println("No element after element..");
		} else
			System.out.println("element not found..");
	}

	@Override
	public void removeBeforeElement(int element) {
		if (head == null) // or length=0
			System.out.println("list is empty..inserting at head");
		else if (head.getData() == element)
			System.out.println("no node before element.");
		else if (head.getNext().getData() == element) {//
			SLLNode temp = head;
			head = head.getNext();
			temp.setNext(null);
			length--;
		} else {
			boolean found = false;
			SLLNode previousNode = head, currentNode = head.getNext(), nextNode = currentNode.getNext();
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
			SLLNode temp = head;
			while (temp.getNext() != null) {
				if (temp.getNext().getData() == element) {
					found = true;
					break;
				} else
					temp = temp.getNext();
			}
			if (found == true) {
				temp.setNext(temp.getNext().getNext());
				length--;
			} else
				System.out.println("element not found..");
		}
	}

	@Override
	public SLLNode getNodeAtIndex(int index) {// returns first occurence index of the element
		if (index < 0 || index >= length) {
			System.out.println("index out of bound..");
			return null;
		}

		SLLNode nodeAtIndex = null;
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

		SLLNode temp = head;
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
	public SLLNode getNthNodeFromBegin(int n) {
		if (n < 1 || n > length) {
			System.out.println("index out of bound..");
			return null;
		}

		SLLNode nth = null;
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
	public SLLNode getNthNodeFromEnd(int n) {// with using length field
		if (n < 1 || n > length) {
			System.out.println("index out of bound..");
			return null;
		}

		SLLNode nth = null;
		if (head == null) {
			System.out.println("List is empty..");
			return nth;
		}
		nth = head;
		for (int i = 0; i < length - n; i++) // till n-1 becz nth=head is for 1st
			nth = nth.getNext();
		return nth;
	}

	@Override
	public SLLNode getMiddleNode() {// without using length otherwise traverse till ceil(length/2)+1
		// if even number of nodes i.e., 6 nodes return 4th node i.e., return length/2+1
		// for odd number of nodes i.e.,return ceil(length/2)-1 or floor(length/2)+1
		// both are same for odd number of nodes;

		SLLNode middleNode = null;
		if (head == null) {
			System.out.println("List is empty..");
			return middleNode;
		}

		SLLNode rabbit = head, tortoise = head;
		while (rabbit != null && rabbit.getNext() != null) {
			tortoise = tortoise.getNext();
			rabbit = rabbit.getNext().getNext();
		}
		middleNode = tortoise;
		return middleNode;
	}

	@Override
	public void clearList() {
		head = null;
		length = 0;
	}
}
