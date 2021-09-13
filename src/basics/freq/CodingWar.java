package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodingWar {
	public static int n;
	public static int[] nums;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		solve();
	}

	public static void solve() {
		int count = 0;
		for (int i = 0; i < n - 2; ++i)
			for (int j = i + 1; j < n - 1; ++j)
				for (int k = j + 1; k < n; ++k) {
					int a = nums[i], b = nums[j], c = nums[k];
					if ((a < b && b < c) || (a > b && b > c))
						count++;
				}
		System.out.println(count);
	}

	public static void solve_1() {
		int[] greater = new int[n];
		int[] less = new int[n];
		for (int i = n - 2; i >= 0; --i) {
			for (int j = i + 1; j < n; ++j) {
				if (nums[i] < nums[j])
					greater[i]++;
				else
					less[i]++;
			}
		}
		int ans = 0;
		for (int i = 0; i < n - 2; ++i) {
			for (int j = i + 1; j < n - 1; ++j) {
				if (nums[i] < nums[j])
					ans += greater[j];
				else
					ans += less[j];
			}
		}
		System.out.println(ans);
	}

	public int numTeams(int[] ar) {
		int n = ar.length;
		int dp1[] = new int[n];
		int dp2[] = new int[n];
		int count = 0;
		for (int i = 0; i < n - 2; i++)
			for (int j = i + 1; j < n - 1; j++) {
				if (ar[i] < ar[j])
					count += dp1[j];
				else
					count += dp2[j];
			}
		return count;
	}
}
