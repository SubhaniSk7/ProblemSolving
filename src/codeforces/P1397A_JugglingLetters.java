package codeforces;

import java.io.*;

public class P1397A_JugglingLetters {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String[] s = new String[n];
			for (int i = 0; i < n; ++i)
				s[i] = br.readLine();
			solution(n, s);
		}
	}

	public static void solution(int n, String[] s) {
		int[] alphas = new int[26];
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < s[i].length(); ++j)
				alphas[s[i].charAt(j) - 97] += 1;
		boolean ok = true;
		for (int i = 0; i < alphas.length; ++i)
			if (alphas[i] % n != 0) {
				ok = false;
				break;
			}
		if (ok)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
