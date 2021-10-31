package basics.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {
	static TreeNode root;

	public static void main(String subhani[]) throws NumberFormatException, IOException, InterruptedException {
		Tree tree = new Tree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("\n\n********************************\n\t1.isEmpty\n\t" + "2.Print Tree(Traversals)\n\t"
					+ "3.Insert\n\t" + "4.Update Node\n\t" + "5.Delete Node\n\t" + "6.Search\n\t"
					+ "7.Height of Tree\n\t" + "8.FindMin\n\t" + "9.FindMax\n\t" + "10.Inorder Predecessor\n\t"
					+ "11.Inorder Successor\n\t" + "12.exit\n" + "********************************enter choice:");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:// isEmpty
				System.out.println("isEmpty:" + tree.isEmpty());
				break;
			case 2:
				TreeTraversalsRecursive traverse = new TreeTraversalsRecursive();
				TreeTraversalsIterative traverse_1 = new TreeTraversalsIterative();
				System.out.println();
				if (!tree.isEmpty()) {
					System.out.println("InOrder:");
					traverse.inOrder(root);
					System.out.println();
					traverse_1.inOrder(root);
					System.out.println();

					System.out.println("PreOrder:");
					traverse.preOrder(root);
					System.out.println();
					traverse_1.preOrder(root);

					System.out.println();
					System.out.println("PostOrder:");
					traverse.postOrder(root);
					System.out.println();
					traverse_1.postOrder(root);

					System.out.println();
					System.out.println("LevelOrder:");
					traverse.levelOrder(root);
				} else
					System.out.println("Tree is empty..");
				break;
			case 3:
				TreeInsert treeInsert = new TreeInsert();
				System.out.println("Enter no.of elements:");
//				int n = Integer.parseInt(br.readLine());
				int n = 7;
				int element;
				int[] a = { 5, 3, 7, 2, 4, 6, 8 };
				for (int i = 0; i < n; i++) {
					System.out.println("Enter element:");
//					element = Integer.parseInt(br.readLine());
					element = a[i];
					root = treeInsert.insert(root, element);
				}
				break;
			case 4:
				break;
			case 5:
				element = Integer.parseInt(br.readLine());

				TreeDelete treeDelete = new TreeDelete();
				treeDelete.delete(root, element);
				break;
			case 6:
				System.out.println("Enter element to search:");
				element = Integer.parseInt(br.readLine());
				TreeSearch treeSearch = new TreeSearch();
				if (!tree.isEmpty())
					System.out.println(treeSearch.search(root, element));
				else
					System.out.println("Tree is Empty..");
				break;
			case 7:
				TreeHeight treeHeight = new TreeHeight();
				System.out.println("Tree height:" + treeHeight.height(root));
				break;
			case 8:
				TreeFindMin treeMin = new TreeFindMin();
				System.out.println("Tree Min:" + treeMin.min(root));
				break;
			case 9:
				TreeFindMax treeMax = new TreeFindMax();
				System.out.println("Tree Max:" + treeMax.max(root));
				break;
			case 10:
				TreeInorderPredecessor treeInorderPredecessor = new TreeInorderPredecessor();
				System.out.println("enter element for Inorder Predecessor");
				element = Integer.parseInt(br.readLine());
				TreeNode predecessor = treeInorderPredecessor.inorderPredecessor(root, element);
				if (predecessor != null)
					System.out.println("Tree Inoder Predecessor:" + predecessor.val);
				else
					System.out.println("No Inorder Predecessor.");
				break;
			case 11:

				TreeInorderSuccessor treeInorderSuccessor = new TreeInorderSuccessor();
				System.out.println("enter element for Inorder Successor");
				element = Integer.parseInt(br.readLine());
				TreeNode successor = treeInorderSuccessor.inorderSuccessor(root, element);
				if (successor != null)
					System.out.println("Tree Inoder Successor:" + successor.val);
				else
					System.out.println("No Inorder Successor.");

				break;
			case 12:// exit
				System.out.println("bye bye..");
				System.exit(0);
				break;
			default:
				System.out.println("Choose correct choice..");
				break;
			}
		} while (choice != 12);
	}

	public boolean isEmpty() {// checks Tree is Empty or not
		return root == null;
	}
}
