package com.example.arrays;

public class ArrayConcatenation {

	public static void main(String[] args) {
		int[] arr = { 1, 2};
		
		
		int[] output = concatenatedArray(arr);
		for (int i : output) {
			System.out.println(i);
		}
		
	}

	private static int[] concatenatedArray(int[] arr) {
		int[] outputArray= new int[2*arr.length];
		for(int i =0; i < arr.length ; i++) {
			outputArray[i] = arr[i];
			outputArray[i + arr.length] = arr[i];
		}
		return outputArray;
	} 
}
