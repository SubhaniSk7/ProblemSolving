package basics.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//given array of elements, check is it possible there exists a subsets of elements whose sum=S
public class SubsetWithSum_Bitwise {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(br.readLine());
		sol(n, a, S);
	}

	public static void sol(int n, int[] a, int S) {
		// check every possibility of elements(MASK): include/Not include --> n elements
		// i.e., (1<<n) = 2^n possibilities (power set)
		for (int mask = 0; mask < (1 << n); mask++) {
			long sum_of_this_subset = 0;
			for (int i = 0; i < n; i++) {// loop the array
				if ((mask & (1 << i)) != 0) {// i-th bit set or not i.e., i-th element include/not
					sum_of_this_subset += a[i];
				}
			}
			if (sum_of_this_subset == S) {
				System.out.println("YES");
				break;
			}
		}
	}
}
