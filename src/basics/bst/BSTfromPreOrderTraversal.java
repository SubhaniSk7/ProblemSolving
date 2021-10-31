package basics.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BSTfromPreOrderTraversal {
	TreeNode root;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BSTfromPreOrderTraversal obj = new BSTfromPreOrderTraversal();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), i = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] preorder = new int[n];
		while (st.hasMoreTokens())
			preorder[i++] = Integer.parseInt(st.nextToken());

		obj.bstFromPreorder(preorder);
	}

	public TreeNode bstFromPreorder(int[] preorder) {
		int n = preorder.length;
		if (n == 0)
			return null;
		TreeNode root = new TreeNode(preorder[0]);
		for (int i = 1; i < n; ++i) {
			TreeNode cur = root, prev;
			while (true) {// normal insertion
				int val = preorder[i];
				prev = cur;
				if (val < cur.val) {
					cur = cur.left;
					if (cur == null) {
						prev.left = new TreeNode(val);
						break;
					}
				} else {
					cur = cur.right;
					if (cur == null) {
						prev.right = new TreeNode(val);
						break;
					}
				}
			}
		}
		return root;
	}

	public TreeNode bstFromPreorder_1(int[] preorder) {
		int n = preorder.length;
		if (n == 0)
			return null;
		int val = preorder[0];
		ArrayList<Integer> smaller = new ArrayList<>(), greater = new ArrayList<>();
		for (int i = 1; i < n; ++i) {
			int e = preorder[i];
			if (e < val)
				smaller.add(e);
			else
				greater.add(e);
		}
		int[] small = new int[smaller.size()], great = new int[greater.size()];
		int i = 0;
		for (int x : smaller)
			small[i++] = x;
		i = 0;
		for (int x : greater)
			great[i++] = x;
		TreeNode root = new TreeNode(val);
		root.left = bstFromPreorder(small);
		root.right = bstFromPreorder(great);

		return root;
	}
}
