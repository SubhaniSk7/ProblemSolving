package gfg.PracticeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class AllBinaryStrings {

	public static void main(String subhani[]) throws NumberFormatException, IOException, InterruptedException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {

			String str = br.readLine();

			Queue<String> q = new PriorityQueue<String>();

			q.add(str);

			while (!q.isEmpty()) {
				String s = q.poll();
				if (s.contains("?")) {
					char[] ch = s.toCharArray();
					for (int i = 0; i < ch.length; i++) {
						if (ch[i] == '?') {
							ch[i] = '0';
							q.add(String.copyValueOf(ch));
							ch[i] = '1';
							q.add(String.copyValueOf(ch));
							break;
						} else
							continue;
					}
				} else
					System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
