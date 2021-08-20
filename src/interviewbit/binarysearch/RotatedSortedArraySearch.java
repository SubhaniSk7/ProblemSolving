package interviewbit.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RotatedSortedArraySearch {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		System.out.println(search(A, B));
	}

	public static int search(final int[] A, int B) {
		int n = A.length, start = 0, end = n - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (A[mid] == B)
				return mid;
			else if (A[start] <= A[mid]) {// left sorted
				if (A[start] <= B && B <= A[mid])
					end = mid - 1;
				else
					start = mid + 1;
			} else {// right sorted
				if (B <= A[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}
}
//8 4
//4 5 6 7 0 1 2 3

//19 202
//101 103 106 109 158 164 182 187 202 205 2 3 32 57 69 74 81 99 100
