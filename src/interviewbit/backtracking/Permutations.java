package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = s.length();

		permute(s, 0, n - 1);
	}

	public static void permute(String s, int l, int r) {

		if (l == r) {
			System.out.println(s);
			return;
		}
		for (int i = l; i <= r; ++i) {
			s = swap(s, l, i);
			permute(s, l + 1, r);
			s = swap(s, l, i);
		}
	}

	public static String swap(String s, int x, int y) {
		char[] arr = s.toCharArray();
		char ch = arr[x];
		arr[x] = arr[y];
		arr[y] = ch;
		return String.valueOf(arr);
	}
}
