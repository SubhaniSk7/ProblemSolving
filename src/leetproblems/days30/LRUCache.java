package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class LRUCache {
	HashMap<Integer, Integer> map;
	HashSet<Integer> hs;
	int size;

	public LRUCache(int capacity) {
		map = new LinkedHashMap<Integer, Integer>(capacity);
		hs = new LinkedHashSet<>();
		size = capacity;
	}

	public int get(int key) {
		int val = map.getOrDefault(key, -1);
		if (val == -1)
			return -1;
		hs.remove(key);
		hs.add(key);
		return val;
	}

	public void put(int key, int value) {
		if (map.getOrDefault(key, -1) != -1) {
			hs.remove(key);
		} else {
			if (map.size() == size) {
				int e = hs.iterator().next();
				hs.remove(e);
				map.remove(e);
			}
		}
		hs.add(key);
		map.put(key, value);
	}

	public static void main(String[] subhani) throws NumberFormatException, IOException {
		LRUCache obj = new LRUCache(0);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> command = new ArrayList<>();
		while (st.hasMoreTokens())
			command.add(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (String s : command) {
			if (s.equals("LRUCache"))
				obj = new LRUCache(Integer.parseInt(st.nextToken()));
			else if (s.equals("put"))
				obj.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			else if (s.equals("get"))
				System.out.println(obj.get(Integer.parseInt(st.nextToken())));
		}
	}
}

//LRUCache put put get put get put get get get
//2 1 1 2 2 1 3 3 2 4 4 1 3 4
