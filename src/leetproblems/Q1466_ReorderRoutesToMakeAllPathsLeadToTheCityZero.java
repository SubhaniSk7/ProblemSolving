package leetproblems;

import java.util.HashSet;

public class Q1466_ReorderRoutesToMakeAllPathsLeadToTheCityZero {
//	ArrayList<Set<Integer>> edges = new ArrayList<>();
//	ArrayList<Set<Integer>> in = new ArrayList<>();
//	int result = 0;
//
//	public int minReorder(int n, int[][] connections) {
//		for (int i = 0; i < n; ++i) {
//			edges.add(new HashSet<Integer>());
//			in.add(new HashSet<Integer>());
//		}
//
//		int count = 0;
//		int[] distance = new int[n];
//		Arrays.fill(distance, Integer.MAX_VALUE);
//		distance[0] = 0;
//		for (int i = 0; i < connections.length; ++i) {
//			edges.get(connections[i][0]).add(connections[i][1]);
//			if (connections[i][1] == 0)
//				distance[connections[i][0]] = 0;
//			in.get(connections[i][1]).add(connections[i][0]);
//		}
//
//		while (!full(distance)) {
//			for (int i = 0; i < n; ++i) {
//				if (distance[i] != 0) {
//					boolean found = false;
//					for (int x : in.get(i)) {
//						if (distance[x] == 0) {
//							distance[i] = 0;
//							found = true;
//							count++;
//							break;
//						}
//					}
//					if (!found)
//						for (int x : edges.get(i)) {
//							if (distance[x] == 0) {
//								distance[i] = 0;
//								break;
//							}
//						}
//				}
//			}
//		}
//		return count;
//	}
//
//	public boolean full(int[] distance) {
//		for (int i = 0; i < distance.length; ++i)
//			if (distance[i] != 0)
//				return false;
//		return true;
//	}

	public int minReorder(int n, int[][] connections) {
		int result = 0;
		HashSet<Integer> set = new HashSet<>();
		set.add(0);
		while (set.size() != n) {
			for (int i = 0; i < connections.length; ++i) {
				int u = connections[i][0];
				int v = connections[i][1];
				if (set.contains(u) && !set.contains(v)) {
					set.add(v);
					result++;
				} else if (set.contains(v) && !set.contains(u)) {
					set.add(u);
				}
			}
		}
		return result;
	}
}
