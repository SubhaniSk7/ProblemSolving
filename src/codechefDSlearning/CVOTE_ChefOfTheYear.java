package codechefDSlearning;

import java.io.*;
import java.util.*;

public class CVOTE_ChefOfTheYear {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		HashMap<String, String> chefs = new HashMap<String, String>();
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			chefs.put(st.nextToken(), st.nextToken());
		}
		String[] votes = new String[m];
		for (int i = 0; i < m; ++i)
			votes[i] = br.readLine();
		solution(n, m, chefs, votes);
	}

	public static void solution(int n, int m, HashMap<String, String> chefs, String[] votes) {
		HashMap<String, Integer> chefVote = new HashMap<String, Integer>(),
				countryVote = new HashMap<String, Integer>();
		for (int i = 0; i < m; ++i) {
			String v = votes[i];
			if (chefVote.containsKey(v))
				chefVote.put(v, chefVote.get(v) + 1);
			else
				chefVote.put(v, 1);
			String country = chefs.get(v);
			if (countryVote.containsKey(country))
				countryVote.put(country, countryVote.get(country) + 1);
			else
				countryVote.put(country, 1);
		}
		answer(countryVote);
		answer(chefVote);
	}

	public static void answer(HashMap<String, Integer> map) {
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		int max = Integer.MIN_VALUE;
		String name = "";
		ArrayList<String> names = new ArrayList<>();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			int value = entry.getValue();
			name = entry.getKey();
			if (value > max) {
				max = value;
				names.clear();
				names.add(name);
			} else if (value == max)
				names.add(name);
		}
		Collections.sort(names);
		System.out.println(names.get(0));
	}
}
