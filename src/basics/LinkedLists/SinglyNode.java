package basics.LinkedLists;

public class SinglyNode {
	private int data;
	SinglyNode next;

	public SinglyNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SinglyNode getNext() {
		return next;
	}

	public void setNext(SinglyNode nextNode) {
		this.next = nextNode;
	}
}