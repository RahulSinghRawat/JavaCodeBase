package com.matrix.rahul;

public class Rotatematrix90Without_Inplace {
	
	static void displayMatrix(int mat[][]) 
	{ 
		for (int i = 0; i <= mat.length-1; i++) 
		{ 
			for (int j = 0; j <= mat[0].length-1; j++) 
				System.out.print(" " + mat[i][j]); 
	
			System.out.print("\n"); 
		} 
		System.out.print("\n"); 
	} 

	public static void roatatematrix(int mat[][]) {
		int col = 0;
		int row = 0;
		for (col = mat[0].length - 1; col >= 0; col--) {
		  for (row = 0; row <= mat.length - 1; row++) {
			System.out.print(mat[row][col]+" ");
		 }
		  System.out.println();
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int N = 4;

		// Test Case 1
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		displayMatrix(mat);
		roatatematrix(mat);
	}
}
