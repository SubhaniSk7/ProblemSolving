package codeforces;

import java.io.*;
import java.util.*;

public class P1385A_ThreePairwiseMaximum {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[3];
			for (int i = 0; i < 3; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			solution(a);
		}
	}

	public static void solution(int[] a) {
		Arrays.parallelSort(a);
		if (a[1] != a[2])
			System.out.println("NO");
		else {
			System.out.println("YES");
			System.out.println(a[0] + " " + a[0] + " " + a[2]);
		}
	}
}
