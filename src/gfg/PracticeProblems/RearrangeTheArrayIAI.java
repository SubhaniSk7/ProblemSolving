package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RearrangeTheArrayIAI {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());

			int i = 0;
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			rearrange(arr);
		}
	}

	// Method 1
	public static void rearrange(int[] arr) {

		int n = arr.length, i, j;
		for (i = 0; i < n; i++) {

			if (arr[i] == i)
				continue;
			else if (arr[i] == -1)
				continue;
			else if (arr[i] != -1) {
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
				if (arr[temp] != -1)
					i--;
			}
			// printArray(arr);
			// System.out.println("-------------------");
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
