package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KthSmallestElementInTree {
	public static TreeNode root;
	public static int k;

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());// kth
		ArrayList<Integer> al = new ArrayList<Integer>();

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

		for (int i = 0; i < al.size(); ++i)
			insert(al.get(i));
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
		inOrderTraversal(root);
		System.out.println();
		System.out.println(kthsmallest(root, k));
	}

	static PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

	public static int kthsmallest(TreeNode A, int B) {
		inOrder(A, B);
		return q.poll();
	}

	public static void inOrder(TreeNode A, int B) {
		if (A != null) {
			inOrder(A.left, B);
			q.offer(A.val);
			if (q.size() > B) {
				q.poll();
			}
			inOrder(A.right, B);
		}
	}
}
