package codechef.nov2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DISABLEDKING_DisabledKing {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if (n % 2 == 0)
				System.out.println(n);
			else
				System.out.println(n - 1);
		}
	}
}
