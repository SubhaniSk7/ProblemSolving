package patterns;
import java.util.Scanner;

//E D C B A
//E D C B
//E D C
//E D
//E

public class Pattern23 {
    public static void main(String subhani[]) {
	System.out.println("enter capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = n; j >= i; j--)
		System.out.print(j + " ");
	    System.out.println();
	}
    }
}
