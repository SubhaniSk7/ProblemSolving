package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1373B_01Game {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
//			StringBuilder s = new StringBuilder(br.readLine());
			String s = br.readLine();
			sol(s);
		}
	}

	public static void sol(String s) {
		boolean alice = true;
		int turn = 0;
		while (true) {
			if (s.contains("01"))
				s = s.replaceFirst("01", "");
			else if (s.contains("10"))
				s = s.replaceFirst("10", "");
			else
				break;
			turn++;
		}
		if (turn % 2 == 0)
			System.out.println("NET");
		else
			System.out.println("DA");
	}
}
