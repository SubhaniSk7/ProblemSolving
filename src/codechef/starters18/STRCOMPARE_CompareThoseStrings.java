package codechef.starters18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class STRCOMPARE_CompareThoseStrings {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			String A = br.readLine(), B = br.readLine();
			char[] a = A.toCharArray();
			char[] b = B.toCharArray();
			int count = 0;
			int l = 0, r = 0;
			while (l < n && r < n) {

				for (r = l; r < n; ++r) {
					if (a[r] < b[r]) {
						count += (r - l + 1);
						l = r + 1;
						break;
					} else if (a[r] > b[r]) {
						l = r + 1;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}
