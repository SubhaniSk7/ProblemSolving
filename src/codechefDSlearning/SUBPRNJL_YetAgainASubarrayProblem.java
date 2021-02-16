package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SUBPRNJL_YetAgainASubarrayProblem {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] a = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			solution(n, k, a);
		}
	}

	public static void solution(int n, int k, int[] a) {
		int beautiful = 0;
		for (int i = 0; i < n; ++i) {
			HashMap<Integer, Integer> map = new HashMap<>();
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = i; j < n; ++j) {
				int m = (int) Math.ceil((double) k / (j - i + 1));
				map.put(a[j], map.getOrDefault(a[j], 0) + 1);
				int index = Collections.binarySearch(list, a[j]);
				if (index < 0)
					index = ~index;
				list.add(index, a[j]);
				int Bk = (k - 1) / m;
				if (map.containsKey(map.get(list.get(Bk))))
					beautiful++;
//				System.out.println(a[j] + " m:" + m + " Bk:" + Bk + " ::" + list.get(Bk));
//				System.out.println(list.toString());
//				System.out.println(map.toString());
//				System.out.println("contains:-->" + map.get(list.get(Bk)) + " -->" + beautiful);
//				System.out.println();
			}
//			System.out.println("--------------------------");
		}
		System.out.println(beautiful);
	}
}
//1
//3 3
//1 2 3