package patterns;
import java.util.Scanner;

//    1
//   321
//  54321
// 7654321
//987654321

public class Pattern40 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 1;
	for (i = 1; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = z; k >= 1; k--) {
		System.out.print(k);
	    }
	    z += 2;
	    System.out.println();
	}
    }
}
