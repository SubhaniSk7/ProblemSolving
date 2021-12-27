package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QHOUSE_BearAndHouseQueries {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		int square_side = binarySearch_0(0, 0) * 2;
		int area_square = square_side * square_side;

		int tri_top = binarySearch_1(square_side);
		int height = tri_top - square_side;

		int base = binarySearch_0(0, square_side) * 2;
		int area_triangle = height * base / 2;

		int total = area_square + area_triangle;
		System.out.println("! " + total);
	}

	public static int binarySearch_0(int start, int y) throws IOException {
		int cord = 0, end = 1000;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println("? " + mid + " " + y);
			String answer = br.readLine();
			if (answer.equals("YES")) {
				cord = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return cord;
	}

	public static int binarySearch_1(int start) throws IOException {
		int cord = 0, end = 1000;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println("? " + 0 + " " + mid);
			String answer = br.readLine();
			if (answer.equals("YES")) {
				cord = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return cord;
	}

}
