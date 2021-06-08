package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q58_LengthOfWord {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		int ans = 0;
		String[] str = s.split(" ");
		if (str.length != 0)
			ans = str[str.length - 1].length();
		return ans;
	}
}
