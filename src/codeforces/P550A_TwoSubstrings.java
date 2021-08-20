package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P550A_TwoSubstrings {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean present = solve(s);
		if (present)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static boolean solve(String s) {
		int n = s.length();
		String t = s;
		s = s.replaceFirst("AB", "_");
		s = s.replaceFirst("BA", "_");

		t = t.replaceFirst("BA", "_");
		t = t.replaceFirst("AB", "_");
		if (n - s.length() == 2 || n - t.length() == 2)
			return true;
		return false;
	}
}
