package com.array.rahul;

public class Pairs_In_Arr_with_Given_sum {
	//mergeSort
	public static void main(String[] args) {
		int []arr = {1,4,2,5,2,3,1,5,3,2,3,2,1};
		int sum = 4;
		
		getpairsForGive_sum(arr,sum);
		
	}
	
	public static void getpairsForGive_sum(int arr[],int sum) {
		int l = 0;
		int r = arr.length - 1;
		
		mergeSort m = new mergeSort();
		m.sort(arr, 0, arr.length-1);
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"-");
		}*/
		
		while(l<r) {
			if(arr[l]+arr[r] == sum) {
				System.out.println("index "+l+":"+arr[l]+" index "+r+":"+arr[r]);
				l++;
				r--;
			}
			else if (arr[l]+arr[r]<sum) {
				l++;
			}else { //arr[l]+arr[r]>sum
				r--;
			}
		}
	}
}
