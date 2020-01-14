// Singly LinkedList Node

package basics.Queues;

public class SLLNode {

	int data;
	SLLNode next;

	public SLLNode(int data) {
		this.data = data;
		this.next = null;
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

	public void setNext(SLLNode next) {
		this.next = next;
	}
}
