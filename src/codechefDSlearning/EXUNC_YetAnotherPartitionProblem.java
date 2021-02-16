package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class EXUNC_YetAnotherPartitionProblem {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		int[][] operations = new int[q][3];
		for (int i = 0; i < q; ++i) {
			st = new StringTokenizer(br.readLine());
			operations[i][0] = Integer.parseInt(st.nextToken());
			operations[i][1] = Integer.parseInt(st.nextToken());
			if (operations[i][0] == 1)
				operations[i][2] = Integer.parseInt(st.nextToken());
			else
				operations[i][2] = 0;
		}
		solution(n, q, a, operations);
	}

	public static void solution(int n, int q, int[] a, int[][] operations) {
		TreeSet<Integer> partitions = new TreeSet<>();
		partitions.add(1);
		for (int i = 1; i < n; ++i)
			if (a[i] % a[i - 1] != 0)
				partitions.add(i + 1);

		for (int i = 0; i < q; ++i) {
			int type = operations[i][0];
			int ind = operations[i][1] - 1;
			if (type == 1) {
				a[ind] = operations[i][2];
				if (ind + 1 < n && a[ind + 1] % a[ind] == 0)
					partitions.remove(ind + 2);
				else if (ind + 1 < n && a[ind + 1] % a[ind] != 0)
					partitions.add(ind + 2);

				if (ind - 1 > -1 && a[ind] % a[ind - 1] == 0)
					partitions.remove(ind + 1);
				else if (ind - 1 > -1 && a[ind] % a[ind - 1] != 0)
					partitions.add(ind + 1);
			} else {
				int lower = partitions.floor(ind + 1);
				System.out.println(lower);
			}
		}
	}
}
