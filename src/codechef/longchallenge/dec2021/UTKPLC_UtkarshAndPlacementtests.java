package codechef.longchallenge.dec2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UTKPLC_UtkarshAndPlacementtests {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char first = st.nextToken().charAt(0), second = st.nextToken().charAt(0), third = st.nextToken().charAt(0);
			st = new StringTokenizer(br.readLine());
			char x = st.nextToken().charAt(0), y = st.nextToken().charAt(0);
			if (first == x || first == y)
				sb.append(first + "\n");
			else if (second == x || second == y)
				sb.append(second + "\n");
			else
				sb.append(third + "\n");
		}
		System.out.println(sb.toString());
	}
}
