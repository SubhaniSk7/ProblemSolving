package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class IC_STACKS_Stacks {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> rad = new ArrayList<>();
			for (int i = 0; i < n; ++i) {
				int ele = Integer.parseInt(st.nextToken());
				rad.add(ele);
			}
			sol(n, rad);
		}
	}

	public static void sol(int n, ArrayList<Integer> rad) {
		ArrayList<Integer> stacks = new ArrayList<Integer>();
		stacks.add(rad.get(0));
		for (int i = 1; i < n; ++i) {
			boolean inserted = false;
			int ind = Collections.binarySearch(stacks, rad.get(i));
			System.out.println("__" + ind + " " + (~ind));
			if (ind < 0)
				ind = ~ind;
			else {
				if (stacks.get(ind) == rad.get(i)) {
					stacks.add(ind + 1, rad.get(i));
				} else {
					if (stacks.get(ind - 1) != rad.get(i) && stacks.get(ind - 1) > rad.get(i))
						stacks.set(ind - 1, rad.get(i));
					stacks.add(ind, rad.get(i));
				}
			}
			System.out.println(stacks.toString());
		}

//		Collections.sort(stacks);
//		System.out.print(stacks.size() + " ");
//		for (int i = 0; i < stacks.size(); ++i)
//			System.out.print(stacks.get(i) + " ");
//		System.out.println();
	}
}