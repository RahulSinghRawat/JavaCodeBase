package com.DP.rahul;

public class CountAllPossiblePath {

	// M x N matrix
	private static final int M = 3;
	private static final int N = 3;

	// Top-down recursive function to count all paths from the cell (m,n)
	// to the last cell (N-1,M-1) in a given M x N rectangular grid
	public static int countPaths(int m, int n) {
		// there is only one way to reach the last cell
		// when we're at the last row or the last column
		if (m == M - 1 || n == N - 1)
			return 1;

		return countPaths(m + 1, n) // move down
				+ countPaths(m, n + 1); // move right
	}

	public static void main(String[] args) {
		int k = countPaths(0, 0);
		System.out.println("Total number of paths are: " + k);
	}
}