package interviewbit.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ZigZagString {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		int n = Integer.parseInt(br.readLine());
		System.out.println(solve(A, n));
	}

	public static String solve(String A, int r) {
		String result = "";
		String[] arr = new String[r];
		Arrays.fill(arr, "");
		boolean up = false;
		int n = A.length(), counter = 1;
		for (int i = 0; i < n; ++i) {
			arr[counter - 1] += A.charAt(i);
			if (up)
				counter--;
			else
				counter++;
			if (counter == 1)
				up = false;
			if (counter == r)
				up = true;
		}
		for (int i = 0; i < r; ++i)
			result += arr[i];
		return result;
	}
}
