package hr.Sorting;

import java.util.Scanner;

public class FullCountingSort {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i, max = -1, j = 0;
		int[] numbers = new int[n];
		StringBuilder[] string=new StringBuilder[n];
		for (i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
			string[i]=new StringBuilder();
			string[i].append(sc.next()+"");
			if (max < numbers[i])
				max = numbers[i];
		}

		int[] count = new int[max + 1];
		for (i = 0; i < n; i++) 
			count[numbers[i]] += 1;
		for (i = 1; i < count.length; i++) 
			count[i] += count[i - 1];
		
		StringBuilder[] output=new StringBuilder[n];

		for (i = numbers.length - 1; i >= 0; i--) {
			output[count[numbers[i]] - 1]=new StringBuilder();
			if (i <= (numbers.length - 1) / 2)
				output[count[numbers[i]] - 1].append("-");
				
			else
				output[count[numbers[i]] - 1].append(string[i]);
			count[numbers[i]] -= 1;
		}
		for (i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
/*
Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i, max = -1, j = 0;
		int[] numbers = new int[n];
		String[] string=new String[n];
		for (i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
			string[i]=sc.next();
			if(i<=(n-1)/2)
				string[i]="-";
			if (max < numbers[i])
				max = numbers[i];
		}
		for (i = 0; i < 100; i++) {
			for(j=0;j<n;j++){
				if(numbers[j]==i){
					System.out.print(string[j]+" ");
				}
			}
		}
*/