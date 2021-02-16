package codeforces;

import java.io.*;
import java.util.*;

public class P43A_Football {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> goals = new HashMap<String, Integer>();
		for (int i = 0; i < n; ++i) {
			String g = br.readLine();
			if (goals.containsKey(g))
				goals.put(g, goals.get(g) + 1);
			else
				goals.put(g, 1);
		}
		solution(n, goals);
	}

	public static void solution(int n, HashMap<String, Integer> goals) {
		Iterator itr = goals.entrySet().iterator();
		int max = 0;
		String team = "";
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) itr.next();
			int val = entry.getValue();
			if (val > max) {
				max = val;
				team = entry.getKey();
			}
		}
		System.out.println(team);
	}
}
