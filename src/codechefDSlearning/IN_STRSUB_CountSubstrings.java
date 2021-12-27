package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IN_STRSUB_CountSubstrings {
	public static int[] zeroes, ones, values, answer, prefix;

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
			String s = br.readLine();
			values = new int[n];
			zeroes = new int[n];
			ones = new int[n];
			answer = new int[n];
			prefix = new int[n];
			solve(n, k, s);

			for (int i = 0; i < q; ++i) {
				st = new StringTokenizer(br.readLine());
				int l = Integer.parseInt(st.nextToken()) - 1;
				int r = Integer.parseInt(st.nextToken()) - 1;

				int val = prefix[r] - prefix[l];
				sb.append(val + "\n");
			}
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n, int k, String s) {
		Arrays.fill(zeroes, 0);
		Arrays.fill(ones, 0);
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == '0') {
				zeroes[i] = 1 + (i == 0 ? 0 : zeroes[i - 1]);
				ones[i] = (i == 0 ? 0 : ones[i - 1]);
			} else {
				zeroes[i] = (i == 0 ? 0 : zeroes[i - 1]);
				ones[i] = 1 + (i == 0 ? 0 : ones[i - 1]);
			}
		}

		for (int i = 0; i < n; ++i) {
			int temp = binarySearch(0, i, k);
			values[i] = temp;
			answer[i] = i - temp + 1;
		}
		for (int i = 0; i < n; ++i)
			prefix[i] = answer[i] + (i == 0 ? 0 : prefix[i - 1]);
	}

	public static int binarySearch(int l, int r, int k) {
		int start = l, end = r;
		int ans = end;
		int count_zeroes = 0, count_ones = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid == 0) {
				count_zeroes = zeroes[end];
				count_ones = ones[end];
			} else {
				count_zeroes = zeroes[end] - zeroes[mid - 1];
				count_ones = ones[end] - ones[mid - 1];
			}
			if (count_zeroes <= k && count_ones <= k) {
				ans = mid;
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return ans;
	}
}
