package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q28_ImplementStrstr {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String haystack = st.nextToken(), needle = st.nextToken();
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
}
