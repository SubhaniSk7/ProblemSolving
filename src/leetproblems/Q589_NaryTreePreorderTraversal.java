package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q589_NaryTreePreorderTraversal {
	ArrayList<Integer> result = new ArrayList<>();

	public List<Integer> preorder(Node root) {
		preOrder(root);
		return result;
	}

	public void preOrder(Node root) {
		if (root != null) {
			result.add(root.val);
			for (Node node : root.children) {
				preOrder(node);
			}
		}
	}
}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}