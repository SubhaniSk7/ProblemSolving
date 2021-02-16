package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P1325B_CopyCopyCopyCopyCopy {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solution(n, arr);
		}
	}

	public static void solution(int n, int[] arr) {
		Set<Integer> eles = new HashSet<Integer>();
		for (int i = 0; i < n; ++i)
			eles.add(arr[i]);
		System.out.println(eles.size());
	}
}
