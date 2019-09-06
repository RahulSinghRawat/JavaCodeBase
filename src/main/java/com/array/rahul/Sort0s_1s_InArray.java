package com.array.rahul;

public class Sort0s_1s_InArray {

	public static void main(String[] args) {
		int arr[] = {0,0,0,1,0,0,1,1,0};
		sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"-");
		}
	}
	
	public static void sort(int arr[]) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				count++;
		}
		
		for(int j=0;j<count;j++) {
			arr[j] = 0;
		}
		
		for(int k=count;k<arr.length;k++) {
			arr[k] = 1;
		}
			
	}
	
}
