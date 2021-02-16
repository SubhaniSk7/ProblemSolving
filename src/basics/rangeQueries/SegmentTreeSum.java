package basics.rangeQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SegmentTreeSum {
	public static int n, treeSize;
	public static int[] arr, segTree;

	public static void main(String[] subhani) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());// should be power of 2 ;or append 0's to make power of 2
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());

		int x = (int) (Math.ceil(Math.log10(n) / Math.log10(2)));
		treeSize = (int) (2 * Math.pow(2, x) - 1); // treeSize = 2n-1 ; n=power of 2;
		segTree = new int[treeSize];
		System.out.println(treeSize);
		fill();

		System.out.println("enter range[a,b] from 0->n-1:");
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		sum(a, b);
	}

	public static void fill() {
		int leaf = treeSize / 2;
		for (int i = 0; i < n; ++i)// initialization:arrayelements starts from n-1 because index starts from 0; otherwise starts from n
			segTree[i + leaf] = arr[i];

		for (int i = n - 2; i >= 0; --i) // index from 0; LC=2*i+1, RC=2*i+2
			segTree[i] = segTree[2 * i + 1] + segTree[2 * i + 2];
		print();
	}

	public static void sum(int a, int b) throws InterruptedException {
		a += n - 1;// index:0->n-1;elements starts from n-1
		b += n - 1;
		System.out.println(a + " " + b);
//		if (true)
//			return;
		int s = 0;
		while (a <= b) {
			if (a % 2 == 0) {
				s += segTree[a];
				a++;
			}
			System.out.println(a + " " + ((a - 1) / 2) + ":" + s);
			if (b % 2 == 1) {
				s += segTree[b];
				b--;
			}
			System.out.println(b + " " + ((b - 1) / 2) + ":" + s);
			a = (a - 1) / 2;
			b = (b - 1) / 2;
			System.out.println();
			Thread.sleep(1000);
		}
		System.out.println(s);
	}

	public static void print() {
		for (int i = 0; i < treeSize; ++i)
			System.out.print(segTree[i] + " ");
		System.out.println();
	}
}
//i/p:
//	8
//	5 8 6 3 2 7 2 6