package hr.Implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		
		int m,temp,num,counter=0;
		
		for(m=i;m<=j;m++){
			num=m;
			temp=0;
			while(num>0){
				temp=(temp*10)+(num%10);
				num=num/10;
			}
			if(Math.abs(m-temp)%k == 0)
				counter++;
		}
		System.out.println(counter);
		
	}
}
