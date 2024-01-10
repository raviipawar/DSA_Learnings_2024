package com.example.arrays;

import java.util.Arrays;

public class TwoNumSum2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int targetSum = 9;

		int[] output = findNumbers(arr, targetSum);
		for (int i : output) {
			System.out.println(i);
		}
		
	}

	private static int[] findNumbers(int[] arr, int targetSum) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length -1;
		while(left < right) {
			int currentSum = arr[left] + arr[right];
			if(currentSum == targetSum) {
				return new int[] {arr[left], arr[right]};
			}
			else if 
			(currentSum < targetSum) {
				left++;
			}
			else
				right--;
		}
		return new int[0];
	}

}
