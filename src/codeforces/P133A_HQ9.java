package codeforces;

import java.io.*;

public class P133A_HQ9 {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		if (s.contains("H") || s.contains("Q") || s.contains("9"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
