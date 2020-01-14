package hr.Implementation;

import java.util.Scanner;

public class FairRations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int B[] = new int[n];
		int i, count = 0,flag=0;

		for (i = 0; i < n; i++) {
			B[i] = in.nextInt();
		}

		for (i = 0; i < n - 1; i++) {
			if (B[i] % 2 == 1) {
				B[i] += 1;
				count++;
				if(i==0){
					B[i+1]+=1;
					count++;
				}else if(B[i-1]%2 == 1){
					B[i-1]+=1;
					count++;
				}
				else{
					B[i+1]+=1;
					count++;
				}
			}
//			for(int j=0;j<n;j++)
//				System.out.print(B[j]+" " );
//			System.out.println();
		}
		if(B[n-1]%2==1){
			B[n-1]+=1;
			count++;
			if(B[n-2]%2==1){
				B[n-2]+=1;
				count++;
			}
		}
		if(count%2==1){
			System.out.println("NO");
		}else{
			System.out.println(count);
		}
	}
}
