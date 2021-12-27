package codechef.nov2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FLOW017_SecondLargest {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int first = 0, second = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; ++i) {
				int v = Integer.parseInt(st.nextToken());
				if (first < v) {
					second = first;
					first = v;
				} else if (second < v) {
					second = v;
				}
			}
			System.out.println(second);
		}
	}
}
