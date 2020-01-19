package patterns;
import java.util.Scanner;

//    0
//   101
//  21012
// 3210123
//432101234

public class Pattern43 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = 1, x = 1;
	for (i = 1; i <= n; i++) {
	    for (j = 0; j < n - i; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print(Math.abs(k - x));
	    }
	    x++;
	    z += 2;
	    System.out.println();
	}
    }
}
