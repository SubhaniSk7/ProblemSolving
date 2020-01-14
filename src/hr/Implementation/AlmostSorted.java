package hr.Implementation;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i, j, startindex = 0, endindex = 0, swap = 0, temp, flag = 0, sorted = 0,count=0,k;

		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (i > 0 && arr[i] < arr[i - 1]) {
				sorted = 1;
			}
		}

		if (sorted == 1) {
			for (i = 0; i <n-1; i++) {
				if (arr[i] > arr[i + 1]) {
					j = i + 1;
					while (j <n && arr[i] > arr[j]) {
						j++;
					}
					startindex = i;
					endindex = j - 1;
					temp = arr[startindex];
					arr[startindex] = arr[endindex];
					arr[endindex] = temp;
					swap = 1;
					break;
				}
			}
			if (swap == 1) {
				for (i = 0; i < n - 1; i++) {
					if (arr[i] > arr[i + 1]) {
						flag = 1;
						break;
					}
				}
				if (flag == 1) {
					temp = arr[startindex];
					arr[startindex] = arr[endindex];
					arr[endindex] = temp;
					
					for(i=0;i<n-1;i++){
						
						if(count==0 && arr[i]>arr[i+1]){
							startindex=i;
							endindex=i+1;
							count++;
						}
						else if(count>0 && arr[i]<arr[i+1] && arr[startindex]>arr[i]){
							endindex=i;
							count++;
						}
					}
					for(j=startindex,k=endindex;j<=(startindex+endindex)/2;j++,k--){
						temp=arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
					flag=0;
					for (i = 0; i < n - 1; i++) {
						if (arr[i] > arr[i + 1]) {
							flag = 1;
							break;
						}
					}
					if(flag==1){
						System.out.println("no");
					}else{

						System.out.println("yes\nreverse "+(startindex+1)+" "+(endindex+1));
					}
				} else {
					System.out.println("yes\nswap " + (startindex+1) + " " + (endindex+1));
				}
			}
		}
	}
}
