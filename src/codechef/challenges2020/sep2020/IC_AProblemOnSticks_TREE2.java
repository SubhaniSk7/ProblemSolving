package codechef.challenges2020.sep2020;

import java.io.*;
import java.util.*;

public class IC_AProblemOnSticks_TREE2 {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solution(arr, n);
		}

	}

	public static void solution(int[] arr, int n) {
		int i, count = 0;
		Arrays.sort(arr);
		while (true) {
			boolean allZeros = true;
			for (i = 0; i < n; ++i) {
				if (arr[i] != 0) {
					allZeros = false;
					break;
				}
			}
			if (allZeros)
				break;

			int h = 0;
			int[] temp = new int[n];

			for (i = 0; i < n; ++i)
				if (arr[i] > h) {
					int lenRemove = arr[i] - h;
					arr[i] = arr[i] - lenRemove;
				}
			count++;

			print(arr, n);
			break;
		}
		System.out.println(count);
	}

	public static void print(int[] arr, int n) {
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}