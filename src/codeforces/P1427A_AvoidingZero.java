package codeforces;

import java.io.*;
import java.util.*;

public class P1427A_AvoidingZero {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			solution(n, a);
		}
	}

	public static void solution(int n, int[] a) {
		Arrays.parallelSort(a);
		int sum = 0;
		for (int i = 0; i < n; ++i)
			sum += a[i];
		if (sum == 0)
			System.out.println("NO");
		else {
			System.out.println("YES");
			if (sum > 0)
				for (int i = n - 1; i >= 0; --i)
					System.out.print(a[i] + " ");
			else
				for (int i = 0; i < n; ++i)
					System.out.print(a[i] + " ");
			System.out.println();
		}
	}
}
