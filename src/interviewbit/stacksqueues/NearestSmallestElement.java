package interviewbit.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class NearestSmallestElement {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		System.out.println(prevSmaller(A));
	}

	public static int[] prevSmaller(int[] A) {// left side
		int n = A.length;
		int[] G = new int[A.length];
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < n; ++i) {
			while (!s.isEmpty() && s.peek() >= A[i])
				s.pop();
			if (s.isEmpty())
				G[i] = -1;
			else
				G[i] = s.peek();
			s.push(A[i]);
		}
		return G;
	}
}
