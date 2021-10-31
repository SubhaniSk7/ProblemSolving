package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1579A_CasimirsStringSolitaire {

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			if (solve(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean solve(String s) {
		int a = 0, b = 0, c = 0;
		for (char ch : s.toCharArray()) {
			if (ch == 'A')
				a++;
			if (ch == 'B')
				b++;
			if (ch == 'C')
				c++;
		}
		if (a == 0 && b == c)
			return true;
		else if (b == 0)
			return false;
		else if (c == 0 && a == b)
			return true;
		else if (b == a + c)
			return true;
		else
			return false;
	}
}
