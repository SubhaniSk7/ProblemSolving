package interviewbit.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PairWithGivenDifference {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			A[i] = Integer.parseInt(st.nextToken());
		System.out.println(solve(A, B));
	}

	public static int solve(int[] A, int B) {
		if (B == 0)
			return 0;
		Arrays.parallelSort(A);
		int l = 0, r = 1;
		while (l < A.length && r < A.length) {
			System.out.println(l + " " + r + " " + A[r] + " " + A[l] + " " + (A[r] - A[l]));
			if (l != r && (A[r] - A[l] == B || A[l] - A[r] == B))
				return 1;
			else if (A[r] - A[l] < B)
				r++;
			else if (A[r] - A[l] > B)
				l++;
		}
		return 0;
	}
}
//42 369
//-533 -666 -500 169 724 478 358 -38 -536 705 -855 281 -173 961 -509 -5 942 -173 436 -609 -396 902 -847 -708 -618 421 -284 718 895 447 726 -229 538 869 912 667 -701 35 894 -297 811 322

//12 -42
//-259 -825 459 825 221 870 626 934 205 783 850 398 
