package basics.binarysearch;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch_Recursive {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("InputOutput\\in1.txt"));
		boolean append = false, autoFlush = true;
		PrintStream out = new PrintStream(new FileOutputStream("InputOutput\\out1.txt", append), autoFlush);
		System.out.println("enter no.of elements & element to search:");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), element = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		System.out.println("enter elements:");
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);

		int index = BinarySearch(arr, 0, n - 1, element);
		if (index == -1)
			System.out.println("not found");
		else
			System.out.println("found at index:" + index);
		out.print(index + " " + index);
	}

	public static int BinarySearch(int[] a, int start, int end, int element) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == element)
				return mid;
			else if (a[mid] > element)
				return BinarySearch(a, start, mid - 1, element);
			else
				return BinarySearch(a, mid + 1, end, element);
		}
		return -1;
	}
}
