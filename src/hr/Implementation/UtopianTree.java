package hr.Implementation;

import java.util.Scanner;
public class UtopianTree {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] total=new int[t];
        int h,i,counter=0;
        for(i = 0; i < t; i++){
        	h=1;
            int n = in.nextInt();
            counter=0;
            while(n>0){
            	if(counter%2==0){
            		h*=2;
            	}else{
            		h+=1;
            	}
            	counter++;
            	n--;
            }
            total[i]=h;
        }
        for(i=0;i<t;i++){
        	System.out.println(total[i]);
        }
    }
}
