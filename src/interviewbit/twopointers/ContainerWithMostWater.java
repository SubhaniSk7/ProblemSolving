package interviewbit.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContainerWithMostWater {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			A[i] = Integer.parseInt(st.nextToken());
		System.out.println(maxArea(A));
	}

	public static int maxArea(int[] A) {
		int i = 0, j = A.length - 1;
		int area = (j - i) * Math.min(A[j], A[i]);
		while (i < j) {
			if ((j - i) * Math.min(A[j], A[i]) > area)
				area = (j - i) * Math.min(A[j], A[i]);
			if (A[i] < A[j]) {
				i++;
			} else
				j--;
		}
		return area;
	}
}
