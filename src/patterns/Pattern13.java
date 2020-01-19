package patterns;
import java.util.Scanner;

//A
//B B
//C C C
//D D D D
//E E E E E

public class Pattern13 {
    public static void main(String subhani[]) {
	System.out.println("enter Capital letter(>=A):");
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	char i, j;
	for (i = 'A'; i <= n; i++) {
	    for (j = 'A'; j <= i; j++)
		System.out.print(i + " ");
	    System.out.println();
	}

    }
}
