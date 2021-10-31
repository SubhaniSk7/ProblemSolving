package leetproblems;

public class Q1007_MinimumDominoRotationsForEqualRow {
//	public int minDominoRotations(int[] tops, int[] bottoms) {
//		int n = tops.length;
//		HashMap<Integer, Integer> map1 = new HashMap<>();
//		HashMap<Integer, Integer> map2 = new HashMap<>();
//		for (int x : tops)
//			map1.put(x, map1.getOrDefault(x, 0) + 1);
//		for (int x : bottoms)
//			map2.put(x, map2.getOrDefault(x, 0) + 1);
//		int min = Integer.MAX_VALUE;
//		for (int i = 1; i <= 6; ++i) {
//			int total = map1.getOrDefault(i, 0) + map2.getOrDefault(i, 0);
//			if (total >= n)
//				min = Math.min(min, rotate(tops, bottoms, i));
//		}
//		if (min != Integer.MAX_VALUE)
//			return min;
//		return -1;
//	}
//
//	public int rotate(int[] tops, int[] bottoms, int val) {
//		int t1 = 0, t2 = 0, n = tops.length;
//		for (int i = 0; i < n; ++i) {
//			if (tops[i] == val)
//				t1++;
//			else if (bottoms[i] == val)
//				t2++;
//		}
//
//		int b1 = 0, b2 = 0;
//		for (int i = 0; i < n; ++i) {
//			if (bottoms[i] == val)
//				b1++;
//			else if (tops[i] == val)
//				b2++;
//		}
//
//		if (t1 + t2 == n && b1 + b2 == n)
//			return t2 < b2 ? t2 : b2;
//		else if (t1 + t2 == n)
//			return t2;
//		else if (b1 + b2 == n)
//			return b2;
//		return Integer.MAX_VALUE;
//	}

	public int minDominoRotations(int[] tops, int[] bottoms) {
		int min = Math.min(rotate(tops, bottoms, tops[0]), rotate(tops, bottoms, bottoms[0]));

		min = Math.min(min, rotate(bottoms, tops, tops[0]));
		min = Math.min(min, rotate(bottoms, tops, bottoms[0]));
		return min == Integer.MAX_VALUE ? -1 : min;

	}

	public int rotate(int[] A, int[] B, int val) {
		int n = A.length, swaps = 0;
		for (int i = 0; i < n; ++i) {
			if (A[i] != val && B[i] != val)
				return Integer.MAX_VALUE;
			else if (A[i] != val)
				swaps++;
		}
		return swaps;
	}
}
