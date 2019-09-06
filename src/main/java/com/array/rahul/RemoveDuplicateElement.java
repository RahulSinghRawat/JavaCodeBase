package com.array.rahul;

public class RemoveDuplicateElement {
public static void main(String[] args) {
	int arr[] = {2,3,4,3,3,1,3,6};
	RemoveDuplicateElement Obj = new RemoveDuplicateElement();
	System.out.println(Obj.removeElement(arr, 3));
	
}

public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
}
