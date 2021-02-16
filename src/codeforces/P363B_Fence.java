package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P363B_Fence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] planks = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			planks[i] = Integer.parseInt(st.nextToken());
		solution(n, k, planks);
	}

	public static void solution(int n, int k, int[] planks) {
		int index = 0, sum, temp = 0, j = 0;
		for (int i = 0; i < k; i++)
			temp += planks[i];
		sum = temp;
		for (int i = k; i < n; ++i) {
			temp = temp - planks[j++] + planks[i];
			if (sum > temp) {
				sum = temp;
				index = j;
			}
		}
		System.out.println(index + 1);
	}
}
