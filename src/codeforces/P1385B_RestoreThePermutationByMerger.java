package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1385B_RestoreThePermutationByMerger {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[2 * n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 2 * n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			solution(n, a);
		}
	}

	public static void solution(int n, int[] a) {
		ArrayList<Integer> p = new ArrayList<>();
		for (int i = 0; i < 2 * n; ++i) {
			if (!p.contains(a[i])) {
				System.out.print(a[i] + " ");
				p.add(a[i]);
			}
		}
		System.out.println();
	}
}
