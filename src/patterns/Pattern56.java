package patterns;
import java.util.Scanner;

// 3
// 23
// 123
// 0123
// 123
// 23
// 3

public class Pattern56 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = n; i >= -n; i--) {
	    for (j = Math.abs(i); j <= n; j++) {
		System.out.print(j);
	    }
	    System.out.println();
	}
    }
}
