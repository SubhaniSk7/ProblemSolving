package patterns;
import java.util.Scanner;

//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1

public class Pattern20 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = 5; i > 0; i--) {
	    for (j = 1; j <= i; j++)
		System.out.print(i + " ");
	    System.out.println();
	}
    }
}
