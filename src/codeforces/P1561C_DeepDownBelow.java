package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Pair {
	int monesters, maxPower;

	public Pair(int maxPower, int monesters) {
		this.maxPower = maxPower;
		this.monesters = monesters;
	}

	@Override
	public String toString() {
		return "[" + this.maxPower + "," + this.monesters + "]";
	}
}

public class P1561C_DeepDownBelow {

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Pair> al = new ArrayList<>();
			for (int i = 1; i <= n; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int monesters = Integer.parseInt(st.nextToken());
				int max = 0;
				for (int j = 0; j < monesters; ++j) {
					int power = Integer.parseInt(st.nextToken());
					max = Math.max(max, power - j + 1);
				}
				al.add(new Pair(max, monesters));
			}

			Comparator c = new Comparator<Pair>() {
				@Override
				public int compare(Pair p1, Pair p2) {
					int firstComp = Integer.valueOf(p1.maxPower).compareTo(Integer.valueOf(p2.maxPower));
					int secondComp = Integer.valueOf(p1.monesters).compareTo(Integer.valueOf(p2.monesters));
					return firstComp == 0 ? secondComp : firstComp;
				}
			};
			Collections.sort(al, c);
//			System.out.println(al.toString());
			solve(n, al);
		}
	}

	public static void solve(int n, ArrayList<Pair> al) {
		int prevCount = 0, cur = al.get(0).maxPower, ans = cur;
		for (int i = 1; i < n; ++i) {
			cur += al.get(i - 1).monesters;
			prevCount += al.get(i - 1).monesters;
			if (cur >= al.get(i).maxPower)
				continue;

			ans = al.get(i).maxPower - prevCount;
			cur = ans + prevCount;
		}
		System.out.println(ans);
	}
}
