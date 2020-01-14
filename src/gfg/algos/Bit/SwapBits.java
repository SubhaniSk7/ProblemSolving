package gfg.algos.Bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SwapBits {

	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), i = 0;

		int[] result = new int[t];

		while (t-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken()), p1 = Integer.parseInt(st.nextToken()),
					p2 = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());

			// System.out.println(Integer.toBinaryString(x));
			result[i++] = swapBits(x, p1, p2, n);
		}
		printArray(result);
	}

	static int swapBits(int x, int p1, int p2, int n) {

		int set1 = (x >> p1) & ((1 << n) - 1);
		int set2 = (x >> p2) & ((1 << n) - 1); // getting only 'n' bits

		int xor = set1 ^ set2;// SET different bit positions == flipped bits
		// System.out.println("---------------------------");
		// System.out.println("set1:" + set1 + "\t>>\t" + Integer.toBinaryString(set1));
		// System.out.println("set2:" + set2 + "\t>>\t" + Integer.toBinaryString(set2));
		// System.out.println("xor:" + xor + "\t>>\t" + Integer.toBinaryString(xor));

		xor = (xor << p1) | (xor << p2);
		// System.out.println("xor:" + xor + "\t>>\t" + Integer.toBinaryString(xor));

		int result = x ^ xor;// flipping the different bit position
		// System.out.println("-->" + result + "\t>>\t" +
		// Integer.toBinaryString(result));

		return result;
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
