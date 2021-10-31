package basics.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryTreeMaximumPath {
	public TreeNode root;
	int ans = Integer.MIN_VALUE;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		Tree tree = new Tree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			tree.root = new TreeInsert().insert(tree.root, Integer.parseInt(st.nextToken()));

		BinaryTreeMaximumPath obj = new BinaryTreeMaximumPath();
		System.out.println(obj.maxPathSum(tree.root));
	}

	public int maxPathSum(TreeNode root) {
		cal(root);
		return ans;
	}

	public int cal(TreeNode root) {
		if (root == null)
			return 0;

		int l = cal(root.left);
		int r = cal(root.right);

		int temp = Math.max(root.val, root.val + Math.max(l, r));
		int result = Math.max(temp, root.val + l + r);
		ans = Math.max(ans, result);
		return temp;
	}
}
