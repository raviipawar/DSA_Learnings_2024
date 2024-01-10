package com.example.arrays;

public class TwoNumSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int targetSum = 9;

		int[] output = findNumbers(arr, targetSum);
		for (int i : output) {
			System.out.println(i);
		}
		
	}

	private static int[] findNumbers(int[] arr, int targetSum) {
		for (int i = 0; i < arr.length - 1; i++) {
			int firstNumber = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int secNumber = arr[j];
				if (targetSum == firstNumber + secNumber) {
					return new int[] { firstNumber, secNumber };
				}
			}
		}
		return new int[0];
	}

}
