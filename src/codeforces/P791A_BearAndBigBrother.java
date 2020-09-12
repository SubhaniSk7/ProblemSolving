package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P791A_BearAndBigBrother {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		solution(a, b);
	}

	public static void solution(int a, int b) {
		int count = 0;
		while (a <= b) {
			a = 3 * a;
			b = 2 * b;
			count++;
		}
		System.out.println(count);
	}
}
