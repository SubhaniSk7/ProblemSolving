package basics.LinkedLists;

public class CircularNode {

	private int data;
	CircularNode nextNode;

	public CircularNode(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CircularNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CircularNode nextNode) {
		this.nextNode = nextNode;
	}
}
