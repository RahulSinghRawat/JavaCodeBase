package com.matrix.rahul;

public class SiftBy_OneRow {
public static void main(String[] args) {
	int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	displayMatrix(mat);
	//shiftByOneRowAbove(mat);
	shiftByOneColRight(mat);
	displayMatrix(mat);
	
	
}

public static void shiftByOneRowAbove(int mat[][]) {
	int row,col,temp;
	for(row=0;row<mat.length-1;row++) {
		for(col=0;col<mat.length-1;col++) {
			temp = mat[row][col];
			mat[row][col] = mat[row+1][col];
			mat[row+1][col] = temp;
		}
	}	
}

public static void shiftByOneColRight(int mat[][]) {
	int row,col,temp;
	for(row=0;row<=mat.length-1;row++) {
		for(col=0;col<mat.length-1;col++) {
			temp = mat[row][col];
			mat[row][col] = mat[row][col+1];
			mat[row][col+1] = temp;
		}
	}
}

public static void displayMatrix(int mat[][]) 
{ 
	for (int i = 0; i <= mat.length-1; i++) 
	{ 
		for (int j = 0; j <= mat[0].length-1; j++) 
			System.out.print(" " + mat[i][j]); 

		System.out.print("\n"); 
	} 
	System.out.print("\n"); 
} 
}
