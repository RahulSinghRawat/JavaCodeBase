package com.matrix.rahul;

public class MatrixDigonalDiff {
	
public static void main(String[] args) {
	int[][] arr =    {{1,2,3,4},
			          {5,6,7,8},
			          {4,3,2,1},
			          {8,7,6,5}};
	int i;
	int j;
	int row = arr.length;
	int col = arr[0].length;
	int first_Diagonal = 0;
	int sec_Diagonal = 0;
	
	System.out.println("row "+row);
	System.out.println("col "+col);
	
	for(i=0,j=0;i<row && j<col;i++,j++) {
		first_Diagonal = first_Diagonal + arr[i][j];
	}
	
	System.out.println("first_Diagonal "+first_Diagonal);
	
	for(i=row-1,j=1;i<row && j<col;i--,j++) {
		sec_Diagonal = sec_Diagonal + arr[i][j];
	}
	
	System.out.println("sec_Digonal "+sec_Diagonal);
	
	System.out.println("Digonal Difference "+ (first_Diagonal-sec_Diagonal));
	
}
}
