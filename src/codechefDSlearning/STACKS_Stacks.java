package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class STACKS_Stacks {
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
			int disk = rad.get(i);
			int index = binarySearch(stacks, disk);
			if (index == -1) {
				stacks.add(disk);
			} else
				stacks.set(index, disk);
		}
		System.out.print(stacks.size() + " ");
		for (int x : stacks)
			System.out.print(x + " ");
		System.out.println();
	}

	public static int binarySearch(ArrayList<Integer> stacks, int disk) {
		int index = -1, start = 0, end = stacks.size() - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (stacks.get(mid) == disk) {
				start = mid + 1;
			} else if (stacks.get(mid) < disk) {
				start = mid + 1;
			} else {
				index = mid;
				end = mid - 1;
			}
		}
		return index;
	}
}