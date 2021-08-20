package interviewbit.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CheckPalindrome {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(solve(A));
	}

	public static int solve(String A) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length(); ++i) {
			int ch = A.charAt(i) - 'a';
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int odd = 0;
		for (int i = 0; i < 26; ++i) {
			if (map.getOrDefault(i, 0) % 2 != 0)
				odd++;
		}
		if (odd > 1)
			return 0;
		else
			return 1;
	}
}
