package com.example;

public class InsertDemo1 {
	public static void main(String[] args) {
		//Create an unordered arr
		int []arr={2,4,5,3,1,6,8,86,32};
		int startIndex=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[i+1]){
				startIndex=i+1;
				break;
			}
		}
		System.out.println(startIndex);
		for (int i = startIndex; i < arr.length; i++) {
			int j=i;
			while(j>0&&arr[j]<arr[j-1]){
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
}
