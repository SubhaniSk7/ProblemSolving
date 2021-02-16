package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P41A_Translation {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		solution(s, t);
	}

	public static void solution(String s, String t) {
		boolean lang = true;
		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != t.charAt(s.length() - i - 1)) {
					lang = false;
					break;
				}
			}
		} else
			lang = false;
		if (lang)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
