package patterns;
import java.util.Scanner;

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 
// 4 4 4 4 
//  3 3 3 
//   2 2 
//    1

public class Pattern76 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;
	// Top Pyramid
	for (i = 1; i <= n; i++) {
	    for (j = i; j < n; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print(i + " ");
	    }
	    System.out.println();
	}
	// for Bottom pyramid
	for (i = n - 1; i > 0; i--) {
	    for (j = i; j <= n - 1; j++) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= i; k++) {
		System.out.print(i + " ");
	    }
	    System.out.println();
	}
    }
}
