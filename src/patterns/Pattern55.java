package patterns;
import java.util.Scanner;

//3
//32
//321
//3210
//321
//32
//3

public class Pattern55 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = n; i >= -n; i--) {
	    for (j = n; j >= Math.abs(i); j--) {
		System.out.print(j);
	    }
	    System.out.println();
	}
    }
}
