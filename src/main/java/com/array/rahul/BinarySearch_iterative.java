package com.array.rahul;

class BinarySearch_iterative {
	static int binSearch(int[] A, int key) {

		int low = 0;
		int high = A.length - 1;

		while (low <= high) {

			int mid = low + ((high - low) / 2);

			if (A[mid] == key) {
				return mid;
			}

			if (key < A[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100 };
		System.out.println("Key(12) found at: " + binSearch(arr1, 12));
		System.out.println("Key(44) found at: " + binSearch(arr1, 44));
		System.out.println("Key(80) found at: " + binSearch(arr1, 80));
	}
}