package interviewbit.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WoodCuttingMadeEasy {
	public static void main(String subhani[]) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			A[i] = Integer.parseInt(st.nextToken());

		System.out.println(solve(A, B));
	}

	public static int solve(int[] A, int B) throws InterruptedException {
		int result = 0;
		Arrays.sort(A);
		int n = A.length, start = 0, end = A[n - 1];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int index = Arrays.binarySearch(A, mid);
			int sum = 0, h = mid;
			if (index < 0)
				index = ~index;
			for (int i = index; i < n; ++i) {
				if (A[i] > h)
					sum += A[i] - h;
				if (sum > B) {
					start = mid + 1;
					result = mid;
					break;
				}
			}
			if (sum == B)
				return mid;
			if (sum < B)
				end = mid - 1;
		}
		return result;
	}

	public static int solve1(int[] A, int B) {
		Arrays.sort(A);
		int n = A.length, maxPos = n - 1, max = A[n - 1], H = 0;
		while (H < B) {
			H++;
			A[maxPos]--;
			for (int i = n - 1; i >= 0; --i) {
				if (A[i] > A[maxPos]) {
					A[i]--;
					H++;
				}
			}
		}
		return A[maxPos];
	}
}

//5 20
//4 42 40 26 46
