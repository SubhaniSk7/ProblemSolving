package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P281A_WordCapitalization {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		solution(word);
	}

	public static void solution(String word) {
		System.out.println(("" + word.charAt(0)).toUpperCase() + "" + word.substring(1));
	}
}
