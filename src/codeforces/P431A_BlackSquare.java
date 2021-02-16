package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P431A_BlackSquare {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] calories = new int[4];
		for (int i = 0; i < 4; ++i)
			calories[i] = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		solution(calories, s);
	}

	public static void solution(int[] calories, String s) {
		int totalCalories = 0;
		for (int i = 0; i < s.length(); ++i)
			totalCalories += calories[Character.getNumericValue(s.charAt(i)) - 1];

		System.out.println(totalCalories);
	}
}
