package interviewbit.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Anagrams {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> A = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			A.add(st.nextToken());
		System.out.println(anagrams(A));
	}

	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		int n = A.size();
		LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap<>();
		for (int i = 0; i < n; ++i) {
			char[] ch = A.get(i).toCharArray();
			Arrays.parallelSort(ch);
			String s = Arrays.toString(ch);
			ArrayList<Integer> al = map.getOrDefault(s, new ArrayList<Integer>());
			al.add(i + 1);
			map.put(s, al);
		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, ArrayList<Integer>> entry = (Map.Entry<Integer, ArrayList<Integer>>) itr.next();
			result.add(entry.getValue());
		}
		return result;
	}
}
//abbbaabbbabbbbabababbbbbbbaabaaabbaaababbabbabbaababbbaaabbabaabbaabbabbbbbababbbababbbbaabababba abaaabbbabaaabbbbabaabbabaaaababbbbabbbaaaabaababbbbaaaabbbaaaabaabbaaabbaabaaabbabbaaaababbabbaa babbabbaaabbbbabaaaabaabaabbbabaabaaabbbbbbabbabababbbabaabaabbaabaabaabbaabbbabaabbbabaaaabbbbab bbbabaaabaaaaabaabaaaaaaabbabaaaabbababbabbabbaabbabaaabaabbbabbaabaabaabaaaabbabbabaaababbaababb abbbbbbbbbbbbabaabbbbabababaabaabbbababbabbabaaaabaabbabbaaabbaaaabbaabbbbbaaaabaaaaababababaabab aabbbbaaabbaabbbbabbbbbaabbababbbbababbbabaabbbbbbababaaaabbbabaabbbbabbbababbbaaabbabaaaabaaaaba abbaaababbbabbbbabababbbababbbaaaaabbbbbbaaaabbaaabbbbbbabbabbabbaabbbbaabaabbababbbaabbbaababbaa aabaaabaaaaaabbbbaabbabaaaabbaababaaabbabbaaaaababaaabaabbbabbababaabababbaabaababbaabbabbbaaabbb
