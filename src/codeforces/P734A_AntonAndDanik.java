package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P734A_AntonAndDanik {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		solution(n, s);
	}

	public static void solution(int n, String s) {
		int a = s.length() - s.replace("A", "").length();
		int d = s.length() - s.replace("D", "").length();
		if (a > d)
			System.out.println("Anton");
		else if (a < d)
			System.out.println("Danik");
		else
			System.out.println("Friendship");
	}
}
