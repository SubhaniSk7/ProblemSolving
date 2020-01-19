package patterns;
import java.util.Scanner;

//1 2 3 4 5
//  1 2 3 4 
//    1 2 3 
//      1 2 
//        1

public class Pattern31 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j, k;

	int z = n;
	for (i = n; i > 0; i--) {
	    for (j = n; j > i; j--) {
		System.out.print(" ");
	    }
	    for (k = 1; k <= z; k++) {
		System.out.print(k);
	    }
	    z--;
	    System.out.println();
	}
    }
}
