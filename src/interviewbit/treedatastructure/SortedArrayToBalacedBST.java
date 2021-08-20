package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SortedArrayToBalacedBST {
	public static TreeNode root;
	static ArrayList<Integer> al = new ArrayList<Integer>();

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

//		for (int i = 0; i < al.size(); ++i)
//			insert(al.get(i));
	}

	public static void insert(int val) {
		TreeNode newNode = new TreeNode(val);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode cur = root, temp;
			while (true) {
				temp = cur;
				if (val <= cur.val) {
					cur = cur.left;
					if (cur == null) {
						temp.left = newNode;
						break;
					}
				} else {
					cur = cur.right;
					if (cur == null) {
						temp.right = newNode;
						break;
					}
				}
			}
		}
	}

	public static void inOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.val + " ");
			inOrderTraversal(node.right);
		}
	}

	public static void main(String subhani[]) throws IOException {
		read();
//		inOrderTraversal(root);
		System.out.println();

		int[] A = new int[al.size()];
		int i = 0;
		for (int a : al)
			A[i++] = a;
		root = sortedArrayToBST(A);
	}

	public static TreeNode sortedArrayToBST(final int[] A) {
		int n = A.length;
		TreeNode root = bbst(A, 0, n - 1);
		return root;
	}

	public static TreeNode bbst(int[] A, int l, int r) {
		if (l > r)
			return null;
		int mid = l + (r - l) / 2;
		TreeNode node = new TreeNode(A[mid]);
		node.left = bbst(A, l, mid - 1);
		node.right = bbst(A, mid + 1, r);
		return node;
	}

}
