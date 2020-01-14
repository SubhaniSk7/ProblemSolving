package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountTheZeroes {
	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()), i, j = 0;
		int[] result = new int[t];

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			result[j++] = arr.length - getFirstZeroIndex(arr);// function call
		}
		for (i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	public static int getFirstZeroIndex(int[] arr) {
		int index = -1, start = 0, end = arr.length - 1, zero = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > zero)
				start = mid + 1;
			else if (arr[mid] == zero) {
				end = mid - 1;
				index = mid;
			}
		}
		if (index == -1)
			return arr.length;
		return index;
	}

}
