package com.example.arrays;

public class ArrayFromPermutation {

	public static void main(String[] args) {
		int[] arr = {1,2,3};

		int[] output = permutedArray(arr);
		for (int i : output) {
			System.out.println(i);
		}
	}

	public static int[] permutedArray(int[] arr) {
		int[] outputArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && arr[i] < arr.length) {
				outputArray[i] = arr[arr[i]];
			}
		}
		return outputArray;
	}
}
