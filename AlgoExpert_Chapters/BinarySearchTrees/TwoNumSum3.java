package com.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumSum3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int targetSum = 9;

		int[] output = findNumbers(arr, targetSum);
		for (int i : output) {
			System.out.println(i);
		}
		
	}

	private static int[] findNumbers(int[] arr, int targetSum) {
	Set<Integer> nums = new HashSet<>();
	for (int num : arr) {
		int potentialMatch = targetSum - num;
		if(nums.contains(potentialMatch)) {
			return new int[] {potentialMatch,num};
		}
		else
			nums.add(num);
	}
		return new int[0];
	}

}
