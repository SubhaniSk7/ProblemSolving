package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PalindromePartitioning {
	public static boolean[][] pal;

	public static ArrayList<ArrayList<String>> result = new ArrayList<>();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		pal = new boolean[n][n];
		String s = br.readLine();
		int res = pp_recursive(s, 0, n - 1);
		System.out.println(res);
		print(n);
	}

	public static ArrayList<ArrayList<String>> partition(String a) {

		return result;
	}

	public static void print(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(pal[i][j] + " ");
			System.out.println();
		}
	}

	public static int pp_recursive(String s, int i, int j) {
		if (i > j) {
			pal[i][j] = false;
			return 0;
		}
		if (isPalindrome(s, i, j)) {
			pal[i][j] = true;
			return 0;
		}
		int min = Integer.MAX_VALUE, temp;
		for (int k = i; k < j; ++k) {
			temp = pp_recursive(s, i, k) + 1 + pp_recursive(s, k + 1, j);
			min = Math.min(min, temp);
		}
		return min;
	}

	public static boolean isPalindrome(String s, int i, int j) {
		if (i > j)
			return false;
		if (i == j)
			return true;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
