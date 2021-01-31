package com.practice.arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 5, 9, 0 };
		findFirstDuplicateNum(arr);

	}

	private static void findFirstDuplicateNum(int[] arr) {
		outer: for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate number is " + arr[i]);
					break outer;
				}
			}
		}

	}

}
