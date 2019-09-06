package com.maths.rahul;

public class CheckArmstrong {
public static void main(String[] args) {
	System.out.println(isArmastrong(151));
}

public static boolean isArmastrong(int number) {
	int sum = 0;
	int origin = number;
	
	while(number != 0) {
	int rem = number % 10;
	sum = sum + (rem * rem * rem);
	number = number / 10;
	}
	
	return origin == sum?true:false;
}
}
