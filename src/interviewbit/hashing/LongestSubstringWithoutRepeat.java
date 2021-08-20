package interviewbit.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(solve(A));
	}

	public static int solve(String A) {
		int n = A.length();
		HashMap<Character, Integer> map = new HashMap<>();
		int st = 0, startMax = 0, curLen = 1, maxLen = 0, i = 0;
		for (i = 0; i < n; ++i) {
			char ch = A.charAt(i);
			if (map.containsKey(ch)) {
				if (map.get(ch) >= st) {
					curLen = i - st;
					if (maxLen < curLen) {
						maxLen = curLen;
						startMax = st;
					}
					st = map.get(ch) + 1;
				}
			}
			map.put(ch, i);
		}
		if (maxLen < i - st)
			maxLen = i - st;
		return maxLen;
	}
}
