package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1323A_EvenSubsetSumProblem {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			sol(n, a);
		}
	}

	public static void sol(int n, int[] a) {
		int ind1 = -1, ind2 = -1, count = 1;
		for (int i = 0; i < n; ++i) {
			if (a[i] % 2 == 0) {
				ind1 = i;
				count = 4;
				break;
			} else {
				if (count == 1)
					ind1 = i;
				if (count == 2)
					ind2 = i;
				count++;
			}
			if (count == 3)
				break;
		}
		if (count == 3) {
			System.out.println(2 + "\n" + (ind1 + 1) + " " + (ind2 + 1));
		} else if (count == 4) {
			System.out.println(1 + "\n" + (ind1 + 1));
		} else
			System.out.println(-1);
	}
}
