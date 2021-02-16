package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1296A_ArrayWithOddSum {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solution(n, arr);
		}
	}

	public static void solution(int n, int[] arr) {
		int oddCount = 0, evenCount = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		if (oddCount == 0)
			System.out.println("NO");
		else if (evenCount == 0 && oddCount % 2 == 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
