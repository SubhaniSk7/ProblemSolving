package patterns;
import java.util.Scanner;

public class Pattern81 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = 1; i <= n; i++) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    System.out.print("*");
	    for (j = 1; j < (i - 1) * 2; j++) {
		System.out.print(" ");
	    }
	    if (i > 1)
		System.out.print("*");
	    System.out.println();
	}
    }
}
