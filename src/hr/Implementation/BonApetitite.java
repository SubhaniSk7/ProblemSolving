package hr.Implementation;

import java.util.Scanner;

public class BonApetitite {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] c=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++){
            c[i]=sc.nextInt();
            if(k==i){
                continue;
            }
            sum+=c[i];
        }
        int shared=sc.nextInt();
        if(shared>(sum/2)){
            System.out.println((shared-(sum/2)));
        }else{
            System.out.println("Bon Appetit");
        }
    }
    
}