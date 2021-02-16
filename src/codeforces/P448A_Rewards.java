package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P448A_Rewards {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[3], b = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; ++i)
			b[i] = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		solution(n, a, b);
	}

	public static void solution(int n, int[] a, int[] b) {
		int aSum = 0, bSum = 0;
		for (int i = 0; i < 3; ++i) {
			aSum += a[i];
			bSum += b[i];
		}
		n -= ((int) Math.ceil(aSum / 5.0));
		n -= ((int) Math.ceil(bSum / 10.0));
		if (n < 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
