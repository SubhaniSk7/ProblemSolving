package codeforces;

import java.io.*;

public class P58A_ChatRoom {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		if (s.matches("(.*)(h+)(.*)(e+)(.*)l(.*)(l+)(.*)(o+)(.*)"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
