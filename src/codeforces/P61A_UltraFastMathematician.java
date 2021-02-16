package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P61A_UltraFastMathematician {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine(), b = br.readLine();
		solution(a, b);
	}

	public static void solution(String a, String b) {
		String answer = "";
		for (int i = 0; i < a.length(); ++i) {
			if (a.charAt(i) == b.charAt(i))
				answer += "0";
			else
				answer += "1";
		}
		System.out.println(answer);
	}
}
