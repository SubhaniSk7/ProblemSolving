package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1537A_ArithmeticArray {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				sum += Long.parseLong(st.nextToken());

			long count = 0;
			if (sum == n)
				count = 0;
			else if (sum > n)
				count = sum - n;
			else
				count = 1;
			sb.append(count + "\n");
		}
		System.out.println(sb.toString());
	}
}
