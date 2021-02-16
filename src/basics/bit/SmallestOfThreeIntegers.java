package basics.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SmallestOfThreeIntegers {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
				z = Integer.parseInt(st.nextToken());

		System.out.println(minOfThree(x, y, z));
	}

	static int minOfThree(int x, int y, int z) {

		return minOfTwo_1(x, minOfTwo_1(y, z));
	}

	// Method 1
	static int minOfTwo_1(int x, int y) {
		return y + ((x - y) & ((x - y) >> (Integer.SIZE * Character.SIZE - 1)));
	}

	static int maxOfTwo_1(int x, int y) {
		return x - ((x - y) & ((x - y) >> (Integer.SIZE * Character.SIZE - 1)));
	}

	// Method 2-->not working
	static int minOfTwo_2(int x, int y) {
		// System.out.println(">>" + (x ^ y) + ":" + (x << y) + ":" + -(x << y) + "...."
		// + ((x ^ y) & -(x << y)));
		return y ^ ((x ^ y) & -(x << y));// y ^ ((x ^ y) & -(x < y))--> less than comparator
	}

	static int maxOfTwo_2(int x, int y) {
		return x ^ ((x ^ y) & -(x << y));
	}

}
