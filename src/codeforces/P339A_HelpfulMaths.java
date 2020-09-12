package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P339A_HelpfulMaths {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();
		solution(exp);
	}

	public static void solution(String exp) {
		int[] count = new int[3];
		for (int i = 0; i < exp.length(); ++i) {
			if (exp.charAt(i) == '1')
				count[0]++;
			else if (exp.charAt(i) == '2')
				count[1]++;
			else if (exp.charAt(i) == '3')
				count[2]++;
		}
		String s = "";
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < count[i]; ++j)
				s += "+" + (i + 1);
		System.out.println(s.substring(1));
	}
}
