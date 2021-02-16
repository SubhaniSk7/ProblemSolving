package codechefDSlearning;

import java.io.*;
import java.util.*;

public class FENCE_Fencing {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),
					k = Integer.parseInt(st.nextToken());
			HashMap<Integer, TreeSet<Integer>> plants = new HashMap<Integer, TreeSet<Integer>>();

			for (int i = 0; i < k; ++i) {
				st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
				if (plants.containsKey(r)) {
					plants.get(r).add(c);
				} else {
					TreeSet<Integer> set = new TreeSet<Integer>();
					set.add(c);
					plants.put(r, set);
				}
			}
			solution(n, m, k, plants);
		}
	}

	public static void solution(int n, int m, int k, HashMap<Integer, TreeSet<Integer>> plants) {
		int fences = 4 * k;
		for (int row : plants.keySet()) {
			Set<Integer> columns = plants.get(row);
			Iterator<Integer> itr = columns.iterator();
			while (itr.hasNext()) {
				int c = itr.next();
				if (plants.containsKey(row - 1) && plants.get(row - 1).contains(c))
					fences--;
				if (plants.containsKey(row + 1) && plants.get(row + 1).contains(c))
					fences--;
				if (plants.containsKey(row) && plants.get(row).contains(c - 1))
					fences--;
				if (plants.containsKey(row) && plants.get(row).contains(c + 1))
					fences--;
			}
		}
		System.out.println(fences);
	}
}
