package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1559D1_MochaAndDianaEasy {
	public static int[][] parent;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()), m1 = Integer.parseInt(st.nextToken()),
				m2 = Integer.parseInt(st.nextToken());
		parent = new int[n + 1][n + 1];

		for (int i = 1; i <= n; ++i)
			parent[0][i] = parent[1][i] = i;

		for (int i = 1; i <= m1; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			int pu = find(0, u), pv = find(0, v);
			parent[0][pu] = pv;
		}
		for (int i = 1; i <= m2; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
			int pu = find(1, u), pv = find(1, v);
			parent[1][pu] = pv;
		}

		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		for (int i = 1; i <= n; ++i) {
			for (int j = i + 1; j <= n; ++j) {
				if (find(0, i) != find(0, j) && find(1, i) != find(1, j)) {
					ArrayList<Integer> a = new ArrayList<>();
					a.add(i);
					a.add(j);
					al.add(a);
					parent[0][find(0, i)] = find(0, j);
					parent[1][find(1, i)] = find(1, j);
				}
			}
		}
		System.out.println(al.size());
		for (int i = 0; i < al.size(); ++i) {
			ArrayList<Integer> a = al.get(i);
			for (int ele : a)
				System.out.print(ele + " ");
			System.out.println();
		}
	}

	public static int find(int id, int x) {
		while (parent[id][x] != x)
			x = parent[id][x];
		return x;
	}

	public static void print(int n) {
		for (int i = 0; i < 2; ++i) {
			for (int j = 1; j <= n; ++j)
				System.out.print(parent[i][j] + " ");
			System.out.println();
		}
	}
}
