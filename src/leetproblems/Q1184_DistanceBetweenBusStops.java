package leetproblems;

public class Q1184_DistanceBetweenBusStops {
	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int n = distance.length, clockwise = 0, total = 0;
		for (int i = 0; i < n; ++i) {
			if (start < destination && (i >= start && i < destination))
				clockwise += distance[i];
			if (start > destination && (i >= start || i < destination))
				clockwise += distance[i];
			total += distance[i];
		}
		return Math.min(clockwise, total - clockwise);
	}
}
