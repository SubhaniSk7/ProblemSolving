package gfg.ds.BinaryTrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {
	TreeNode root;

	public Tree() {
		super();
		this.root = null;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void insert(int data) {
		TreeNode newNode = new TreeNode(data);
		newNode.setLeft(null);
		newNode.setRight(null);
		if (root == null) {
			root = newNode;
			return;
		} else {

			TreeNode current = root;
			while (true) {
				TreeNode prev = current;

				if (data <= current.getData()) {
					current = current.getLeft();
					if (current == null) {
						prev.setLeft(newNode);
						break;
					}
				} else {
					current = current.getRight();
					if (current == null) {
						prev.setRight(newNode);
						break;
					}
				}
			}
		}
	}

	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}

	public static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}

	public boolean search(TreeNode root, int data) {
		boolean found = false;
		while (root != null && found == false) {
			if (data == root.getData()) {
				found = true;
				break;
			} else if (data < root.getData())
				root = root.getLeft();
			else
				root = root.getRight();
		}
		return found;
	}

	public int height(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int lstHeight = height(root.getLeft());
			int rstheight = height(root.getLeft());
			if (lstHeight > rstheight)
				return lstHeight + 1;
			else
				return rstheight + 1;
		}
	}

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		Tree tree = new Tree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), i, value;

		for (i = 0; i < n; i++) {
			value = Integer.parseInt(br.readLine());
			tree.insert(value);
		}
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
	}
}
