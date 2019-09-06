package com.array.rahul;

import java.util.Arrays;

public class Kth_Missing_Number {
public static void main(String[] args) {
	int nums[] = {3,5,4,6,8,7,9,0,1};
	System.out.println(new Kth_Missing_Number().missingNumber(nums));
}


    public int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}

