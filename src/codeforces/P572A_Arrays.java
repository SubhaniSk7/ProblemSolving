package codeforces;

import java.io.*;
import java.util.*;

public class P572A_Arrays {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int na = Integer.parseInt(st.nextToken()), nb = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] a = new int[na];
		for (int i = 0; i < na; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] b = new int[nb];
		for (int i = 0; i < nb; ++i)
			b[i] = Integer.parseInt(st.nextToken());
		solution(na, nb, a, b, k, m);
	}

	public static void solution(int na, int nb, int[] a, int[] b, int k, int m) {
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		if (a[k - 1] < b[nb - m])
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
