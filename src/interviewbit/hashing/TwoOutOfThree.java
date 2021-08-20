package interviewbit.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class TwoOutOfThree {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken()),
				n3 = Integer.parseInt(st.nextToken());
		int[] A = new int[n1], B = new int[n2], C = new int[n3];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n1; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n2; ++i)
			B[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n3; ++i)
			C[i] = Integer.parseInt(st.nextToken());
		int[] result = solve(A, B, C);
	}

	public static int[] solve(int[] A, int[] B, int[] C) {
		HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>(), m2 = new HashMap<Integer, Integer>(),
				m3 = new HashMap<Integer, Integer>();
		int n1 = A.length, n2 = B.length, n3 = C.length;
		for (int i = 0; i < n1; ++i)
			m1.put(A[i], m1.getOrDefault(A[i], 0) + 1);
		for (int i = 0; i < n2; ++i)
			m2.put(B[i], m2.getOrDefault(B[i], 0) + 1);
		for (int i = 0; i < n3; ++i)
			m3.put(C[i], m3.getOrDefault(C[i], 0) + 1);

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 100005; ++i) {
			boolean h12 = m1.containsKey(i) && m2.containsKey(i);
			boolean h13 = m1.containsKey(i) && m3.containsKey(i);
			boolean h23 = m2.containsKey(i) && m3.containsKey(i);
			if (h12 || h13 || h23)
				al.add(i);
		}

		int[] result = new int[al.size()];
		Collections.sort(al);
		int i = 0;
		for (int a : al)
			result[i++] = a;
		return result;
	}
}
