package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09_PalindromeNum {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (palindrome(n))
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean palindrome(int x) {
		String str = "" + x;
		int i, j = str.length() - 1;
		for (i = 0; i < str.length() / 2;) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}

//	public boolean isPalindrome(int x) {
//		String s = "" + x;
//		int l = 0, r = s.length() - 1;
//		while (l <= r) {
//			if (s.charAt(l) != s.charAt(r))
//				return false;
//			l++;
//			r--;
//		}
//		return true;
//	}
}
