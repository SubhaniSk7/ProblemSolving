package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XORAGN {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			long[] arr = new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				arr[i] = Long.parseLong(st.nextToken());

			xor(arr);
		}
	}

	public static void xor(long[] arr) {

		int i, j, k = 0;
		long xoring = 0;
		for (i = 0; i < arr.length; i++)
			xoring ^= (2 * arr[i]);
		System.out.println(xoring);
	}
}
