package basics.LinkedLists.SLL;

public interface SinglyLinkedList_interface {

	public void insertAtBegin(int data);

	public void insertAtEnd(int data);

	public void insertAtPosition(int data, int position);

	public void insertAfterElement(int data, int element);

	public void insertBeforeElement(int data, int element);

	public void removeAtBegin();

	public void removeAtEnd();

	public void removeAtPosition(int position);

	public void removeAfterElement(int element);

	public void removeBeforeElement(int element);

	public void removeMatchingElement(int element);

	public SLLNode getNodeAtIndex(int element);

	public boolean searchNode(int element);

	public SLLNode getNthNodeFromBegin(int n);

	public SLLNode getNthNodeFromEnd(int n);

	public SLLNode getMiddleNode();

	public void clearList();

	public void printList();
}
