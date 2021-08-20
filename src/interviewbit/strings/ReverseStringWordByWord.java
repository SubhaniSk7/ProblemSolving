package interviewbit.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWordByWord {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(solve(A));
	}

	public static String solve(String A) {
		String result = "";
		String[] s = A.split(" ");

		for (int i = s.length - 1; i >= 0; --i) {
			String str = s[i].trim();
			if (str.length() > 0)
				result += str + " ";
		}
		return result.trim();
	}
}
