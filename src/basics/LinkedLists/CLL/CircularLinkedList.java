/**
 * @author subhani007
 *
 * 26-Jul-2018 7:58:26 PM
 */

package basics.LinkedLists.CLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularLinkedList implements CircularLinkedList_interface {

	int length;
	CLLNode tail;

	public CircularLinkedList() {
		length = 0;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public CLLNode getTail() {
		return tail;
	}

	public void setTail(CLLNode tail) {
		this.tail = tail;
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		CircularLinkedList sll = new CircularLinkedList();
		int choice, data, position, element, n;

		CLLNode nth;

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
				CLLNode nodeAtIndex = sll.getNodeAtIndex(position);
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
				CLLNode middleNode = sll.getMiddleNode();
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
		if (tail == null) {
			System.out.println("List is Empty.");
		} else {
			CLLNode temp = tail.getNext();
			while (temp != tail) {
				System.out.print(temp.getData() + "-->");
				temp = temp.getNext();
			}
			System.out.println(temp.getData() + "-->" + "NULL");
		}
	}

	@Override
	public void insertAtBegin(int data) {
		CLLNode newNode = new CLLNode(data);
		if (tail == null) {
			tail = newNode;
			tail.setNext(tail);
		} else {
			newNode.setNext(tail.getNext());
			tail.setNext(newNode);
		}
		length++;
	}

	@Override
	public void insertAtEnd(int data) {
		insertAtBegin(data);
		tail = tail.getNext();
	}

	@Override
	public void insertAtPosition(int data, int position) {
		CLLNode newNode = new CLLNode(data);
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (tail == null || position == 0) {// if empty list or position=0
			insertAtBegin(data);
		} else if (position == length) {
			insertAtEnd(data);
		} else {
			CLLNode temp = tail.getNext();
			for (int i = 1; i < position; i++) // here i=1 becz temp=tail initially
				temp = temp.next;
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			length++;
		}
	}

	@Override
	public void insertAfterElement(int data, int element) {
		CLLNode newNode = new CLLNode(data);
		if (tail == null) {// or length=0
			System.out.println("list is empty..inserting at tail");
			insertAtBegin(data);
		} else {
			boolean found = false;
			CLLNode temp = tail.getNext();
			int len = 0;
			while (temp.getData() != element && len < length) {
				temp = temp.getNext();
				len++;
			}
			if (temp.getData() == element)
				found = true;
			else
				found = false;

			if (found) {
				if (temp == tail)
					insertAtEnd(data);
				else {
					newNode.setNext(temp.getNext());
					temp.setNext(newNode);
					length++;
				}
			} else {
				System.out.println("element not found..inserting at end");
				insertAtEnd(data);//
			}
		}
	}

	@Override
	public void insertBeforeElement(int data, int element) {
		CLLNode newNode = new CLLNode(data);
		if (tail == null) {// or length=0
			System.out.println("list is empty..inserting at tail");
			insertAtBegin(data);
		} else {
			boolean found = false;
			CLLNode temp = tail.getNext(), prev = tail;
			int len = 0;
			while (temp.getData() != element && len < length) {
				prev = temp;
				temp = temp.getNext();
				len++;
			}
			if (temp.getData() == element)
				found = true;
			else
				found = false;

			if (found == true) {
				newNode.setNext(prev.getNext());
				prev.setNext(newNode);
				length++;
			} else {
				System.out.println("element not found..inserting at end");
				insertAtEnd(data);// here length++ will be in this function
			}
		}
	}

	@Override
	public void removeAtBegin() {
		if (tail == null) {
			System.out.println("list is empty..");
			return;
		} else if (tail.getNext() == tail) {
			tail = null;
		} else {
			CLLNode temp = tail.getNext();
			tail.setNext(temp.getNext());
			temp.setNext(null);
		}
		length--;
	}

	@Override
	public void removeAtEnd() {

		if (tail == null) {
			System.out.println("list is empty..");
			return;
		} else {
			CLLNode temp = tail;
			while (temp.getNext() != tail)
				temp = temp.getNext();
			if (temp == tail)
				tail = null;
			else {
				temp.setNext(tail.getNext());
				tail = temp;
			}
		}
		length--;
	}

	@Override
	public void removeAtPosition(int position) {

		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (tail == null) {
			System.out.println("list is empty..");
			return;
		} else if (position == 0)
			removeAtBegin();
		else if (position == length)
			removeAtEnd();
		else {
			CLLNode temp = tail.getNext();
			for (int i = 1; i < position; i++)
				temp = temp.getNext();
			if (temp.getNext() == tail)
				tail = temp;
			else
				temp.next = temp.next.next;
			length--;
		}
	}

	@Override
	public void removeAfterElement(int element) {
		if (tail == null) {
			System.out.println("List is empty..");
			return;
		}

		boolean found = false;
		CLLNode temp = tail.getNext();
		int len = 0;
		while (temp.getData() != element && len < length) {
			temp = temp.getNext();
			len++;
		}
		if (temp.getData() == element)
			found = true;
		else
			found = false;

		if (found) {
			if (temp == tail)
				removeAtBegin();
			else {
				temp.setNext(temp.getNext().getNext());
				length--;
			}
		} else
			System.out.println("element not found..");
	}

	@Override
	public void removeBeforeElement(int element) {
		if (tail == null) {
			System.out.println("List is empty..");
			return;
		} else if (tail.getNext().getData() == element)
			removeAtEnd();
		else if (tail.getNext().getNext().getData() == element) {//
			removeAtBegin();
		} else {
			boolean found = false;
			int len = 0;
			CLLNode previousNode = tail.getNext(), currentNode = tail.getNext().getNext(),
					nextNode = currentNode.getNext();
			while (len < length) {
				if (nextNode.getData() == element) {
					found = true;
					break;
				} else {
					previousNode = currentNode;
					currentNode = currentNode.getNext();
					nextNode = nextNode.getNext();
				}
				len++;
			}

			if (found) {
				previousNode.setNext(nextNode);
				length--;
			} else
				System.out.println("element not found..");
		}
	}

	@Override
	public void removeMatchingElement(int element) {
		if (tail == null) {
			System.out.println("list is empty..");
			return;
		}

		CLLNode temp = tail.getNext(), prev = tail;
		int len = 0;
		while (temp.getData() != element && len < length) {
			prev = temp;
			temp = temp.getNext();
			len++;
		}
		if (temp.getData() == element) {
			if (tail.getNext() == tail)
				tail = null;
			else {
				if (temp == tail)
					tail = prev;
				prev.next = prev.next.next;
			}
			temp.next = null;
			length--;
		}
	}

	@Override
	public CLLNode getNodeAtIndex(int index) {// returns first occurence index of the element
		if (index < 0 || index >= length) {
			System.out.println("index out of bound..");
			return null;
		}

		CLLNode nodeAtIndex = null;
		if (tail == null) {
			System.out.println("List is empty..");
			return nodeAtIndex;
		}

		nodeAtIndex = tail.getNext();
		for (int i = 1; i <= index; i++) // from i=1 to index becz i=0 is for 'tail'
			nodeAtIndex = nodeAtIndex.getNext();
		return nodeAtIndex;
	}

	@Override
	public boolean searchNode(int element) {
		boolean found = false;
		if (tail == null) {
			System.out.println("List is empty..");
			return found;
		}

		CLLNode temp = tail.getNext();
		int len = 0;
		while (len < length) {
			if (temp.getData() == element) {
				found = true;
				break;
			} else
				temp = temp.getNext();
			len++;
		}
		return found;
	}

	@Override
	public CLLNode getNthNodeFromBegin(int n) {
		if (n < 1 || n > length) {
			System.out.println("index out of bound..");
			return null;
		}

		CLLNode nth = null;
		if (tail == null) {
			System.out.println("List is empty..");
			return nth;
		}

		nth = tail.getNext();
		for (int i = 0; i < n - 1; i++) // till n-1 becz nth=tail is for 1st
			nth = nth.getNext();
		return nth;
	}

	@Override
	public CLLNode getNthNodeFromEnd(int n) {// with using length field
		if (n < 1 || n > length) {
			System.out.println("index out of bound..");
			return null;
		}

		CLLNode nth = null;
		if (tail == null) {
			System.out.println("List is empty..");
			return nth;
		}
		nth = tail.getNext();
		for (int i = 0; i < length - n; i++) // till n-1 becz nth=tail is for 1st
			nth = nth.getNext();
		return nth;
	}

	@Override
	public CLLNode getMiddleNode() {
		CLLNode middleNode = null;
		if (tail == null) {
			System.out.println("List is empty..");
			return middleNode;
		}

		CLLNode rabbit = tail.getNext(), tortoise = tail.getNext();
		int len = 0;
		while (len < length) {
			tortoise = tortoise.getNext();
			rabbit = rabbit.getNext().getNext();
			if (rabbit == tail.getNext() || rabbit == tail)
				break;
			len++;
		}
		middleNode = tortoise;
		return middleNode;
	}

	@Override
	public void clearList() {
		tail = null;
		length = 0;
	}
}