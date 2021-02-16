package codechefDSlearning;

import java.io.*;
import java.util.*;

public class DPAIRS_DistinctPairs {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
//		int[] A = new int[n], B = new int[m];
		st = new StringTokenizer(br.readLine());
		int minIndex = -1, min = Integer.MAX_VALUE, maxIndex = -1, max = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i) {
//			A[i] = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			if (min > value) {
				min = value;
				minIndex = i;
			}
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; ++i) {
//			B[i] = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			if (max < value) {
				max = value;
				maxIndex = i;
			}
		}
		solution(n, m, minIndex, maxIndex);
	}

	public static void solution(int n, int m, int minIndex, int maxIndex) {
		for (int i = 0; i < m; ++i)
			System.out.println(minIndex + " " + i);
		for (int i = 0; i < n; ++i)
			if (i != minIndex)
				System.out.println(i + " " + maxIndex);
	}
}
