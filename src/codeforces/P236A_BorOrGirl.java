package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P236A_BorOrGirl {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		solution(s);
	}

	public static void solution(String s) {
		int[] alphas = new int[26];
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			alphas[s.charAt(i) - 97] = 1;
		for (int i = 0; i < alphas.length; i++)
			count += alphas[i];
		if (count % 2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}
}
