package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KOL16B {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), count = 0;

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(br.readLine());

			count++;
			System.out.println("Case " + count + ":");
			decode(arr);
		}
	}

	public static void decode(int[] A) {

		int[] a = new int[A.length], b = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int temp = A[i] >> (1 << (1 << (1 << 1)));
			b[i] = temp;
			a[i] = A[i] - (temp << (1 << (1 << (1 << 1))));
		}
		printArray(a);
		printArray(b);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
