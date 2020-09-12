package codechef.challenges2020.sep2020;

import java.io.*;
import java.util.StringTokenizer;

public class IC_AdaMatrix_ADAMAT {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; ++j)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			solution(arr, n);
		}
	}

	public static void solution(int[][] arr, int n) {
		int i, j, opCount = 0;

		int[][] temp = arr;
		print(arr, n);

		while (true) {
			int index = isSorted(arr, opCount);
			System.out.println(index);
			if (index == -1)
				break;

			int L = index;
			for (i = 0; i < L; ++i) {
				for (j = 0; j < L; ++j) {
					temp[i][j] = arr[j][i];
				}
			}
			print(arr, n);
			arr = temp;
			opCount++;
		}
		System.out.println(opCount);
	}

	public static int isSorted(int[][] arr, int n) {

		for (int i = n; i >= 1; --i)
			for (int j = n; j >= 1; --j)
				if (arr[i - 1][j - 1] != (i - 1) * n + j) {
					return i;
				}
		return -1;
	}

	public static void print(int[][] arr, int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println("---------------------");
	}
}
