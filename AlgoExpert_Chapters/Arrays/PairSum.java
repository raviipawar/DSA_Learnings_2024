package com.example.arrays;

// Count Pairs Whose Sum is Less than Target

public class PairSum {

	public static void main(String[] args) {
		int[] arr = { -1, 1, 2, 3, 1 };
		int targetSum = 2;
		// output 3

		int output = pairSum(arr, targetSum);
		System.out.println(output);
	}

	private static int pairSum(int[] arr, int targetSum) {
		int count =0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] < targetSum) {
					 count++;
				}
			}
		}
		return count;
	}
}
