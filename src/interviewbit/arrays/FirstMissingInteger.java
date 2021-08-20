package interviewbit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FirstMissingInteger {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		System.out.println(firstMissingPositive(A, n));
	}

	public static int firstMissingPositive(int[] A, int n) {
		int max = Integer.MIN_VALUE;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; ++i) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
			max = Integer.max(max, A[i]);
		}
		if (max <= 0)
			return 1;
		for (int i = 1; i <= max; ++i) {
			if (map.getOrDefault(i, 0) == 0)
				return i;
		}
		return max + 1;

	}
}
