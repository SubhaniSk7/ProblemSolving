package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidParanthesisString {

	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ValidParanthesisString obj = new ValidParanthesisString();
		System.out.println(obj.checkValidString(s));
	}

	public boolean checkValidString(String s) {
		int n = s.length();
		int balance = 0;
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '*')
				balance++;
			else if (--balance == -1)
				return false;
		}
		balance = 0;
		for (int i = n - 1; i >= 0; --i) {
			char ch = s.charAt(i);
			if (ch == ')' || ch == '*')
				balance++;
			else if (--balance == -1)
				return false;
		}
		return true;
	}
}
