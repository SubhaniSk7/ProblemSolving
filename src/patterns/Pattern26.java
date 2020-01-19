package patterns;
import java.util.Scanner;

//        1
//      1 2
//    1 2 3
//  1 2 3 4
//1 2 3 4 5

public class Pattern26 {
    public static void main(String subhani[]) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	for (i = 1; i <= n; i++) {
	    for (j = n - i; j > 0; j--) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print(k);
	    }
	    System.out.println();
	}
    }
}
