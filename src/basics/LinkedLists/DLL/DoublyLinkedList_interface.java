package basics.LinkedLists.DLL;

public interface DoublyLinkedList_interface {
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

	public DLLNode getNodeAtIndex(int index);

	public boolean searchNode(int element);

	public DLLNode getNthNodeFromBegin(int n);

	public DLLNode getNthNodeFromEnd(int n);

	public DLLNode getMiddleNode();

	public void clearList();

	public void printList();
}
