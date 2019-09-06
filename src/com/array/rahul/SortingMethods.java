package com.array.rahul;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingMethods {

	public static void main(String[] args) {
		int nums [] = {2,4,3,5,1,6,7,8,9};
	    List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
	    //  listBubbleSort(list);
		//bubbleSort(nums);
	    selectSort(nums);
	}
	
	public static void bubbleSort(int arr[]) {
		
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("*************bubble sorting******************");
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}
	
	public static void listBubbleSort(List<Integer> list) {
		
		int temp = 0;
		int len = list.size();
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-i-1;j++) {
				
				if(list.get(j) > list.get(j+1)) {
					temp = list.get(j+1);
					list.set(j+1, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		for (Integer integer : list) {
			System.out.println(integer +"****");
		}
	}
	
	public static void selectSort(int arr[]) {
		int n = arr.length;
		int min_num=Integer.MIN_VALUE;
		int temp = 0;
		
		for(int i=0;i<n-1;i++) {
			min_num = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_num]) {
					temp = arr[j];
					arr[j] = arr[min_num];
					arr[min_num] = temp;
				}
			}
		}
		System.out.println("*************selection sorting******************");
		for(int x=0;x<n;x++) {
			System.out.println(arr[x]);
		}
	}
}
