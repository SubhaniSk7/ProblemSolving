package leetproblems.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class GroupAnagrams {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), i = 0;
		String[] strs = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			strs[i++] = st.nextToken();
		groupAnagrams(strs);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		int n = strs.length;
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String sorted = String.valueOf(ch);
			ArrayList<String> al = map.getOrDefault(sorted, new ArrayList<String>());
			al.add(s);
			map.put(sorted, al);
		}

		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, ArrayList<String>> entry = (Map.Entry<String, ArrayList<String>>) itr.next();
			result.add(entry.getValue());
		}
		return result;
	}
}
//6
//eat tea tan ate nat bat
