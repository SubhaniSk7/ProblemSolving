package interviewbit.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Two2Sum {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());

		twoSum(A, B);
	}

	public static int[] twoSum(final int[] A, int B) {
		int n = A.length;
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; ++i) {
			int diff = B - A[i];
			if (map.containsKey(diff)) {
				result[0] = map.get(diff) + 1;
				result[1] = i + 1;
				return result;
			} else {
				if (!map.containsKey(A[i]))
					map.put(A[i], i);
			}
		}
		return new int[] {};
	}
}
//31 -3
//4 7 -4 2 2 2 3 -5 -3 9 -4 9 -7 7 -1 9 9 4 1 -4 -2 3 -3 -5 4 -7 7 9 -4 4 -8
