package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step2_SegmentWithSmallSpread {
	public static long k;
	public static MyStack s1 = new MyStack(), s2 = new MyStack();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long[] a = new long[n];
		for (int i = 0; i < n; ++i)
			a[i] = Long.parseLong(st.nextToken());
		solve(n, a);
	}

	public static void solve(int n, long[] a) {
		int l = 0;
		long res = 0;
		for (int r = 0; r < n; ++r) {
			add(a[r]);
			while (!good()) {
				remove();
				l++;
			}
			res += r - l + 1;
		}
		System.out.println(res);
	}

	public static boolean good() {
		long min = Math.min(s1.min(), s2.min()), max = Math.max(s1.max(), s2.max());
		return (max - min) <= k;
	}

	public static void add(long x) {
		s2.push(x);
	}

	public static void remove() {
		if (s1.isEmpty()) {
			while (!s2.isEmpty())
				s1.push(s2.pop());
		}
		s1.pop();
	}
}

class MyStack {
	Stack<Long> s = new Stack<>();
	Stack<Long> smin = new Stack<>(), smax = new Stack<>();

	public MyStack() {
		this.smin.push(Long.MAX_VALUE);
		this.smax.push(Long.MIN_VALUE);
	}

	public void push(long x) {
		this.s.push(x);
		this.smin.push(Math.min(smin.peek(), x));
		this.smax.push(Math.max(smax.peek(), x));
	}

	public long pop() {
		long val = s.pop();
		this.smin.pop();
		this.smax.pop();
		return val;
	}

	public boolean isEmpty() {
		return this.s.isEmpty();
	}

	public long min() {
		return this.smin.peek();
	}

	public long max() {
		return this.smax.peek();
	}
}