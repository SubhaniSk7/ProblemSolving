package patterns;
import java.util.Scanner;

//5 4 3 2 1
//5 4 3 2
//5 4 3
//5 4
//5

public class Pattern21 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = 1; i <= n; i++) {
	    for (j = n; j >= i; j--)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}