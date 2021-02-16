package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubArraysOfAnArray {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		solution(n, a);
	}

	public static void solution(int n, int[] a) {
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				for (int k = i; k <= j; ++k)
					System.out.print(a[k] + " ");
				System.out.println();
			}
		}
	}
}
//3
//1 2 3