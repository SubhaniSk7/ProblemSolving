package leetproblems;

import java.util.ArrayList;
import java.util.Collections;

public class Q1030_MatrixCellsInDistanceOrder {
	public static void main(String[] subhani) {
		Q1030_MatrixCellsInDistanceOrder obj = new Q1030_MatrixCellsInDistanceOrder();

		obj.allCellsDistOrder(3, 3, 1, 1);
	}

	public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
		ArrayList<PairCell> values = new ArrayList<>();
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				int distance = Math.abs(i - rCenter) + Math.abs(j - cCenter);
				values.add(new PairCell(distance, i, j));
			}
		}
//		Collections.sort(values, new Comparator<PairCell>() {
//			@Override
//			public int compare(PairCell o1, PairCell o2) {
//				Integer a = o1.distance;
//				Integer b = o2.distance;
//				return a.compareTo(b);
//			}
//		});
		Collections.sort(values);
		System.out.println(values);
		int[][] result = new int[rows * cols][2];
		for (int i = 0; i < rows * cols; ++i) {
			PairCell p = values.get(i);
			result[i][0] = p.r;
			result[i][1] = p.c;
		}
		return result;
	}
}

class PairCell implements Comparable<PairCell> {
	int distance, r, c;

	PairCell(int d, int x, int y) {
		distance = d;
		r = x;
		c = y;
	}

	@Override
	public String toString() {
		return "[" + distance + " " + r + " " + c + "]";
	}

	@Override
	public int compareTo(PairCell o) {
		return distance - o.distance;
	}
}
