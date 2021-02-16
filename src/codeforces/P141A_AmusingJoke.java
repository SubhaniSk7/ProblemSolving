package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P141A_AmusingJoke {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine(), b = br.readLine(), c = br.readLine();
		solution(a, b, c);
	}

	public static void solution(String a, String b, String c) {
		int[] alphas = new int[26];
		int[] verify = new int[26];
		for (int i = 0; i < a.length(); i++)
			alphas[a.charAt(i) - 65]++;
		for (int i = 0; i < b.length(); i++)
			alphas[b.charAt(i) - 65]++;
		for (int i = 0; i < c.length(); i++)
			verify[c.charAt(i) - 65]++;
		boolean print = true;
		for (int i = 0; i < alphas.length; ++i) {
			if (alphas[i] != verify[i]) {
				print = false;
				break;
			}
		}
		if (print)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
