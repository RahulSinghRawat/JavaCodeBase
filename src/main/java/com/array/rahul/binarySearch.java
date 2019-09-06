package com.array.rahul;

class binarySearch {
	  static int binarySearchRec(int[] a, int key, int low, int high) {
	    if (low > high) {
	      return -1;
	    }

	    int mid = low + ((high - low) / 2);
	    if (a[mid] == key) {
	      return mid;
	    } else if (key < a[mid]) {
	      return binarySearchRec(a, key, low, mid - 1);
	    } else {
	      return binarySearchRec(a, key, mid + 1, high);
	    }
	  }
	  static int binSearch(int[] a, int key) {
	    return binarySearchRec(a, key, 0, a.length - 1);
	  }
	  
	  public static void main(String []args){
	    int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
	    System.out.println("Key(12) found at: "+binSearch(arr1,12));
	    System.out.println("Key(44) found at: "+binSearch(arr1,44));
	    System.out.println("Key(80) found at: "+binSearch(arr1,80));
	  }  
	}