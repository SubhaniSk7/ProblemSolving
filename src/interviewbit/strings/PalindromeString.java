package interviewbit.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(isPalindrome(A));
	}

	public static int isPalindrome(String A) {
		if (A.length() == 1)
			return 1;
		A = A.toLowerCase().replace(" ", "");
		int l = 0, r = A.length() - 1;
		while (l <= r) {
			if (!Character.isAlphabetic(A.charAt(l)) && !Character.isDigit(A.charAt(l))) {
				l++;
				continue;
			} else if (!Character.isAlphabetic(A.charAt(r)) && !Character.isDigit(A.charAt(r))) {
				r--;
				continue;
			}
			if (A.charAt(l) != A.charAt(r))
				return 0;
			l++;
			r--;
		}
		return 1;
	}
}
