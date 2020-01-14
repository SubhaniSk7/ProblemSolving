package basics.BST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {
	static TreeNode root;

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		Tree tree = new Tree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("\n\n********************************\n\t1.isEmpty\n\t" + "2.Print Tree(Traversals)\n\t"
					+ "3.Insert\n\t" + "4.Update\n\t" + "5.Delete\n\t" + "6.Search\n\t" + "7.Height of Tree\n\t"
					+ "8.\n\t" + "20.exit\n" + "********************************enter choice:");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:// isEmpty
				System.out.println("isEmpty:" + tree.isEmpty());
				break;
			case 2:
				TreeTraversals traverse = new TreeTraversals();
				System.out.println();
				System.out.println("InOrder:");
				traverse.inOrder(root);

				System.out.println();
				System.out.println("PreOrder:");
				traverse.preOrder(root);

				System.out.println();
				System.out.println("PostOrder:");
				traverse.postOrder(root);
				break;
			case 3:
				System.out.println("Enter no.of elements:");
				int n = Integer.parseInt(br.readLine()), element;
				for (int i = 0; i < n; i++) {
					System.out.println("Enter element:");
					element = Integer.parseInt(br.readLine());
					tree.insert(element);
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 20:// exit
				System.out.println("bye bye..");
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice..");
				break;
			}
		} while (choice != 20);

	}

	public boolean isEmpty() {// checks Tree is Empty or not
		return root == null;
	}

	public void insert(int data) {
		TreeNode node = new TreeNode(data);
		if (root == null) {
			root = node;
		} else {
			TreeNode rootPtr = root;// current node pointer
			TreeNode temp;// temp Node to point prev
			while (true) {
				temp = rootPtr;
				if (data <= rootPtr.getData()) {// <=
					rootPtr = rootPtr.getLeft();
					if (rootPtr == null) {
						temp.setLeft(node);
						break;
					}
				} else {// >
					rootPtr = rootPtr.getRight();
					if (rootPtr == null) {
						temp.setRight(node);
						break;
					}
				}
			}
		}
	}
	
}
