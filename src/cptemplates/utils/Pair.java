package cptemplates.utils;

public class Pair {
	public int x;
	public int y;
	public int z;

	public Pair(int a, int b) {
		x = a;
		y = b;
	}

	public Pair(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	@Override
	public String toString() {
		return "[" + x + " " + y + " " + z + "]";
	}

	public int compareTo(Pair o) {
		return x - o.x;
	}
}
