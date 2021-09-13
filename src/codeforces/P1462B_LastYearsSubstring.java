package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1462B_LastYearsSubstring {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			if (solve(s, n))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean solve(String s, int n) {
		if (s.indexOf("2020") == 0 || s.lastIndexOf("2020") == n - 4)
			return true;
		else {
			if (s.indexOf("2") == 0 && s.lastIndexOf("020") == n - 3)
				return true;
			else if (s.indexOf("20") == 0 && s.lastIndexOf("20") == n - 2)
				return true;
			else if (s.indexOf("202") == 0 && s.lastIndexOf("0") == n - 1)
				return true;
		}
		return false;
	}
}
