package learn;

public class Loops {
	public static void main(String[] subhani) {

		int i = 0;
		for (; i < 11; i += 1) {
			if (i == 5)
				continue;
			System.out.println(i);
		}

		i = 0;
		while (i < 100) {
			System.out.println(i);
			i += 1;
		}

		i = 0;
		do {
			System.out.println(i);
			i += 1;
		} while (i < 11);

	}
}
