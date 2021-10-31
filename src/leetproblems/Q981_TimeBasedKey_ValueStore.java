package leetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Q981_TimeBasedKey_ValueStore {
	HashMap<String, TreeMap<Integer, ArrayList<String>>> map;

	// can use HashMap<String, Object> and do binary search over Object when 'get'
	public Q981_TimeBasedKey_ValueStore() {
		map = new HashMap<>();
	}

	public void set(String key, String value, int timestamp) {
		if (map.containsKey(key)) {
			if (map.get(key).containsKey(timestamp)) {
				map.get(key).get(timestamp).add(value);
			} else {
				ArrayList<String> al = new ArrayList<>();
				al.add(value);
				map.get(key).put(timestamp, al);
			}
		} else {
			TreeMap<Integer, ArrayList<String>> hm = new TreeMap<>();
			ArrayList<String> al = new ArrayList<>();
			al.add(value);
			hm.put(timestamp, al);
			map.put(key, hm);
		}
	}

	public String get(String key, int timestamp) {
		if (map.containsKey(key)) {
			if (map.get(key).floorKey(timestamp) == null)
				return "";
			int k = map.get(key).floorKey(timestamp);
			return map.get(key).get(k).get(map.get(key).get(k).size() - 1);
		}
		return "";
	}
}
