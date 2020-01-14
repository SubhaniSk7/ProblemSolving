// Singly LinkedList Node

package basics.LinkedLists.SLL;

public class SLLNode {

	int data;
	SLLNode next;

	public SLLNode(int data) {
		this.data = data;
		this.next = null;
	}

//	public SLLNode(int data, SLLNode next) {
//		this.data = data;
//		this.next = next;
//	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SLLNode getNext() {
		return next;
	}

	public void setNext(SLLNode next) {
		this.next = next;
	}
}
