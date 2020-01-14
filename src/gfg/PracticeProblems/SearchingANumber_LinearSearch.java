package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchingANumber_LinearSearch {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] result = new int[t];
		int i, j = 0;
		while (t-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int element = Integer.parseInt(st.nextToken());

			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			result[j++] = linearSearch(arr, element);
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	static int linearSearch(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == element)
				return i + 1;
		return -1;// not found
	}
}
