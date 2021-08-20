package interviewbit.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumCharactersRequiredToPalindrome {
	public static void main(String subhani[]) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solve(str));
	}

	public static int solve(String A) throws InterruptedException {
		int n = A.length(), l = 0, r = n - 1, count = 0;
		while (l <= r) {
			if (A.charAt(l) != A.charAt(r)) {
				if (l == 0)
					r--;
				else
					l = 0;
				count = n - r - 1;
			} else {
				l++;
				r--;
			}
		}
		return count;
	}
}
