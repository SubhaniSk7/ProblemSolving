package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q590_NaryTreePostorderTraversal {
	ArrayList<Integer> result = new ArrayList<>();

	public List<Integer> postorder(Node root) {
		postOrder(root);
		return result;
	}

	public void postOrder(Node root) {
		if (root != null) {
			for (Node node : root.children)
				postOrder(node);
			result.add(root.val);
		}
	}
}

//class Node {
//	public int val;
//	public List<Node> children;
//
//	public Node() {
//	}
//
//	public Node(int _val) {
//		val = _val;
//	}
//
//	public Node(int _val, List<Node> _children) {
//		val = _val;
//		children = _children;
//	}
//}