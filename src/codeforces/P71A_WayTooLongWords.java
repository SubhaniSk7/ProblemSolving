package codeforces;

import java.io.*;

public class P71A_WayTooLongWords {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			if (s.length() > 10)
				System.out.println(
						s.charAt(0) + "" + s.substring(1, s.length() - 1).length() + "" + s.charAt(s.length() - 1));
			else
				System.out.println(s);
		}
	}
}
