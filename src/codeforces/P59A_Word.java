package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P59A_Word {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		int lower = 0, upper = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) < 97)// ASCII
				upper++;
			else
				lower++;
		}
		if (upper > lower)
			System.out.println(s.toUpperCase());
		else
			System.out.println(s.toLowerCase());
	}
}
