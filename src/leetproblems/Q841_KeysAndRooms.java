package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q841_KeysAndRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		boolean[] visited = new boolean[rooms.size()];
		ArrayList<Integer> keys = new ArrayList<>(rooms.get(0));
		int n = keys.size(), count = 0;
		visited[0] = true;
		count++;
		for (int i = 0; i < n; ++i) {
			int k = keys.get(i);
			if (!visited[k]) {
				count++;
				keys.addAll(rooms.get(k));
				n += rooms.get(k).size();
				visited[k] = true;
			}
		}
		if (count == rooms.size())
			return true;
		return false;
	}
}
