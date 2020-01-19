package patterns;
import java.util.Scanner;

//*****
//****
//***
//**
//*

public class Pattern15 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = n; i > 0; i--) {
	    for (j = 1; j <= i; j++)
		System.out.print("*");
	    System.out.println();
	}
    }
}
