package basics.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MCM_BooleanParanthesization {
	public static int[][][] possibilities;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = s.length();
		int isTrue = 1;
//		int ways = bp_recursive(s, 0, n - 1, isTrue);
//		System.out.println(ways);

		possibilities = new int[n][n][2];// [n],[n],[true/false]
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < n; ++j)
				for (int d = 0; d < 2; ++d)
					possibilities[i][j][d] = -1;
		bp_bup(s, 0, n - 1, isTrue);
		System.out.println(possibilities[0][n - 1][isTrue]);
	}

	public static int bp_recursive(String s, int i, int j, int isTrue) {
		System.out.println(s + " " + i + " " + j);
		if (i > j)
			return 0;
		if (i == j) {
			if (isTrue == 1)
				return (s.charAt(i) == 'T') ? 1 : 0;
			else
				return (s.charAt(i) == 'F') ? 1 : 0;
		}
		int ans = 0;
		for (int k = i + 1; k < j; k += 2) {
			int leftTrue = bp_recursive(s, i, k - 1, 1);
			int leftFalse = bp_recursive(s, i, k - 1, 0);
			System.out.println("i:" + i + " k:" + k + ":" + leftTrue + " " + leftFalse);
			int rightTrue = bp_recursive(s, k + 1, j, 1);
			int rightFalse = bp_recursive(s, k + 1, j, 0);
			System.out.println("k+1:" + (k + 1) + " j:" + j + ":" + rightTrue + " " + rightFalse);

			if (s.charAt(k) == '&') {
				if (isTrue == 1)
					ans += leftTrue * rightTrue;
				else
					ans += leftTrue * rightFalse + leftFalse * rightTrue + leftFalse * rightFalse;
			}
			if (s.charAt(k) == '|') {
				if (isTrue == 1)
					ans += leftTrue * rightFalse + leftFalse * rightTrue + leftTrue * rightTrue;
				else
					ans += leftFalse * rightFalse;
			}
			if (s.charAt(k) == '^') {
				if (isTrue == 1)
					ans += leftTrue * rightFalse + leftFalse * rightTrue;
				else
					ans += leftTrue * rightTrue + leftFalse * rightFalse;
			}
		}
		return ans;
	}

	public static int bp_bup(String s, int i, int j, int isTrue) {
		if (i > j)
			return 0;
		if (i == j) {
			if (isTrue == 1)
				return (s.charAt(i) == 'T') ? 1 : 0;
			else
				return (s.charAt(i) == 'F') ? 1 : 0;
		}

		if (possibilities[i][j][isTrue] != -1)
			return possibilities[i][j][isTrue];

		int ans = 0;
		for (int k = i + 1; k < j; k += 2) {
			int leftTrue, leftFalse, rightTrue, rightFalse;
			if (possibilities[i][k - 1][1] == -1)
				leftTrue = bp_bup(s, i, k - 1, 1);
			else
				leftTrue = possibilities[i][k - 1][1];

			if (possibilities[i][k - 1][0] == -1)
				leftFalse = bp_bup(s, i, k - 1, 0);
			else
				leftFalse = possibilities[i][k - 1][0];

			if (possibilities[k + 1][j][1] == -1)
				rightTrue = bp_bup(s, k + 1, j, 1);
			else
				rightTrue = possibilities[k + 1][j][1];

			if (possibilities[k + 1][j][0] == -1)
				rightFalse = bp_bup(s, k + 1, j, 0);
			else
				rightFalse = possibilities[k + 1][j][0];

			if (s.charAt(k) == '&') {
				if (isTrue == 1)
					ans += leftTrue * rightTrue;
				else
					ans += leftTrue * rightFalse + leftFalse * rightTrue + leftFalse * rightFalse;
			}
			if (s.charAt(k) == '|') {
				if (isTrue == 1)
					ans += leftTrue * rightFalse + leftFalse * rightTrue + leftTrue * rightTrue;
				else
					ans += leftFalse * rightFalse;
			}
			if (s.charAt(k) == '^') {
				if (isTrue == 1)
					ans += leftTrue * rightFalse + leftFalse * rightTrue;
				else
					ans += leftTrue * rightTrue + leftFalse * rightFalse;
			}
			possibilities[i][j][isTrue] = ans;
		}
		return ans;
	}
}
//i/p:
//T|T&F^T
//o/p: 4
