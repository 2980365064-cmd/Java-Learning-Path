package com.example;

public class QuickSortDemo {
	public static void main(String[] args) {
		int []arr={6,1,2,7,9,3,4,5,10,8,1,2,3,444,5,1,232,5454,67,87879,213,1,2323};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		long start=System.currentTimeMillis();
		quickSort(arr,0,arr.length-1);
		long end=System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//Cost time
		System.out.println("花费时间："+(end-start));
	}
	public static void quickSort (int[]arr,int i,int j){
	 int start=i;
	 int end=j;
	 if(start>end){
		 return;
	 }
	 //The first  digit is Pivot
	 int baseNumber=arr[i];
	 while (start!=end){
		while(true){
			if(end<=start||arr[end]<baseNumber){
				break;
			}
			end--;
		}
		 while(true){
			 if(end<=start||arr[start]>baseNumber){
				 break;
			 }
			 start++;
		 }
		 int temp=arr[end];
		 arr[end]=arr[start];
		 arr[start]=temp;
	 }
	 int temp=arr[i];
	 arr[i]=arr[end];
	 arr[end]=temp;
	 //Recursive call
	 quickSort(arr,i,start-1);
	 quickSort(arr,start+1,j);
	}
}
