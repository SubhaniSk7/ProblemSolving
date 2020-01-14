package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RotationCountInSortedArray {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			long[] arr = new long[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				arr[i] = Long.parseLong(st.nextToken());

			findPivot(arr);
		}
	}

	public static void findPivot(long[] arr) {
		int n = arr.length, index = 0;
		for (int i = 0; i < n; i++)
			if (arr[i] > arr[(i + 1) % n]) {
				index = i;
				break;
			}
		System.out.println((index + 1) % n);
	}

}
