package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P978A_RemoveDuplicates {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		solution(n, a);
	}

	public static void solution(int n, int[] a) {
		int count = 0;
		for (int i = 0; i < n; ++i)
			for (int j = i + 1; j < n; ++j)
				if (a[j] == a[i]) {
					a[i] = -1;
					count++;
					break;
				}
		System.out.println(n - count);
		for (int i = 0; i < n; ++i)
			if (a[i] != -1)
				System.out.print(a[i] + " ");
		System.out.println();
	}
}
