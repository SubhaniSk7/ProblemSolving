package patterns;
import java.util.Scanner;

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5

public class Pattern11 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = 1; i <= n; i++) {
	    for (j = 1; j <= i; j++)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
