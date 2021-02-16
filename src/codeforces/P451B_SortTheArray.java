package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P451B_SortTheArray {
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
		int start = 0, end = 0;
		for (int i = 0; i < n - 1; ++i)
			if (a[i] > a[i + 1]) {
				start = i;
				break;
			}
		for (int i = n - 1; i > 0; --i)
			if (a[i] < a[i - 1]) {
				end = i;
				break;
			}
		for (int i = start, k = 0; i <= start + (end - start) / 2; i++) {
			int temp = a[i];
			a[i] = a[end - k];
			a[end - k] = temp;
			k++;
		}
		boolean sorted = true;
		for (int i = 0; i < n - 1; ++i)
			if (a[i + 1] < a[i]) {
				sorted = false;
				break;
			}
		if (sorted)
			System.out.println("yes\n" + (start + 1) + " " + (end + 1));
		else
			System.out.println("no");
	}
}
