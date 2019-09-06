package com.array.rahul;

import java.util.PriorityQueue;

public class KthLargestPQ {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,5,2,6};
	    // new Tes().Test(arr,2);
		System.out.println(new KthLargestPQ().findNumber(arr, 2));
		
	}
	
	public void Test(int arr[],int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : arr) {
			pq.add(i);
		}
		
		System.out.println(pq);
	}
	
	public int findNumber(int arr[],int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i : arr) {
			minHeap.add(i);
			if(minHeap.size()>k)
				minHeap.remove();
		}
		
		return minHeap.remove();
		
	}
}
