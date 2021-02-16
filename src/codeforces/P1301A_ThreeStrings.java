package codeforces;

import java.io.*;

public class P1301A_ThreeStrings {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String a = br.readLine(), b = br.readLine(), c = br.readLine();
			solution(a, b, c);
		}
	}

	public static void solution(String a, String b, String c) {
		for (int i = 0; i < a.length(); ++i) {
			if (a.charAt(i) != b.charAt(i)) {
				if (a.charAt(i) == c.charAt(i)) {
					b = b.substring(0, i) + c.charAt(i) + b.substring(i + 1);
				} else if (b.charAt(i) == c.charAt(i)) {
					a = a.substring(0, i) + c.charAt(i) + a.substring(i + 1);
				} else {
					break;
				}
			} else if (a.charAt(i) == b.charAt(i) && a.charAt(i) != c.charAt(i)) {
				a = a.substring(0, i) + c.charAt(i) + a.substring(i + 1);// to make NO
				break;
			}
		}
		if (a.contentEquals(b))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
