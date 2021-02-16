package codeforces;

import java.io.*;

public class P1367A_ShortSubStrings {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String b = br.readLine();
			solution(b);
		}
	}

	public static void solution(String b) {
		String a = "";
		for (int i = 0; i < b.length();) {
			a += "" + b.charAt(i);
			if (i == 0 || i == b.length() - 1)
				i++;
			else
				i += 2;
		}
		System.out.println(a);
	}
}
