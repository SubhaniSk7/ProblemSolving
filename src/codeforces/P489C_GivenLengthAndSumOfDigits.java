package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P489C_GivenLengthAndSumOfDigits {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		solution(m, s);
	}

	public static boolean possible(int m, int s) {
		return s >= 0 && s <= 9 * m;
	}

	public static void solution(int m, int s) {
		StringBuilder smallest = new StringBuilder(""), largest = new StringBuilder("");
		int smallSum = s, largeSum = s;
		for (int i = 1; i <= m; ++i) {
			for (int digit = 0; digit <= 9; ++digit) {
				if ((i > 1 || digit > 0 || (m == 1 && digit == 0)) && possible(m - i, smallSum - digit)) {
					smallest.append("" + digit);
					smallSum -= digit;
					break;
				}
			}

			for (int digit = 9; digit >= 0; --digit) {
				if ((i > 1 || digit > 0 || (m == 1 && digit == 0)) && possible(m - i, largeSum - digit)) {
					largest.append("" + digit);
					largeSum -= digit;
					break;
				}
			}
		}
		if (smallest.length() != m || largest.length() != m) {
			smallest = new StringBuilder("-1");
			largest = new StringBuilder("-1");
		}
		System.out.println(smallest + " " + largest);
	}
}
