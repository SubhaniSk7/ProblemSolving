package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P939A_LoveTriangle {
	public static int[] love;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		love = new int[n + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; ++i) {
			int lover = Integer.parseInt(st.nextToken());
			love[i] = lover;
		}
		String ans = "NO";
		for (int i = 1; i <= n; ++i) {
			if (triangle(i) == i) {
				ans = "YES";
				break;
			}
		}
		System.out.println(ans);
	}

	public static int triangle(int x) {
		int distance = 0;
		while (distance < 3) {
			distance++;
			x = love[x];
		}
		return x;
	}
}
