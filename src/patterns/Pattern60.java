package patterns;
import java.util.Scanner;

//   3
//  32
// 321
//3210
// 321
//  32
//   3

public class Pattern60 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k, z = n - 1;
	for (i = n; i >= -n; i--) {
	    for (j = 0; j < Math.abs(i); j++) {
		System.out.print(" ");
	    }
	    for (k = n; k >= Math.abs(i); k--) {
		System.out.print(k);
	    }
	    z--;
	    System.out.println();
	}

    }
}
