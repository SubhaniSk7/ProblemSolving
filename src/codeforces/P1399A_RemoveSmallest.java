package codeforces;

import java.io.*;
import java.util.*;

public class P1399A_RemoveSmallest {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solution(n, arr);
		}
	}

	public static void solution(int n, int[] arr) {
		int count = n;
		Arrays.parallelSort(arr);
		for (int i = 0; i < n - 1; ++i) {
			int diff = arr[i + 1] - arr[i];
			if (diff == 0 || diff == 1) {// diff<=1
				arr[i] = 0;
				count--;
			}
		}

		if (count == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
