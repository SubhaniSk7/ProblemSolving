package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P25A_IQTest {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		sol(n, nums);
	}

	public static void sol(int n, int[] nums) {
		int oddCount = 0, evenCount = 0, lastOdd = -1, lastEven = -1;
		for (int i = 0; i < n; ++i) {
			if (nums[i] % 2 == 0) {
				evenCount++;
				lastEven = i + 1;
			} else {
				oddCount++;
				lastOdd = i + 1;
			}
		}
		if (evenCount == 1)
			System.out.println(lastEven);
		else if (oddCount == 1)
			System.out.println(lastOdd);
		else
			System.out.println(0);
	}
}
