package leetproblems;

import java.util.Arrays;

public class Q706_DesignHashMap {
	int[] map;

	public Q706_DesignHashMap() {
		map = new int[1000005];
		Arrays.fill(map, -1);
	}

	public void put(int key, int value) {
		map[key] = value;
	}

	public int get(int key) {
		return map[key];
	}

	public void remove(int key) {
		map[key] = -1;
	}
}
