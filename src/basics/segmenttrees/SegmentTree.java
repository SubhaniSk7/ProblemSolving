package basics.segmenttrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SegmentTree {
	public static int[] arr = { 1, 3, 5, 7, 9, 11 };
	public static int n = 6;
	public static int rootPosition = 0;// always starts at 0; left child=2i+1, right child = 2i+2;
	public static int[] segTree;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(st.nextToken());
//		arr = new int[n];
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < n; ++i)
//			arr[i] = Integer.parseInt(st.nextToken());

		int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
		int maxSize = (int) (2 * Math.pow(2, x) - 1);// (2 * 2^x) -1
		segTree = new int[maxSize];
		constructSegTree(0, n - 1, rootPosition);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(segTree));
	}

	public static int constructSegTree(int start, int end, int pos) {
		if (start == end) {
			segTree[pos] = arr[start];
			return arr[start];
		}
		int mid = (start + end) / 2;
		int leftChild = constructSegTree(start, mid, 2 * pos + 1);
		int rightChild = constructSegTree(mid + 1, end, 2 * pos + 2);
		segTree[pos] = leftChild + rightChild;
		return segTree[pos];
	}

	public static int getSum(int l, int r) {
		if (l < 0 || r > n - 1 || l > r) {
			System.out.println("Invalid query");
			return -1;
		}
		return getSumValue(0, n - 1, l, r, rootPosition);// root = 0
	}

	public static int getSumValue(int start, int end, int l, int r, int pos) {
		if (start > r || end < l)// No overlap
			return 0;
		if (l <= start && end <= r)// total overlap : l <= start <= end <= r
			return segTree[pos];

		int mid = (start + end) / 2;
		int left = getSumValue(start, mid, l, r, 2 * pos + 1);
		int right = getSumValue(mid + 1, end, l, r, 2 * pos + 2);
		return left + right;
	}

	public static void update(int index, int value) {
		if (index < 0 || index > n - 1) {
			System.out.println("Invalid input");
			return;
		}
		int diff = value - arr[index];
		arr[index] = value;
		updateTree(0, n - 1, index, diff, rootPosition);
	}

	public static void updateTree(int start, int end, int index, int diff, int currentIndex) {
		if (index < start || index > end)
			return;
		segTree[currentIndex] = segTree[currentIndex] + diff;
		if (start != end) {
			int mid = (start + end) / 2;
			updateTree(start, mid, index, diff, 2 * currentIndex + 1);// update LST
			updateTree(mid + 1, end, index, diff, 2 * currentIndex + 2);// update RST
		}
	}
}