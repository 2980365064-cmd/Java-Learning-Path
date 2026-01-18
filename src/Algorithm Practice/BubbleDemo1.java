package com.example;

public class BubbleDemo1 {
	public static void main(String[] args) {
	//Create an unordered arr
	int []arr={2,4,5,3,1,6,8,86,32};
	//Bubble sort
		int count= arr.length;;
		for (int j = 0; j < arr.length-1; j++) {
		for (int i = 0; i < count-1; i++) {
		  if(arr[i]>arr[i+1]){
			 int temp =arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		  }
		}
		count--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
