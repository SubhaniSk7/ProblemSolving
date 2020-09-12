package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P112A_PetyaAndStrings {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();

		solution(a.toLowerCase(), b.toLowerCase());
	}

	public static void solution(String a, String b) {

		if (a.compareTo(b) < 0)
			System.out.println(-1);
		else if (a.compareTo(b) > 0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
