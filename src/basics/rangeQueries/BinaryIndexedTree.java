package basics.rangeQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Dynamic range queries i.e., if we update values in array
//sum from S(a,b) in [a,b]
public class BinaryIndexedTree {
	public static int[] arr, bit;// binary index tree initially '0'
	public static int n;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		bit = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; ++i)// filling
			update(i, arr[i]);
		print(n);

		System.out.println("enter range [a,b] from 0 to n-1:");
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int bSum = getSum(b), aSum = getSum(a - 1);
		System.out.println(bSum - aSum);
	}

	public static void update(int index, int x) {// updates 'bit' array, not original array.
		index += 1;
		while (index <= n) {
			bit[index] += x;
			index += index & -index;// adding to index= goto parent by incrementing
		}
	}

	public static int getSum(int index) {
		index += 1;
		int value = 0;
		while (index > 0) {// if index=15=binary=1111=positions (MSB)8,(8+4)=12,(12+2)=14,(14+1)=15 indices
			value += bit[index];
			index -= (index & -index);// -index=2's complement of index; index&-index = largest power of 2 that divides index perfectly; index = index-(index&-index) = subtracting = getting parent of index;subtraction = difference will be power of 2 = go to parent by decrementing
		}
		return value;
	}

	public static void print(int n) {
		for (int i = 0; i < bit.length; ++i)
			System.out.print(bit[i] + " ");
		System.out.println();
	}
}

//i/p:
//	8
//	1 3 4 8 6 1 4 2
// query: 0 6
//o/p: 1 4 4 16 6 7 4 29
// 	query o/p: 27
