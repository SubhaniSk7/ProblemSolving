package patterns;
import java.util.Scanner;

//*
//**
//***
//****
//*****

public class Pattern10 {
    public static void main(String subhani[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i, j;
	for (i = 1; i <= n; i++) {
	    for (j = 1; j <= i; j++)
		System.out.print("*");
	    System.out.println();
	}
    }
}
