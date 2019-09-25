package com.matrix.rahul;

public class MatrixEquationProblem {

	public static void main(String[] args) {
		int mat1 [][] = new int[11][11];
		int mat2 [][] = new int[11][11];
		
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				mat1[i][j] = i*i + j*j;
			}
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				mat2[i][j] = i*i + j*j;
			}
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int prev_i = i;
				int prev_j = j;
				for(int k=1;k<=10; k++) {
			   
					if(mat1[i][j] == mat2[j][k]) {
					
					}
					
				}
			}
			System.out.println();
		}
	}
}
