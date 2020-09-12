package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13_RomantoInteger {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();

		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		int result = 0;

		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) == 'I') {
				result += 1;
			} else if (s.charAt(i) == 'V') {
				if (i - 1 >= 0 && s.charAt(i - 1) == 'I') {
					result += 4;
					i--;
				} else
					result += 5;
			} else if (s.charAt(i) == 'X') {
				if (i - 1 >= 0 && s.charAt(i - 1) == 'I') {
					result += 9;
					i--;
				} else
					result += 10;
			} else if (s.charAt(i) == 'L') {
				if (i - 1 >= 0 && s.charAt(i - 1) == 'X') {
					result += 40;
					i--;
				} else
					result += 50;
			} else if (s.charAt(i) == 'C') {
				if (i - 1 >= 0 && s.charAt(i - 1) == 'X') {
					result += 90;
					i--;
				} else
					result += 100;
			} else if (s.charAt(i) == 'D') {
				if (i - 1 >= 0 && s.charAt(i - 1) == 'C') {
					result += 400;
					i--;
				} else
					result += 500;
			} else if (s.charAt(i) == 'M') {
				if (i - 1 >= 0 && s.charAt(i - 1) == 'C') {
					result += 900;
					i--;
				} else
					result += 1000;
			}
//			System.out.println(result);
		}
		return result;
	}
}
