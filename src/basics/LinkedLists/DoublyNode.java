package basics.LinkedLists;

public class DoublyNode {
	private int data;
	DoublyNode nextNode;
	DoublyNode prevNode;

	public DoublyNode(int data) {
		super();
		this.data = data;
		this.nextNode = null;
		this.prevNode = null;
	}

	public DoublyNode(int data, DoublyNode nextNode, DoublyNode prevNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoublyNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DoublyNode prevNode) {
		this.prevNode = prevNode;
	}

}