package hr.general;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);

		String time = sc.next();
		if (time.contains("AM")) {
			if (time.substring(0, 2).contains("12")) {
				time = "00" + time.substring(2, 8);
			}
			time = time.substring(0, 8);
		}
		if (time.contains("PM")) {
			if (time.substring(0, 2).contains("12")) {
				time = "12" + time.substring(2, 8);
			} else
				time = time.substring(0, 2).replace(time.substring(0, 2),
						"" + (Integer.parseInt(time.substring(0, 2)) + 12))
						+ time.substring(2, 8);
		}
		System.out.println(time);
	}
}
