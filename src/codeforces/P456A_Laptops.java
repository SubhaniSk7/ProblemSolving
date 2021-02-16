package codeforces;

import java.io.*;
import java.util.*;

public class P456A_Laptops {
	int price, quality;

	public P456A_Laptops(int price, int quality) {
		this.price = price;
		this.quality = quality;
	}

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<P456A_Laptops> laptops = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			P456A_Laptops pc = new P456A_Laptops(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			laptops.add(pc);
		}
		solution(n, laptops);
	}

	public static void solution(int n, ArrayList<P456A_Laptops> laptops) {
		Collections.sort(laptops, (p1, p2) -> ((Integer) p1.price).compareTo(p2.price));
		for (int i = 0; i < n - 1; ++i) {
			if (laptops.get(i).price < laptops.get(i + 1).price
					&& laptops.get(i).quality > laptops.get(i + 1).quality) {
				System.out.println("Happy Alex");
				return;
			}
		}
		System.out.println("Poor Alex");
	}
}
