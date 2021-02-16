package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P540A_CombinationLock {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String original = br.readLine(), open = br.readLine();
		solution(n, original, open);
	}

	public static void solution(int n, String original, String open) {
		char[] originalDigs = original.toCharArray(), openDigs = open.toCharArray();
		int count = 0;
		for (int i = 0; i < n; ++i) {
			int a = originalDigs[i] - '0', b = openDigs[i] - '0';
			int max = -1, min = -1;
			if (a > b) {
				max = a;
				min = b;
			}
			if (a < b) {
				max = b;
				min = a;
			}
			int diff = Math.min(max - min, 9 - max + min + 1);// min(abs(a-b), 10-abs(a-b))
			count += diff;
		}
		System.out.println(count);
	}
}
