package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class P1352A_SumOfRoundNumbers {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		int count = 0, place = 1;
		ArrayList<Integer> rounds = new ArrayList<>();
		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			if (rem != 0) {
				rounds.add(rem * place);
				count++;//
			}
			place *= 10;
		}
		System.out.println(count); // or rounds.length
		Iterator<Integer> itr = rounds.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
	}
}
