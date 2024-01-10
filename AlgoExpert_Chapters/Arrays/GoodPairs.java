package com.example.arrays;

// A good pair in a array is a pair of indices (i,j) such that nums[i] == nums[j] and i <j

public class GoodPairs {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 1, 3 };
		int goodPairs = findGoodpairs(nums);
		System.out.println("Good Pairs Count "+goodPairs);
	}

	private static int findGoodpairs(int[] nums) {
		int count=0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
