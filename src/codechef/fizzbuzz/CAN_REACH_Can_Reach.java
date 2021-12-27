package codechef.fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CAN_REACH_Can_Reach {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			solve(x, y, k);
		}
	}

	public static void solve(int x, int y, int k) {
		if (x % k == 0 && y % k == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
