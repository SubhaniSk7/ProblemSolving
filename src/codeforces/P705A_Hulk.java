package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P705A_Hulk {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

	public static void solution(int n) {
		String s = "I hate";
		for (int i = 2; i <= n; ++i) {
			s += " that ";
			if (i % 2 == 0)
				s += "I love";
			else
				s += "I hate";
		}
		System.out.println(s + " it");
	}
}
