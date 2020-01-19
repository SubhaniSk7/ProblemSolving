package patterns;
import java.util.Scanner;

//    1
//   121
//  12321
// 1234321
//123454321

public class Pattern45 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = 1; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = i - 1; k >= -(i - 1); k--) {
		System.out.print(i - Math.abs(k));
	    }
	    System.out.println();
	}
    }
}
