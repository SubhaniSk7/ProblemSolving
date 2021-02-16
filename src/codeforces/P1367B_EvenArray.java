package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1367B_EvenArray {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solution(n, arr);
		}
	}

	public static void solution(int n, int[] arr) {
		int wrongZeroes = 0, wrongOnes = 0;
		for (int i = 0; i < n; ++i) {
			if (i % 2 == 0 && arr[i] % 2 == 1)
				wrongZeroes++;
			if (i % 2 == 1 && arr[i] % 2 == 0)
				wrongOnes++;
		}
		if (wrongZeroes != wrongOnes)
			System.out.println(-1);
		else
			System.out.println(wrongZeroes);
	}
}
