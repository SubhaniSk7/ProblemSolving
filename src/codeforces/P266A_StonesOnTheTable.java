package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P266A_StonesOnTheTable {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		solution(n, s);
	}

	public static void solution(int n, String s) {
		int count = 0;
		for (int i = 0; i < n - 1;) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s = s.substring(0, i) + s.substring(i + 1);
				count++;
				n--;
			} else
				i++;
		}
		System.out.println(count);
	}
}
