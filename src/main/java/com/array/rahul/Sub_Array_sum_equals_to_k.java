package com.array.rahul;

import java.util.HashMap;

public class Sub_Array_sum_equals_to_k {

	public static void main(String[] args) {
		int nums [] = {1,2,3,4,1};
		Sub_Array_sum_equals_to_k obj = new Sub_Array_sum_equals_to_k();
		System.out.println(obj.subarraySum(nums, 3));
	}
	
	 public int subarraySum(int[] nums, int k) {
	        int count = 0, sum = 0;
	        HashMap < Integer, Integer > map = new HashMap < > ();
	        map.put(0, 1);
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (map.containsKey(sum - k))
	                count += map.get(sum - k);
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return count;
	    }
}

   

