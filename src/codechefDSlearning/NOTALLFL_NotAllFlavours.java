package codechefDSlearning;

import java.io.*;
import java.util.StringTokenizer;

public class NOTALLFL_NotAllFlavours {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(st.nextToken());
			solution(arr, n, k);
		}
	}

	public static void solution(int[] arr, int n, int k) {
		int maxLen = 0, uniq = 0, rInd, lInd = 0;
		int[] freq = new int[k + 1];
		for (rInd = 0; rInd < n;) {
			while (rInd < n && uniq < k) {
				if (freq[arr[rInd]] == 0)
					uniq++;
				freq[arr[rInd]]++;
				if (uniq < k)
					maxLen = Math.max(maxLen, rInd - lInd + 1);
				rInd++;
			}
			while (lInd <= rInd && uniq == k) {
				if (freq[arr[lInd]] == 1)
					uniq--;
				freq[arr[lInd]]--;
				lInd++;
			}
		}
		System.out.println(maxLen);
	}
}
