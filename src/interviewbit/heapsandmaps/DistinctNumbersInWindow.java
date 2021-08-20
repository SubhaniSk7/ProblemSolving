package interviewbit.heapsandmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DistinctNumbersInWindow {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		int[] result = window(A, K);
	}

	public static int[] window(int[] A, int B) {
		int n = A.length, i;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> res = new ArrayList<>();
		for (i = 0; i < B; ++i)
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		res.add(map.keySet().size());
		for (i = B; i < n; ++i) {
			map.put(A[i - B], map.getOrDefault(A[i - B], 0) - 1);
			if (map.get(A[i - B]) == 0)
				map.remove(A[i - B]);
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
			res.add(map.keySet().size());
		}
		int[] result = new int[res.size()];
		i = 0;
		for (int r : res)
			result[i++] = r;
		System.out.println(res.toString());
		return result;
	}
}
