package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P520A_Pangram {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		solution(n, str.toLowerCase());
	}

	public static void solution(int n, String str) {
		boolean print = true;
		int[] alphas = new int[26];
		for (int i = 0; i < n; i++)
			alphas[str.charAt(i) - 97]++;
		for (int i = 0; i < alphas.length; i++) {
			if (alphas[i] == 0) {
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
