package com.example;

public class BinarySearchDemo1 {
	public static void main(String[] args) {
	int []arr={2,3,6,8,23,56,88};
	int number=binarySearch(arr,23);
		System.out.println(number);
	}
	//binarySearch
	public static int  binarySearch (int []arr,int number){
	 int min=0;
	 int max=arr.length-1;
	 while(true){
		 if(min>max){
			return -1;
		 }else{
			 int middle=(min+max)/2;
			 if(arr[middle]>number){
				 max=middle-1;
			 }else if(arr[middle]<number){
				 min=middle+1;
			 }else{
				 return middle;
			 }
		 }
	 }
	}
}
