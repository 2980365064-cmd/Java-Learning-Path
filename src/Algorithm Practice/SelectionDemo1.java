package com.example;

public class SelectionDemo1 {
	public static void main(String[] args) {
		//Create an unordered arr
		int[] arr = {2, 4, 5, 3, 1, 6, 8, 86, 32};
		//Selection sort
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j+1; i <arr.length ; i++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}