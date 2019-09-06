package com.maths.rahul;

import java.util.HashSet;
import java.util.Set;

public class PrimeFactorsOfNumber {
public static void main(String[] args) {
	System.out.println(findPrimeFactors(12));
}

public static Set<Integer> findPrimeFactors(int number){
	
	Set<Integer> set = new HashSet<>();
	
	for(int i=2;i<=number;i++) {
		if(number%i == 0) {
			set.add(i);
			number = number/i;
			i--;
		}	
	}
	return set;
}

}
